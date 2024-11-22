# Strategy Pattern
> behavioural design pattern to manage family of algorithms or behaviours by segregating them into a separate class based on their context

## Problem
- In the use case of object showing multiple behaviour, solution with multiple methods or factory method leads to tight-coupling and code duplication. 

## Solution
- Extract all algorithms into separate classes aka `strategies`
- The context class which is showing these behaviours delegates the function to Strategy class such that choice of algorithm is unknown to it.

## Implementation
1. Create Strategy interface for the list of behaviours
2. Implement concrete Strategy class for each behaviour. Best practice to use name of the specific behaviour for the strategy

