package edu.ticket.state;

import edu.ticket.TicketContext;

public class NewState implements TicketState {
    public void handle(TicketContext context) {
        System.out.println("Ticket created");
        context.getReceiveStrategy().receive();
        context.setState(new AssignedState());
    }
}