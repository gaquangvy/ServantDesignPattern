package com.dimitriusramos.servantdesignpattern;

public class BlueToothServant{

    public void turnOnBlueTooth(MobileDevice device)
    {
        if(device.performStatusCheck()){
            System.out.println("Turning on bluetooth");
        }else{
            System.out.println("Device failed status check cannot turn on bluetooth");
        }

    }
}


