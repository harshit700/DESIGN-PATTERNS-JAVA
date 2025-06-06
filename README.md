# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# Understand the prototype pattern
1. The prototype design pattern helps create lots of similar objects efficiently 
by cloning existing object instead of creating new ones from scratch.
2. It avoids the complexity of a deep class hierarchy by using a clone method to 
copy existing objects.
3. The Java Cloneable interface has limitations, so it is suggested using a copy
constructor approach for simplicity and better implementation.