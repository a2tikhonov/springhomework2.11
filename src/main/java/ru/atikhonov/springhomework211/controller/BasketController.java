package ru.atikhonov.springhomework211.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.atikhonov.springhomework211.service.BasketServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    public final BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("item") Integer[] items) {
        basketService.add(items);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.get();
    }
}
