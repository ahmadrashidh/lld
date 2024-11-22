package org.example.designpatterns.behavioural.observer;


// 2. Implement concrete subscriber class as well as `update()` method.
public class SMSAlert implements Subscriber{
    @Override
    public void update(Object contextData) {
        System.out.println("Sending SMS alert");
    }
}
