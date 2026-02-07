package edu.ticket.state;

import edu.ticket.TicketContext;

public class InProgressState implements TicketState {
    public void handle(TicketContext context) {
        System.out.println("Working on ticket");
        context.getResponseStrategy().respond();
        context.setState(new ResolvedState());
    }
}