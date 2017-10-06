@interface Parent {
  Child[] params();
}

@interface Child {
  String value();
}

@Parent(
  params = {
    @Child(value = "Let's put here a really long string to demonstrate the issue. Really long.")
  }
)
public class Test {}
