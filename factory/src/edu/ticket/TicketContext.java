package edu.ticket;


import edu.ticket.state.NewState;
import edu.ticket.state.TicketState;
import edu.ticket.strategy.AssignStrategy;
import edu.ticket.strategy.ReceiveStrategy;
import edu.ticket.strategy.ResponseStrategy;

public class TicketContext {

    private TicketState state;

    private ReceiveStrategy receiveStrategy;
    private AssignStrategy assignStrategy;
    private ResponseStrategy responseStrategy;

    public TicketContext(
            ReceiveStrategy receiveStrategy,
            AssignStrategy assignStrategy,
            ResponseStrategy responseStrategy
    ) {
        this.state = new NewState();
        this.receiveStrategy = receiveStrategy;
        this.assignStrategy = assignStrategy;
        this.responseStrategy = responseStrategy;
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public ReceiveStrategy getReceiveStrategy() {
        return receiveStrategy;
    }

    public AssignStrategy getAssignStrategy() {
        return assignStrategy;
    }

    public ResponseStrategy getResponseStrategy() {
        return responseStrategy;
    }

    public void handle() {
        state.handle(this);
        System.out.println("Logging ticket handling");
    }

    //public void process() {
    //}
}