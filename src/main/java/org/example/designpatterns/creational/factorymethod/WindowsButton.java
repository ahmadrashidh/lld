package org.example.designpatterns.creational.factorymethod;

public class WindowsButton extends Button{

    private int color;

    public WindowsButton(Double borderSize, int color) {
        super(borderSize);
        this.color = color;
    }

    @Override
    public void render() {
        System.out.println("Windows button rendering");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
