package com.company;

public class ColorFactory extends AbstactFactor {
    @Override
    public Color getColor(String color) {
        if (color == null) return null;
        if (color.equalsIgnoreCase("red"))
        {
            return new Red();
        }
        return null;
    }

    @Override
    public shape getShape(String shape) {

        return null;
    }
}
