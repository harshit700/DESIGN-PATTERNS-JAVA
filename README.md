# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime.

# Introduction to Decorator Design Pattern
1. Decorator Design Pattern Purpose: It allows you to change the behaviour of an 
object without creating a new subclass for each behaviour.
2. Implementation: You start with an interface (e.g, Room), a concrete 
implementation (e.g, EmptyRoom), and then use decorators (e.g, RoomDecorator) to
add functionalities.
3. Efficiency: This pattern reduces the number of classes needed by allowing you to
combine different behaviours dynamically, making your code more flexible and 
maintainable.
4. This approach helps in managing complex combinations of behaviours efficiently.

# Change the behaviour dynamically with a decorator
1. Decorator Pattern: This pattern allows you to add functionality to objects 
dynamically without modifying their structure.
2. Implementation: You create an abstract decorator class that implements the
same interface as the objects you want to decorate. Concreate decorator classes
extend this abstract class and add their own behaviour.
3. Example: The code demonstrates how to use the decorator pattern to give users
different privileges in a login system, such as creating an AdminUser that extends
the basic user functionality.
4. This approach helps in creating flexibility and reusable code by allowing 
different combinations of behaviours without creating numerous subclasses.

# Add multiple decorations to an object
1. Decorator Pattern Usage: The video demonstrates how to use the decorator 
pattern to add multiple functionalities to a basic user object dynamically.
2. Chaining Decorators: It shows how to chain different decorators, such as 
AdminUser and DeveloperUser, to combine their privileges.
3. Example: By chaining these decorators, a user can have both admin privileges
   (e.g, deploying to production).
4. This approach allows for flexible and modular addition of functionalites to
objects in your code.