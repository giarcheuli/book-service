package com.bookstore.bookservice.service;

import com.bookstore.bookservice.model.Price;
import com.bookstore.bookservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price savePrice(Price price) {
        return priceRepository.save(price);
    }

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public Optional<Price> getPriceById(Long id) {
        return priceRepository.findById(id);
    }

    // More methods as needed...
}
