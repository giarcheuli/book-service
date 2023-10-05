package com.bookstore.bookservice.repository;

import com.bookstore.bookservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findByIsbn(String isbn);
}
