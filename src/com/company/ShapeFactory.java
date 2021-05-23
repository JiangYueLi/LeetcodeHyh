package com.company;

public class ShapeFactory extends AbstactFactor{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public shape getShape(String shape) {
        if (shape == null) return null;
        if (shape.equalsIgnoreCase("sanjiao"))
        {
            return new sanjiao();
        }
        return null;
    }
}
