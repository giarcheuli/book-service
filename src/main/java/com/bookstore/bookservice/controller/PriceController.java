package com.bookstore.bookservice.controller;

import com.bookstore.bookservice.model.Price;
import com.bookstore.bookservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping
    public Price createPrice(@RequestBody Price price) {
        return priceService.savePrice(price);
    }

    @GetMapping
    public List<Price> getAllPrices() {
        return priceService.getAllPrices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Price> getPriceById(@PathVariable Long id) {
        return priceService.getPriceById(id)
                .map(price -> ResponseEntity.ok().body(price))
                .orElse(ResponseEntity.notFound().build());
    }

    // Add more endpoints as needed...
}
