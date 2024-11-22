package org.example.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

// 4. Implement concrete publisher class and make them call `update`  of all subscribers whenever subscribed event occurs.
public class BitcoinManager implements Publisher {
    private Bitcoin bitcoin;
    private final List<Subscriber> subscriberList = new ArrayList<>();

    public BitcoinManager(Bitcoin bitcoin){
        this.bitcoin = bitcoin;
    }

    public void updatePrice(Double price){
        bitcoin.setPrice(price);
        publish(price);
    }

    @Override
    public void publish(Object contextData) {
        this.subscriberList.forEach(sub -> sub.update(contextData));
    }

    @Override
    public void addSubscriber(Subscriber sub) {
        this.subscriberList.add(sub);
    }

    @Override
    public void removeSubscriber(Subscriber sub) {
        this.subscriberList.remove(sub);
    }
}
