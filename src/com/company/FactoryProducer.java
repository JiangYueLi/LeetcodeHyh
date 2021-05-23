package com.company;

public class FactoryProducer {
    public static AbstactFactor getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("shape"))
        {
            return new ShapeFactory();
        }
        else if (choice.equalsIgnoreCase("color"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
