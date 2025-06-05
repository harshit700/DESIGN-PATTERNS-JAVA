# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Singleton Pattern
a.) Definition: The singleton pattern ensures that a class has only one instance and provides a global
point of access to it.
b.) Use Cases: It's useful for managing shared resources like database connections, configuration files,
or loggers.
c.) Considerations: Be cautious of thread safety and the potential drawbacks, such as making code difficult
to test and tightly coupling objects. Alternatives like dependency injection might sometimes be better.

# Implementation Notes for Singleton Pattern
a.) Private Constructor: The class constructor is made private to prevent the 
creation of multiple instances.
b.) Static Instance: A private static field is used to hold the single instance 
of the class.
c.) Instance Access Method: A public static method (getInstance) is created to provide
access to the single instance, ensuring only one instance is created and returned.

# Using enum for implementing singleton pattern
a.) Thread Safety Issue: Without thread safety, multiple threads can create
multiple instances of the Singleton, defeating its purpose.
b.) Synchronized Method: Making the getInstance method synchronized ensures only 
one thread can access it at a time, but it may slow down execution if called 
frequently.
c.) Enum Approach: Using an enum to implement Singleton pattern guarantees thread
safety and simplifies the code, as enums in java are inherently thread-safe.