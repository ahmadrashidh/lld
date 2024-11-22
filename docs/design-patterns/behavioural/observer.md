# Observer Pattern
> behavioural design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they are observing

## Problem
- In a system with multiple-interconnect components, where one component(subject) may have data or state that other components depend on(observer).
- Maintaining list of those components and call their respective methods to notify state change - leads to tight-coupling and therefore OCP Violation

## Solution
- mechanism for individual components to subscribe or unsubscribe from stream of events
- whenever subject changes, method exposed by subscribed components are invoked
- All subscribers implement same interfaces and publisher communicate only through interface.
- You can even make Publishers follow same interface

## Steps
1. Create Subscriber interface that has atleast an `update()` to be called by Publisher.
2. Implement concrete subscriber class as well as `update()` method.
3. Create Publisher interface which has methods to add or remove subscriber.
4. Implement concrete publisher class and make them call `update`  of all subscribers whenever subscribed event occurs.



