package ru.atikhonov.springhomework211.service;

import org.springframework.stereotype.Service;
import ru.atikhonov.springhomework211.model.Basket;

@Service
public class BasketServiceImpl {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void add(Integer id) {
        this.basket.setBasket(id);
    }

    public Basket get() {
        return basket;
    }

}
