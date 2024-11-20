package org.example.solid.designabird;

public class Penguin extends Bird implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
