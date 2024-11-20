# Factory Patterns

## Factory Method

### Intent
- creational design pattern to delegate object instantiation to subclass.

### Problem
- instantiating concrete class (with extension scope ) tightly-couple it to the creator class - requiring modification i.e. OCP violation
- sometimes, instantiating class often requires additional steps causing SRP violation

### Solution
- delegate instantiation to factory class or method
- instantiate to abstract type

### Specification
1. Create abstract entity for extendable class types
2. Add factory method to creator class.
3. In factory method, use switch to instantiate different concrete class.

### Downsides
- Increases complexity
- Parameter explosion in factory method - solved by returning Builder
- extending those classes requires changing factory method - OCP violation

