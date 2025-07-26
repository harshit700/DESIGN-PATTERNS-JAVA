# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime

# Understand Flyweight Design Pattern
1. Minimizing Memory Usage: The Flyweight Pattern helps reduce memory usage by 
reusing existing objects instead of creating new ones.
2. Implementation in Java: Typically implemented using a factory class with a map
   (e.g, HashMap) to manage object instances.
3. Use Case Examples: Useful in applications like word processors where many 
similar objects (e.g, letters) can be reused to save memory.

# Implement the Flyweight Pattern
1. Minimize Memory Usage: The Flyweight pattern helps reduce memory usage by
reusing existing objects instead of creating new ones.
2. OrderFactory Class: An OrderFactory class is created with a map to store and
manage order objects. This map checks if an object already exists before creating
new one.
3. ComputeIfAbsent Method: The computeIfAbsent method simplifies the logic by 
checking if an object exists in the map and creating a new one if it doesn't,
ensuring efficient object management.
4. This pattern is particularly useful in scenarios where creating new objects is
computationally expensive.