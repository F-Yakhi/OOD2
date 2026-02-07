package edu.ticket.state;

import edu.ticket.TicketContext;

public class ResolvedState implements TicketState {
    public void handle(TicketContext context) {
        System.out.println("Ticket resolved");
        context.setState(new ClosedState());
    }
}
