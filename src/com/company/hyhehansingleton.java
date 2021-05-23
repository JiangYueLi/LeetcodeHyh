package com.company;

public class hyhehansingleton {
    private static hyhehansingleton instance = new hyhehansingleton();
    private  hyhehansingleton(){}
    static hyhehansingleton getInstance(){
        return  instance;
    }

    public void showMessage(){
        System.out.println("Hello World! hyh");
    }
}
