package edu.ticket.state;

import edu.ticket.TicketContext;

public interface TicketState {
    void handle(TicketContext context);
}