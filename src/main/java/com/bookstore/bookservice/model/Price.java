package com.bookstore.bookservice.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "prices")
public class Price {

    @Id
    private Long id;  // This will be the same ID as the associated Book

    private double price;

    @OneToOne
    @MapsId
    @JoinColumn(name = "book_id")
    private com.bookstore.bookservice.model.Book book;
    @Transient
    public String getIsbn() {
        return this.book != null ? this.book.getIsbn() : null;
    }
    public Price() {
    }

    // Getters

    public Long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public com.bookstore.bookservice.model.Book getBook() {
        return book;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBook(com.bookstore.bookservice.model.Book book) {
        this.book = book;
    }

    // Equals, hashCode, and toString methods (generated based on ID and price)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price bookPrice = (Price) o;
        return Double.compare(bookPrice.price, price) == 0 &&
                Objects.equals(id, bookPrice.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }

    @Override
    public String toString() {
        return "BookPrice{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
