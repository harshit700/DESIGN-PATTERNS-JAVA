# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime

# Understand the Adapter Design Pattern
1. The Adapter pattern allows classes with incompatible interfaces to work
together, similar to how a plug adapter works.
2. It is often used with existing code to avoid changes that might break 
functionality or when dealing with third-party libraries.
3. There are two types of Adapter Patterns: Class Version(Uses Inheritance)
and object version(Uses composition). The object version is more common in
java due to its support for single inheritance.

# Implement Adapter Design Pattern using Object Adapter Pattern
1. Purpose of the Adapter Pattern: It allows classes with incompatible
interfaces to work together by using an adapter.
2. Implementation Steps:
a.) Create a new class (e.g, WordDocumentAdapter) that implements the target
interface (DocumentUploader).
b.) In the adapter class, include a field for the adaptee class
   (WordDocumentUploader)
c.) Implement the target interface methods in the adapter class, delegating
calls to the adaptee class methods.
3. The code demonstrates how to adapt a WordDocumentUploader to work with an
OnlineApplication class that expects a DocumentUploader.

# Implement the class Adapter pattern
1. Class Adapter Pattern: This pattern allows you to extend the functionality
of existing class by creating a new adapter class that inherits from it.
2. Implementation Steps:
a.) Extend the existing class (e.g, WordDocumentUploader) in the adapter
class (e.g, WordDocumentAdapter).
b.) Override methods in the adapter class to modify or enhance their 
behaviour.
3. Comparison with Object Adapter Pattern: The class adapter pattern can
be simpler and involve less code, but it is less flexible as it can only
work with one specific class.