package com.bookstore.bookservice.service;

import com.bookstore.bookservice.model.Inventory;
import com.bookstore.bookservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventories() {
        return inventoryRepository.findAll();
    }

    public Optional<Inventory> getInventoryByBookId(Long bookId) {
        return inventoryRepository.findById(bookId);  // Assuming you're using the book's ID for inventory
    }

    // More methods as needed...
}
