package ru.atikhonov.springhomework211.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private final ArrayList<Integer> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void setBasket(Integer[] items) {
        this.basket.addAll(Arrays.asList(items));
    }

    public List<Integer> getBasket() {
        return basket;
    }
}
