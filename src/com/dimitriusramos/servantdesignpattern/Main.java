package com.dimitriusramos.servantdesignpattern;

public class Main {

    public static void main(String[] args) {
        MobileDevice samsung = new Android();
        MobileDevice iphone12 = new iPhone();
        BlueToothServant btServant = new BlueToothServant();
        btServant.turnOnBlueTooth(samsung);
        btServant.turnOnBlueTooth(iphone12);
    }
}
