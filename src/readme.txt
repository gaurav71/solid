 SOLID Design Principles

 Guidelines to achieve software systems
 Makes the code
    extensible
    maintainable
    modular
    easy to read

 Single Responsibility Principle
 The function/class should be responsible for one logical thing.
 If you see a lot of if else conditions then SRP might be failing

 Open Close Principle
 The code should be open for extension and closed for modification
 It should be easy to add new features but adding new features should not require changing the already written code
 Might not be possible in actual development.
 Helps to maintain easier testing. Parallel development becomes easier

 Liskov Substitution Principle
 Every subclass or derived class should be substitutable for their base or parent class
 Object of subclass should be able to be used in place of object of superclass
 Program to interfaces

 I = Interface segregation Principle
 Interfaces should be as light as possible
 We should have as fewer methods as possible
 Ideally have 1 method
 If multiple method then make sure they can be logically together
 Should not force class to implement something that it cannot do
 Interface segregation principle (ISP) = SRP for interfaces

 D = Dependency Inversion Principle
 No 2 concrete classes should directly depend on each other. They should depend on each other
 via interface. make them loosely coupled
 Program to interface