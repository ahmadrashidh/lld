package org.example.solid.designabird;

public class Eagle extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
