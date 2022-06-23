package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;
import ru.netology.repo.TicketRepository;


import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

@NoArgsConstructor

public class ManagerTicket {

    private TicketRepository repo;


    public List<Ticket> findByFromTo(String from, String to) {
        repo.findAll();
        return travels.stream().filter(e -> (!e.getFrom() == from) && (!e.getTo() == to)).collect(Collectors.toList());
    }

}
