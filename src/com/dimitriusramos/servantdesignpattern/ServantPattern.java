package com.dimitriusramos.servantdesignpattern;

public class ServantPattern {

    Client testClient = new Client();

    public void androidBlueTooth()
    {
        MobileDevice device = new Android();
        BlueToothServant btServant = new BlueToothServant();

        testClient.turnOnBlueTooth(device, btServant);
    }

    public void iPhoneBlueTooth()
    {
        MobileDevice device = new iPhone();
        BlueToothServant btServant = new BlueToothServant();

        testClient.turnOnBlueTooth(device, btServant);
    }
}

