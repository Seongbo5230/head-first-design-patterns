# Design Pattern - Singleton
**Singleton** pattern ensures a class has only one instance, and provides a global point of access to it.

## Things to note...
- To get an instance, you've got to go through the class
- Java's implementation of the Singleton Pattern makes use of private constructor, static method combined with a static variable
- Examine the performance of the implementation in relation to multithreading applications