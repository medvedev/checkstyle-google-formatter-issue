import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@interface Parent {
  Child[] params();
}

@Target({ElementType.TYPE})
@interface Child {
  String value();
}

@Parent(
  params = {
    @Child(value = "Let's put here a really long string to demonstrate the issue. Really long.")
  }
)
public class Test {}
