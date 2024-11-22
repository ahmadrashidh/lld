package org.example.designpatterns.behavioural.observer;

// 1. Create Subscriber interface that has atleast an `update()` to be called by Publisher.

public interface Subscriber {
    void update(Object contextData);
}
