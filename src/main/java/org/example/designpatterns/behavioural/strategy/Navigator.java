package org.example.designpatterns.behavioural.strategy;

public class Navigator {
    private final NavigationStrategy strategy;


    public Navigator(NavigationStrategy strategy){
        this.strategy = strategy;
    }

    public void distanceTo(String from, String to){
        System.out.println("Distance:" + strategy.navigate(from,to));
    }
}
