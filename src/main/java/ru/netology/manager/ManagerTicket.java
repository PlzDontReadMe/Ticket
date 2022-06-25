package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;
import ru.netology.repo.TicketRepository;


import java.util.*;


@NoArgsConstructor
public class ManagerTicket  {

    private TicketRepository repo;

    public ManagerTicket(TicketRepository repo) {
        this.repo = repo;
    }


    public void add(Ticket travel) {
        repo.save(travel);
    }


    public List<Ticket> findByFromTo(String from, String to) {
           List<Ticket> result = new ArrayList<>();
        for (Ticket travel : this.repo.findAll()) {
            if ((Objects.equals(travel.getFrom(), from)) && (Objects.equals(travel.getTo(), to))) {
                result.add(travel);
            }
        } Collections.sort(result);
        return result;
    }

}


