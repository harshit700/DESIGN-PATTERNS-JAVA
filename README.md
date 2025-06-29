# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime.

# Understanding the bridge Design Pattern
1. The Bridge Pattern is used to maintain flexibility while using interface, helping to avoid 
tightly coupled classes.
2. It involves separating a class's interface from its implementation, allowing for different 
implementations to be interchanged.
3. The pattern promotes composition over inheritance, meaning a class has a reference to another
class (e.g, a shape has a color) rather than extending it.
4. This pattern is particularly useful when you have a class hierarchy but you want to keep it
flexible and configurable in different ways.

# Implementation the Bridge Patterns
1. Separation of Concerns: The Bridge pattern helps to separate the abstraction (e.g, clothinItem)
from its implementation (e.g, Size), allowing both to vary independently.
2. Avoiding Class Explosion: Instead of creating multiple classes for each combination of 
clothing items and sizes, the Bridge pattern uses combination to manage these variations
efficiently.
3. Implementation Steps:
 a.) Define interfaces for both abstraction(ClothingItem) and implementation (Size).
 b.) Implement concrete classes for each interface (e.g, Hoodie, Shirt for ClothingItem and 
 AdultSize, ChildSize for Size).
4. Use composition to pass the implementation (Size) into the abstraction (ClothingItem), 
allowing flexible combinations.