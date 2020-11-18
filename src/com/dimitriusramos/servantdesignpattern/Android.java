package com.dimitriusramos.servantdesignpattern;

import java.util.Random;

public class Android implements MobileDevice {

    public void sendData(String data){
        System.out.println("Sending data to Google: " + data);
    }

    public void makePhoneCall(String phoneNumber){
        System.out.println("determining service provider");
        System.out.println("connecting to cell tower");
        System.out.println("Making phone call to " + phoneNumber);
        System.out.println("Sending call data to Google to train AI");
    }

    public boolean performStatusCheck(){
        System.out.println("Performing status check on Android Device");
        Random random = new Random();
        return random.nextBoolean();
    }

}
