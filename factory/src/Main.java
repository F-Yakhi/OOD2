import edu.ticket.*;
import edu.ticket.factory.TicketFactory;
import edu.ticket.factory.TicketType;

public class Main {
    public static void main(String[] args) {

        TicketContext ticket = TicketFactory.createTicket(TicketType.BUG);
        //ticket.process();

        ticket.handle();
        System.out.println("-----");
        ticket.handle();
        System.out.println("-----");
        ticket.handle();
        System.out.println("-----");
        ticket.handle();
    }
}