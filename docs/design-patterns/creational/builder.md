# Builder
> creational design pattern to instantiate large objects step-by-step

## Problem
- Complex objects has fat constructor, whose instantiation requires passing long list of values, nested objects.
- In some cases, we need to instantiate objects with some fields that often varies - leading to implement `telescopic constructors`

## Solution
- Use intermediate object that act as buildable instance of the target object until its instantiation

## Specification
1. Create static inner class (intermediate object) aka `Builder`
2. Copy all fields of the outer class (target class) to the `Builder` class
3. Expose setters on the `Builder` class to allow settings fields
4. Call the lifecycle method `build()` to instantiate the object
5. Invoke validate method before instantiating to validate the input


