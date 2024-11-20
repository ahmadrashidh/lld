package org.example.designpatterns.creational.factorymethod;

// 2. Add factory method to creator class.
public class Dialog {
    // 3. In factory method, use switch to instantiate different concrete class.
    public static Button createButton(Type type, Double borderSize, int color, String style){
        switch(type){
            case DESKTOP:
                return new WindowsButton(borderSize, color);
            case WEB:
                return new HTMLButton(borderSize, style);
        }

        throw new IllegalArgumentException("Invalid Type");
    }
}
