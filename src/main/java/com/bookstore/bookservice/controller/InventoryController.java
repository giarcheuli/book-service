package com.bookstore.bookservice.controller;

import com.bookstore.bookservice.model.Inventory;
import com.bookstore.bookservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping
    public List<Inventory> getAllInventories() {
        return inventoryService.getAllInventories();
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Inventory> getInventoryByBookId(@PathVariable Long bookId) {
        return inventoryService.getInventoryByBookId(bookId)
                .map(inventory -> ResponseEntity.ok().body(inventory))
                .orElse(ResponseEntity.notFound().build());
    }

    // Add more endpoints as needed...
}
