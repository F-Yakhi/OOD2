package edu.ticket.factory;

import edu.ticket.TicketContext;
import edu.ticket.strategy.WebReceiveStrategy;
import edu.ticket.strategy.*;

public class TicketFactory {
    public static TicketContext createTicket(TicketType type) {

        if (type == TicketType.BUG) {
            return new TicketContext(
                    new WebReceiveStrategy(),
                    new BugAssignStrategy(),
                    new BugResponseStrategy()
            );
        }

        return new TicketContext(
                new EmailReceiveStrategy(),
                new QuestionAssignStrategy(),
                new GenericResponseStrategy()
        );
    }
}
