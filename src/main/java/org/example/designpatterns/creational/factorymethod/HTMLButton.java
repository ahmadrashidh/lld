package org.example.designpatterns.creational.factorymethod;

public class HTMLButton extends Button{

    private String style;

    public HTMLButton(Double borderSize, String style) {
        super(borderSize);
        this.style = style;
    }

    @Override
    public void render() {
        System.out.println("HTML button rendering");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked");
    }
}
