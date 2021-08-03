package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SendEmail sendEmail = new SendEmail(new Email("Сообщение на почту", "На вашу почту пришло сообщение"));
        SendSMS sendSMS = new SendSMS(new PhoneSMS("Сообщение по смс"));
        SendEmailAndSMS sendEmailAndSMS = new SendEmailAndSMS(Arrays.asList("СМС получателю", "Письмо получателю", "СМС о письме"));
        Sender senderEmail = new Sender(sendEmail);
        Sender senderSMS = new Sender(sendSMS);
        Sender senderEmailAndSMS = new Sender(sendEmailAndSMS);
        senderEmail.sendMessage();
        senderSMS.sendMessage();
        senderEmailAndSMS.sendMessage();
    }
}
