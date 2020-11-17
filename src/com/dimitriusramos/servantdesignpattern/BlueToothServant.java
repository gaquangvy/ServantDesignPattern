package com.dimitriusramos.servantdesignpattern;

public class BlueToothServant implements BlueTooth {
    BlueTooth radio = new BlueToothServant();

    public void turnOn(MobileDevice device)
    {
        System.out.println("turnOn device");
    }
}
