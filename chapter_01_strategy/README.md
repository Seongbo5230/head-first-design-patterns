# Design Pattern - Strategy
**Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Things to note...
- Identify the aspects of your application that vary and separate them from what stays the same
- Take what varies and "encapsulate" it so it won't affect the rest of your code
- "Program to an interface" = "Program to a supertype"
- Favor composition over inheritance
- Program to an interface, not an implementation