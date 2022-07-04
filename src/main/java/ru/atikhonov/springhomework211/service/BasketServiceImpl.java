package ru.atikhonov.springhomework211.service;

import org.springframework.stereotype.Service;
import ru.atikhonov.springhomework211.model.Basket;

import java.util.List;

@Service
public class BasketServiceImpl {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void add(Integer[] items) {
        this.basket.setBasket(items);
    }


    public List<Integer> get() {
        return List.copyOf(basket.getBasket());
    }

}
