package edu.ticket.state;

import edu.ticket.TicketContext;

public class ClosedState implements TicketState {
    public void handle(TicketContext context) {
        System.out.println("Ticket closed");
    }
}
