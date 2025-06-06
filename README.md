# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Understand the prototype pattern
1. The prototype design pattern helps create lots of similar objects efficiently 
by cloning existing object instead of creating new ones from scratch.
2. It avoids the complexity of a deep class hierarchy by using a clone method to 
copy existing objects.
3. The Java Cloneable interface has limitations, so it is suggested using a copy
constructor approach for simplicity and better implementation.

# Implementation of Prototype Design Pattern:
1. The video demonstrates how to implement the Prototype Pattern by creating a clone
method in an abstract class overriding it in a subclass to duplicate objects with
the same properties.
2. Reducing Duplication: The Prototype pattern helps to avoid repetitive code by 
cloning existing objects instead of creating new ones from scratch, which is useful
when creating multiple similar objects.
3. Example Application: The code shows here uses a restaurant order tracking app to
show how to clone Pizza objects with the same price and flavor, reducing the need
to set these properties repeatedly for each new object.

# Handling Mutability:
1. Shallow vs Deep Copy: The video explains the difference between shallow and deep
copying. A shallow copy duplicates the object but not the objects it references,
while a deep copy duplicates everything.
2. Mutability Issue: Changing a field in a shallow copy affects all cloned objects,
which can lead to unintended side effects.
3. Solution: To avoid these issues, the video demonstrates how to implement a deep 
copy by creating new instances of the referenced objects, ensuring that changes to
one instance do affect others.