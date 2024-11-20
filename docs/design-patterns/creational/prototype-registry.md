# Prototype
> creational design pattern to create copy of object instead of using class dependent `new` operator

## Problem

- If you create object with `new` keyword, you have get and set all fields of the existing object to the new object.
- Sometimes, objects are referred by type (interface) not the class.

## Solution

- Common interface for all objects that supports cloning.
- Delegate cloning process to the actual objects. The `clone` method creates new object and set values although its private because it has access.

## Specification

1. Create a prototype or cloneable interface and declare clone method in it.
2. Create prototype class that must define the alternative constructor that accepts an object of that class as an argument and copy the values of all fields from the passed object into the newly created instance.
3. The cloning method usually consists of just one line: running a new operator with the prototypical version of the constructor.
4. Optionally, create a centralized prototype registry to store a catalog of frequently used prototypes.

## Usecase

- In rendering background such as tree, buildings in game