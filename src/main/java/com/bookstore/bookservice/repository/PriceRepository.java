package com.bookstore.bookservice.repository;

import com.bookstore.bookservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PriceRepository extends JpaRepository<Price, Long> {
    Optional<Price> findById(Integer Id);
}
