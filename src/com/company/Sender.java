package com.company;

public class Sender {
    Command command;
    public Sender (Command command){
        this.command = command;
    }
    void sendMessage(){
        command.execute();
    }
}
