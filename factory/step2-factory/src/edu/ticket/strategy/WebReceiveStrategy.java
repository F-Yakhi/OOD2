package edu.ticket.strategy;

public class WebReceiveStrategy implements ReceiveStrategy {
    public void receive() {
        System.out.println("Received from web");
    }
}

