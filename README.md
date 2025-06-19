# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Understand the Factory Method Pattern:
1. The Factory Method pattern helps in deciding which type of concrete class needs to be 
created by another class, encapsulating object creation.
2. It is useful when a class is responsible for creating objects of another type but doesn't
know in advance which concrete types to create.
3. There are two variations: one where a factory method inside the creator class returns
different types of objects based on parameter, and another where different creator classes
are responsible for creating different types of objects.
4. This pattern centralizes object creation, making it easier to manage and modify.

# Implement the Factory Method pattern
1. The Factory method pattern allows a class to create objects without specifying the exact class of the object
that will be created.
2. It involves creating method that takes a parameter (eg, ticket type) and returns the appropriate object based on
that parameter.
3. This pattern helps in making the code more flexible and extensible, as new types can be added with minimal
changes to the existing code.