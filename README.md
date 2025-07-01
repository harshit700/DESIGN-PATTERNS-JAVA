# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime

# Understand the Composite Design Patterns
1. The Composite pattern allows you to treat individual objects and groups of 
objects uniformly.
2. It uses an interface or abstract class that both the composite and its parts
inherit from, enabling methods like isComplete to be implemented consistently.
3. This pattern simplifies client code by allowing it to ignore the differences 
between individual objects and composites, making the code more flexible and
maintainable.

# Implement the Composite Pattern
1. The Composite pattern allows you to handle individual objects and groups of
objects uniformly by implementing common interface.
2. In the example, a Completable interface is created with an isCompleted method,
which is implemented by both TodoItem and Checklist classes.
3. This pattern simplifies the process of checking the completion status of both
individual to-do items and the entire checklist, making the code more maintainable
and flexible.