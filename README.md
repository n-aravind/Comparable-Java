# Comparable-Java

- Create a new project in IntelliJ with a Main class with a main method
- Declare a Foo class with a private final String name field
- Generate a constructor and a getter
- In the main method of Main employ TDD to
- New up two Foo objects with different names
- Call the compareTo method on one of the Foo objects, it will not compile. Assert that the return value is what you expect it to be
- Enhance Foo to implement the Comparable interface
- Generate the compareTo method of the Comparable interface
- Code the compareTo method
- Now your test should pass
- Write some more Foo.compareTo tests with different instances of Foo