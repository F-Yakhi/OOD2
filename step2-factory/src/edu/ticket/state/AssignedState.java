package edu.ticket.state;

import edu.ticket.TicketContext;

public class AssignedState implements TicketState {
    public void handle(TicketContext context) {
        context.getAssignStrategy().assign();
        context.setState(new InProgressState());
    }
}