package ru.netology.repo;


import lombok.Data;

import ru.netology.domain.Ticket;

import java.util.ArrayList;
import java.util.List;



@Data

public class TicketRepository {
    private List<Ticket> travels = new ArrayList<>();

    public void save(Ticket travel) {
        travels.add(travel);
    }

    public List<Ticket> findAll() {
        return this.travels;
    }

    public Ticket findById(int id) {

        for (Ticket travel : travels) {
            if (travel.getId() == id) {
                return travel;
            }
        }
        return null;
    }

    public void removedById(int id) {
        travels.removeIf(e -> e.getId() == id);
    }
}
