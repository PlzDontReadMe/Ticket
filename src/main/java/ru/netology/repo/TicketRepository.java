package ru.netology.repo;


import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
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
    public List<Ticket> findByFromTo(String from, String to){
        return travels.stream().filter(e->(Objects.equals(e.getFrom(), from))&&(Objects.equals(e.getTo(), to))).collect(Collectors.toList());
    }

    public void removedById(int id) {
        travels.removeIf(e -> e.getId() == id);
    }
}
