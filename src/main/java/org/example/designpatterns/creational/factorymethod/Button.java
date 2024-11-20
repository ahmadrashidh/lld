package org.example.designpatterns.creational.factorymethod;

// Create abstract entity for extendable class types
public abstract class Button {
    private Double borderSize;

    public Button(Double borderSize){
        this.borderSize = borderSize;
    }

    public abstract void render();
    public abstract void onClick();
}
