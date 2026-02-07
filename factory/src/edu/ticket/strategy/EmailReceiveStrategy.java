package edu.ticket.strategy;

public class EmailReceiveStrategy implements ReceiveStrategy {
    public void receive() {
        System.out.println("Received from email");
    }
}