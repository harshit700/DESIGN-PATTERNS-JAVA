# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Introduction to Structural Design Patterns
1. Structural Design Patterns focus on how classes and objects are put together to form 
larger structures, simplifying the complex systems.
2. There are two categories: class patterns (concerned with "is a" relationships and inheritance
) and object patterns (concerned with "has a" relationships and object behaviour).
3. Class patterns use interfaces to define shared functionality, while object patterns allow
changing the behaviour of individual objects at runtime.

# Understand the Proxy Pattern:
1. Proxy Class: A proxy is a class that controls access to another class, often
referred to as subject.
2. Optimization: The proxy can be used to optimize the performance by ensuring that
expensive setup operations are only performed once.
3. Access Control: Proxies can control access to certain functionalities, such as
restricting actions based on user privileges.
4. Remote Access: Proxies can hide the fact that an object resides in a different 
address space, making remote interactions seamless for the client.

# Recognize Where to use the Proxy Pattern
1. The Proxy pattern is used to optimize the process of showing song 
recommendations by controlling access to the functionality of another class.
2. It helps avoid redundant and expensive database calls by reusing a single 
object instance.
3. The Proxy pattern can be beneficial when you want to delay the creation of
object until it's needed, or to control access based on certain conditions.