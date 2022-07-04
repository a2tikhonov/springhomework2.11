package ru.atikhonov.springhomework211.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@Scope("session")
public class Basket {
    private List<Integer> basket;

    public Basket() {
        this.basket = new LinkedList<Integer>();
    }

    public void setBasket(Integer id) {
        this.basket.add(id);
    }

}
