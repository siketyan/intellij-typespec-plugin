// コードフォールディングのテスト用
// namespace / model / interface / op ブロックが折りたためることを確認

namespace Folding {
  namespace Inner {
    model DeepModel {
      field1: string;
      field2: int32;
      field3: boolean;
      nested: {
        a: string;
        b: string;
      };
    }
  }
}

model LargeModel {
  id: int32;
  createdAt: utcDateTime;
  updatedAt: utcDateTime;
  title: string;
  description: string;
  status: "active" | "inactive" | "pending";
  metadata: Record<string>;
  tags: string[];
  priority: int32;
  assignee: string;
}

interface LargeInterface {
  op1(): void;
  op2(): void;
  op3(): void;
  op4(): void;
  op5(): void;
}

union Status {
  active: "active";
  inactive: "inactive";
  pending: "pending";
  deleted: "deleted";
}
