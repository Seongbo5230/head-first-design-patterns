# Design Pattern - Decorator
**Decorator** pattern attaches additional responsibilties to an object dynamicaly. Decorators provide a flexible alternative to subclassing for extending functionality.

## Things to note...
- Classes should be open for extension, but closed for modification
- Decorator objects appear as "wrappers"
- Decorators have the same supertype as the objects they decorate
- You can use one or more decorators to wrap an object
- The decorator adds its own behavior eithere before and/or after delegating to the object it decorates to do the rest of the job
- Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like
- The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.
- 