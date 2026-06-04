import "@typespec/http";

using TypeSpec.Http;

@service({
  title: "Basic Example",
  version: "1.0.0",
})
namespace BasicExample;

model Pet {
  id: int32;
  name: string;
  age?: int32;
  kind: "cat" | "dog" | "bird";
}

model PetList {
  items: Pet[];
  total: int32;
}

model ErrorResponse {
  code: int32;
  message: string;
}

@route("/pets")
interface Pets {
  @get list(): PetList | ErrorResponse;
  @get read(@path id: int32): Pet | ErrorResponse;
  @post create(@body pet: Omit<Pet, "id">): Pet | ErrorResponse;
  @put update(@path id: int32, @body pet: Omit<Pet, "id">): Pet | ErrorResponse;
  @delete remove(@path id: int32): void | ErrorResponse;
}
