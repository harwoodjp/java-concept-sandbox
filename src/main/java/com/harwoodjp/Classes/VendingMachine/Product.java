package com.harwoodjp.Classes.VendingMachine;

public class Product {
    private String code;
    private String description;
    private Integer price;
    private Integer quantity;

    public Product(String description) {
        this.description = description;
    }

    public Product(String code, String description, Integer price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public Product(String code, String description, Integer price, Integer quantity) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
