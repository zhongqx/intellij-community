// "Create missing branches: 'A', 'AA', 'AB', and 'AC'" "true-preview"
sealed class A {}
final class AA extends A {}
sealed class AB extends A {}
non-sealed class AC extends A {}
final class ABA extends AB {}
non-sealed class ABC extends AB {}

class Test {
  void test(A a) {
    switch (a<caret>) {
    }
  }
}