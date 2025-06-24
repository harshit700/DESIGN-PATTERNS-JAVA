# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Understand Abstract Factories
1. Abstract Factory Pattern: This pattern is used when a framework uses groups of classes
together, allowing clients to choose different variations (e.g, color schemes for user
interface).
2. Independence from Object Creation: The system should be independent of how objects are 
created, ensuring flexibility and reusability.
3. Factory of Factories: The pattern involves creating a factory that produces other 
factories, each responsible for creating a family of related objects (e.g., blue UI Factory
, Red UI Factory).
4. Complexity and Benefits: While the pattern involves many classes, making it complex, it
abstracts away the complexity from the application, making it easier to manage and unit test.

# Recognize where to use abstract Factory Method:
1. Abstract Factory Pattern: This pattern is useful when you have a structure where an
object has multiple fields that can be of different types. It helps in reducing tight 
coupling between classes.
2. Application Example: The code uses a bike manufacturing application to illustrate how
the abstract factory pattern can improve design by reducing coupling and making the 
code more maintainable.
3. Benefits: Using abstract factories can help avoid mistakes, such as passing incorrect
types, and makes it easier to update or add new types without changing multiple parts of
the code.
4. This pattern is particularly useful in scenarios where you need to create families of
related objects.
5. So if you see in current code Bike is manufactured using three parts Handlebars, Pedals
, Tire. And we define interface for every part which is implemented by RoadBike and
MountainBike classes for each part. Creating bike from these classes will include if else
blocks and passing arguments which can be problematic if we pass wrong argument.
So let's see in next commit how we shall implement abstract factories design pattern.

# Create factories for families of objects
1. Abstract Factory Pattern: The code demonstrates how to use the abstract factory pattern
to create families of related objects, such as different types of bike parts (handlebars,
pedals, tires).
2. Implementation: It shows how to define an interface for creating bike factories and 
implement this interface for different types of bikes (road bikes and mountain bikes).
3. Code Simplification: By using the abstract factory pattern, the code illustrates how
to encapsulate the knowledge of creating different bike parts, simplifying the main code
and reducing the need for boilerplate code.
4. This approach helps in managing object creation more efficiently and keeps the codebase
clean and maintainable.