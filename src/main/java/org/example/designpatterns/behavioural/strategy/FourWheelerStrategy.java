package org.example.designpatterns.behavioural.strategy;

public class FourWheelerStrategy implements NavigationStrategy{
    @Override
    public Double navigate(String from, String to) {
        return 1.0;
    }
}
