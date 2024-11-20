package org.example.solid.designabird;

public abstract class Bird {

    private String name;
    private Color color;
    private Double weight;
    private Size size;

    public void eat(){
        System.out.println("Bird is eating");
    }
}
