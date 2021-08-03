package com.company;

public class SendSMS implements Command {
    PhoneSMS phoneSMS;
    public SendSMS (PhoneSMS phoneSMS){ this.phoneSMS = phoneSMS; }

    @Override
    public void execute(){ this.phoneSMS.sendSMS(); }
}
