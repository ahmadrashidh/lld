package org.example.designpatterns.behavioural.observer;


import java.util.ArrayList;
import java.util.List;

// 3. Create Publisher interface which has methods to add or remove subscriber.
public interface Publisher {

    void publish(Object contextData);

    void addSubscriber(Subscriber sub);

    void removeSubscriber(Subscriber sub);

}
