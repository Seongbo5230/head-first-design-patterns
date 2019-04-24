# Design Pattern - Factory
**Factory** method pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.

## Things to note...
- It gives us a way to encapsulate the instantiations of concrete types
- Abstract Creator, Abstract Producer, Concrete Creator (subclass), Concrete Producer (subclass)
- "Dependency Inversion Principle" says to depend upon abstractions. Do not depend upon concrete classes
- The intent of factory method is to allow a class to defer instantiation to its subclasses

# Design Pattern - Abstract Factory
**Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Things to note...
- Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects.
- Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
- The intent of abstract factory method is to create families of related objects without having to depend on their concrete classes

### Decided not to finish past page 154 b/c I'd need to add a lot more classes... maybe come back later...