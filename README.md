# DESIGN-PATTERNS-JAVA
Implementation of Design Patterns in Java

# What are behavioral Design Patterns
1. Behavioral Design Patterns focus on how objects interact and assign responsibilities
among themselves. 
2. Object Interactions: These patterns are concerned with how objects communicate and
collaborate to achieve complex control flows.
3. Class vs. Object Patterns: Some behavioral patterns use inheritance to share behaviour
between classes, while most focus on object interactions.
4. Encapsulation and delegation: They often involve encapsulating behaviour within objects
and delegating requests to these objects to manage responsibilities effectively.

# Understand chain of Responsibility Pattern
1. Decoupling Requests: The chain of responsibility pattern decouples the sender of a
requests from its receiver, allowing different handlers to process the request.
2. Request Handling: Requests are passed along a chain of handlers until one of them
handles it. If none of the handlers can process the request, it remains unhandled.
3. Avoiding Circular References: It's important to ensure that handlers do create 
circular references, which could lead to endless loops.

# Recognize where to use the Chain of Responsibility Pattern
1. Decoupling Logger Requests: The Chain of Responsibility pattern helps decouple the
logger request from the specific logger type (console or file), making the system more
flexible.
2. Tight Coupling Issue: Initially, the logger request is tightly coupled with the
logger type, requiring changes in multiple places when switching logger types.
3. Using the Pattern: By using the Chain of Responsibility Pattern, you can pass the
logger request along a chain of potential loggers until one handles it, reducing
tight coupling and improving maintainability.

# Implement a successor chain
1. Chain of Responsibility Pattern: This pattern is used to decouple the sender of a 
request from its receiver by passing the request along a chain of potential handlers.
2. Logger Class Updates: The logger class is updated to include a reference to the next
logger in the chain, allowing requests to be passed along if the current logger can't
handle them.
3. Concrete Implementations: Both ConsoleLogger and FileLogger classes are updated to
handle their specific logging types and pass requests along the chain if necessary.
4. Building the Chain: A new method is introduced to build the chain of loggers, 
ensuring the correct order of handling requests.
5. This approach helps in dynamically adapting to the correct type of logger and 
decoupling the sender and receiver of the request.