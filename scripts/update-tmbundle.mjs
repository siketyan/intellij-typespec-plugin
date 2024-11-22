import {open, mkdir, readdir} from 'node:fs/promises';
import {dirname, join, relative} from 'node:path';
import {pipeline} from 'node:stream/promises';

import {Open} from 'unzipper';

const packageDir = './node_modules/typespec-vscode/';
const outDir = './textmate/bundles/typespec';
const sourceBaseDir = 'extension/';
const copyFiles = [
  'extension/dist/language-configuration.json',
  'extension/dist/typespec.tmLanguage',
  'extension/markdown-typespec.json',
  'extension/package.json',
];

const vsixName = (await readdir(packageDir)).find(name => name.endsWith('.vsix'));
if (!vsixName) {
  throw new Error(`Extension bundle (.vsix) file cannot be found in ${packageDir}. Did you run "npm install"?`);
}

const archive = await Open.file(join(packageDir, vsixName));

for (const file of archive.files) {
  if (copyFiles.includes(file.path)) {
    const outPath = join(outDir, relative(sourceBaseDir, file.path));
    try {
      await mkdir(dirname(outPath), {recursive: true});
    } catch {}

    const fd = await open(outPath, 'w');
    try {
      await pipeline(file.stream(), fd.createWriteStream());
    } finally {
      await fd.close();
    }
  }
}
