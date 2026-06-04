// Go to Declaration のテスト用
// 各シンボルで Cmd+Click / Ctrl+Click して宣言にジャンプできることを確認

namespace Navigation;

model Address {
  street: string;
  city: string;
  country: string;
}

model User {
  id: int32;
  name: string;
  email: string;
  address: Address; // Address にジャンプできるか確認
}

model Order {
  id: int32;
  user: User;       // User にジャンプできるか確認
  items: OrderItem[];
  total: float32;
}

model OrderItem {
  productId: int32;
  quantity: int32;
  price: float32;
}

alias UserId = int32;   // エイリアスへのジャンプ確認

model AdminUser extends User {  // User 継承でジャンプ確認
  role: "admin" | "superadmin";
}
