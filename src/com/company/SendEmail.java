package com.company;

public class SendEmail implements Command{
    Email email;
    public SendEmail(Email email) { this.email = email; }

    @Override
    public void execute(){
        this.email.sendEmailMessage();
    }
}
