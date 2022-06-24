package ru.netology.repo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class TicketRepositoryTest {
    TicketRepository repo = new TicketRepository();
   private final Ticket nordwind = new Ticket(1, 1, "SVO", "KZN", 95);
    private final  Ticket pobeda = new Ticket(2, 2, "VKO", "KZN", 95);
    private final  Ticket utair = new Ticket(3, 2, "VKO", "KZN", 90);
    private final  Ticket airlines = new Ticket(4, 3, "DME", "KZN", 90);
    private final Ticket airlines2 = new Ticket(5, 3, "DME", "KZN", 95);
    private final Ticket airlines3 = new Ticket(6, 3, "DME", "KZN", 95);
    private final  Ticket airlines4 = new Ticket(7, 3, "DME", "KZN", 95);
    private final Ticket airlines5 = new Ticket(8, 3, "DME", "KZN", 95);
    private final Ticket aeroflot = new Ticket(9, 4, "SVO", "KZN", 95);
    private final Ticket aeroflot2 = new Ticket(10, 4, "SVO", "KZN", 95);

    @BeforeEach
    void setUp() {
        repo.save(utair);
        repo.save(airlines);
        repo.save(airlines2);
        repo.save(airlines3);
        repo.save(airlines4);
        repo.save(airlines5);
        repo.save(nordwind);
        repo.save(pobeda);
        repo.save(aeroflot);
        repo.save(aeroflot2);
    }
    @Test
    public void shouldFindAll() {
        repo.findAll();
    }
}