package com.company;

public class PhoneSMS {
    String message;
    public PhoneSMS(String message) { this.message = message; }
    public void sendSMS() {
        System.out.println(message);
    }
}
