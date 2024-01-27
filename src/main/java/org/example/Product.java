package org.example;

import java.util.Objects;

public class Product {
    private String productName;
    private int price;
    private double rating;

    public Product(String productName, int price, double rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + productName
                + ", цена товара: " + price
                + ", рейтинг товара: " + rating + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Double.compare(rating, product.rating) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, rating);
    }
}
