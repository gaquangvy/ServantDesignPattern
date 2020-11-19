package com.dimitriusramos.servantdesignpattern;

public interface MobileDevice {
    void sendData(String data);
    boolean performStatusCheck();
    void makePhoneCall(String phoneNumber);
}
