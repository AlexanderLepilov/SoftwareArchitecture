package Home_work_4;

// Интерфейс для работы с билетами
public interface TicketRepo {
    void addTicket(Ticket ticket);
    boolean isTicketAvailable(long ticketId);

}
