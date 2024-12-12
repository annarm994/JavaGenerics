# Java Generics Assignment

This project demonstrates the basics and advanced usage of Java Generics. The following tasks are implemented:

1. **Generic Class** - A `Box` class that stores any type of object.
2. **Generic Method** - A method `printBox` that prints the value of any generic box.
3. **Bounded Type Parameters** - A `NumberBox` class that accepts only numeric types.
4. **Generic Interface** - A `Processor` interface and a `StringProcessor` implementation.
5. **Type Wildcards** - Demonstrating the flexibility of wildcards with generic methods.
6. **Use Case Implementation** - A `Library` class using generics to manage items of any type (e.g., books, DVDs).

## Running the Program

To compile and run the program:
```bash
javac -d bin src/*.java
java -cp bin Main
