package ru.atikhonov.springhomework211.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basket;

    public Basket() {
        this.basket = new LinkedList<>();
    }

    public void setBasket(Integer id) {
        this.basket.add(id);
    }

    public List<Integer> getBasket() {
        return basket;
    }
}
