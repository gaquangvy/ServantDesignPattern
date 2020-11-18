package com.dimitriusramos.servantdesignpattern;

import java.util.Random;

public class iPhone implements MobileDevice {


    public void sendData(String data){
        System.out.println("Sending data to Apple: " + data);
    }
    public void makePhoneCall(String phoneNumber){
        System.out.println("determining service provider");
        System.out.println("connecting to cell tower");
        System.out.println("Routing traffic through apple servers");
        System.out.println("Making phone call to " + phoneNumber);
        System.out.println("Sending call data to Apple to sell more iPhones");
    }

    public boolean performStatusCheck(){
        //Imagine more specific complex algorithm for performing status check on device
        System.out.println("Performing status check on iPhone");
        Random random = new Random();
        return random.nextBoolean();
    }
}
