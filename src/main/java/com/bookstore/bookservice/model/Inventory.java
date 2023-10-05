package com.bookstore.bookservice.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String isbn;

    private int quantity;

    public Inventory() {
    }

    // Constructors, getters, setters, etc.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return quantity == inventory.quantity &&
                Objects.equals(id, inventory.id) &&
                Objects.equals(isbn, inventory.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, quantity);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
