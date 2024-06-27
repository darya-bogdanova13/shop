package ru.skypro.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.shop.service.ShopService;


import java.util.List;

@RequestMapping("order")
@RestController
public class ShopController {
    private final ShopService shopService;

    public ShopController(ru.skypro.shop.service.ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> goods) {
        return shopService.add(goods);
    }
    @GetMapping("/get")
    public List<Integer> get(@RequestParam List<Integer> goods) {
        return shopService.get(goods);
    }
}
