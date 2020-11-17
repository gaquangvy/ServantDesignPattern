package com.dimitriusramos.servantdesignpattern;

public class Client {
    public void turnOnBlueTooth(MobileDevice mobileDevice,BlueToothServant blueToothRadio)
    {
        blueToothRadio.turnOn(mobileDevice);
    }
}

