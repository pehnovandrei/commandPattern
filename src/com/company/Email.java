package com.company;

public class Email {
    String emailMessage;
    PhoneSMS phoneSMS;
    SendSMS sendSMS;
    public Email(String emailMessage, String smsMessage) { this.emailMessage = emailMessage; this.phoneSMS = new PhoneSMS(smsMessage);}
    public void sendEmailMessage() {
        sendSMS = new SendSMS(phoneSMS);
        System.out.println(emailMessage);
        sendSMS.execute();
    }
}
