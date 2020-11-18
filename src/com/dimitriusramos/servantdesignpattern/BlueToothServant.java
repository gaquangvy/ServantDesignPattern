package com.dimitriusramos.servantdesignpattern;

public class BlueToothServant{

    public void turnOnBlueTooth(MobileDevice device)
    {
        device.performStatusCheck();
        System.out.println("Turning on bluetooth");
    }
}
