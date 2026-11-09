namespace Demo;

model Widget {
  id: string;
  weight: int32;
}

enum Color {
  Red,
  Blue,
}

op getWidget(id: string): Widget;
