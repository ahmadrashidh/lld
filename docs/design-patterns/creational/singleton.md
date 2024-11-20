# Singleton Pattern
> creational pattern to ensure class has single instance with global access

## Intent

 - One instance for shared resource like database/logging.
 - Global access to the instance

## Problem

 - This is not possible as regular constructor must always return new object.
 - Using global variable can be over-written or it will scattered across the code.

## Solution

 - Make default constructor private to prevent other object from using new operator. 
 - Use static method to return the instance if it already exists aka `Lazy Initialisation`

## Specification

1. Create a private static field to refer the instance
2. Make default constructor private.
3. Create static method that acts as a constructor with logic to return instance if it already exists.
4. Synchronise the lock using `double-checked lock` mechanism

## Downsides

- Overhead of synchronising locks to avoid multiple instance being created when method is polled for instance.


