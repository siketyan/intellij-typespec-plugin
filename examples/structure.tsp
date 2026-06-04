// Structure View (ファイル構造ツリー) のテスト用
// エディタ右側や Project ツールウィンドウでの構造表示を確認

import "@typespec/http";
import "@typespec/rest";
import "@typespec/openapi3";

using TypeSpec.Http;
using TypeSpec.Rest;

@service({ title: "Structure View Example" })
namespace StructureExample {
  namespace Models {
    model Product {
      id: int32;
      name: string;
      price: float32;
      category: Category;
    }

    model Category {
      id: int32;
      name: string;
    }

    model Cart {
      id: string;
      items: CartItem[];
    }

    model CartItem {
      product: Product;
      quantity: int32;
    }
  }

  namespace Interfaces {
    using Models;

    @route("/products")
    interface Products {
      @get list(): Product[];
      @get read(@path id: int32): Product;
      @post create(@body body: Omit<Product, "id">): Product;
    }

    @route("/categories")
    interface Categories {
      @get list(): Category[];
      @get read(@path id: int32): Category;
    }

    @route("/cart")
    interface Carts {
      @get get(@path cartId: string): Cart;
      @post addItem(@path cartId: string, @body item: CartItem): Cart;
      @delete removeItem(@path cartId: string, @path productId: int32): Cart;
    }
  }
}
