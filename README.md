# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime.

# Understand the Facade Pattern:
1. Simplified Interface: The facade pattern provides a simple interface to a 
complex subsystem, hiding the underlying complexity.
2. Minimized Dependencies: It reduces dependencies between the client and subsystems
, making the system easier to use.
3. Optional Use: You can still access the underlying classes directly if needed,
even when a facade is available.
4. This pattern is particularly useful when you want to make a complex system
easier to interact with.

# Implement the Facade Pattern:
1. Simplification: The Facade pattern simplifies complex processes by providing a 
single, unified interface.
2. Implementation: The video demonstrates creating an EncryptionFacade class with
an encrypt method to handle encryption, making the client code cleaner and easier
to manage.
3. Code Reusability: By using the Facade pattern, you can reuse the same complex
process in multiple places without duplicating code.
4. Exception Handling: The Facade pattern also helps in managing exceptions 
centrally, reducing the complexity in the client code.
5. This pattern is particularly useful for hiding complex code and making it more
accessible and maintainable.