# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Builder Pattern README.md file
a.) Simplifies Object Creation: The Builder pattern is useful when you have a class with many fields,
especially when some fields are optional. It helps avoid complex constructors and makes the code 
easier to read and maintain.
b.) Improves Readability: By using builder pattern, you can clearly see which fields are being set, 
reducing the risk of errors and making the code more understandable.
c.) As your class grows and more fields are added, the Builder pattern helps keep the code manageable
and less prone to errors.
d.) This pattern is particularly helpful in scenarios where object creation is complex and involves
many parameters.
Points to consider while implementing builder pattern:
a.) Create a static nested PersonBuilder class within your class with the same fields as Person class. 
b.) Building Objects: The build method in PersonBuilder class constructs Person object using the set fields,
enhancing clarity and reducing complexity of constructors.
----------------------------------------------------------------------

