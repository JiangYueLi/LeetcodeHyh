package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        hyhehansingleton object = hyhehansingleton.getInstance();
        object.showMessage();

        AbstactFactor shapeFactory = FactoryProducer.getFactory("shape");
        shape shape1 = shapeFactory.getShape("sanjiao");
        shape1.draw();
        AbstactFactor colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Scanner in = new Scanner(System.in);
        while(in.hasNext());
        {
            String[]s = in.nextLine().split(",");
            Arrays.sort(s);
            for(int i = 0;i<s.length -1;i++)
            {
                System.out.print(s[i]+ ",");
            }
            System.out.println(s[s.length-1]);
        }
    }
}
