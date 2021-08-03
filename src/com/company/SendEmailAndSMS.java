package com.company;

import java.util.List;

public class SendEmailAndSMS implements Command{
    SendSMS sendSMS;
    SendEmail sendEmail;
    public SendEmailAndSMS(List<String> messages){
        sendSMS = new SendSMS(new PhoneSMS(messages.get(0)));
        sendEmail = new SendEmail(new Email(messages.get(1), messages.get(2)));
    }
    @Override
    public void execute(){
        sendEmail.execute();
        sendSMS.execute();
    }
}
