package ru.netology.manager;

import lombok.NoArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repo.TicketRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@NoArgsConstructor
class ManagerTicketTest {
    private final Ticket nordwind = new Ticket(1, 10, "SVO", "KZN", 95);
    private final Ticket pobeda = new Ticket(2, 2, "VKO", "KZN", 95);
    private final Ticket utair = new Ticket(3, 3, "VKO", "KZN", 90);
    private final Ticket airlines = new Ticket(4, 3, "DME", "KZN", 90);
    private final Ticket airlines2 = new Ticket(5, 1, "DME", "KZN", 95);
    private final Ticket airlines3 = new Ticket(6, 5, "DME", "KZN", 95);
    private final Ticket airlines4 = new Ticket(7, 4, "DME", "KZN", 95);
    private final Ticket airlines5 = new Ticket(8, 2, "DME", "KZN", 95);
    private final Ticket aeroflot = new Ticket(9, 4, "SVO", "KZN", 95);
    private final Ticket aeroflot2 = new Ticket(10, 4, "SVO", "KZN", 95);
    public ManagerTicket manager = new ManagerTicket(new TicketRepository());


    @BeforeEach
    void setUp() {
        manager.add(utair);
        manager.add(airlines);
        manager.add(airlines2);
        manager.add(airlines3);
        manager.add(airlines4);
        manager.add(airlines5);
        manager.add(nordwind);
        manager.add(pobeda);
        manager.add(aeroflot);
        manager.add(aeroflot2);
    }

    @Test
    void findByFromTo() {
        List<Ticket> expected = List.of(airlines2, airlines5, airlines, airlines4, airlines3);
        List<Ticket> actual = manager.findByFromTo("DME", "KZN");

        assertEquals(expected, actual);
    }
}