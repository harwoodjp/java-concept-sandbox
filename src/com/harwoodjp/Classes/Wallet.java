package com.harwoodjp.Classes;

public class Wallet {
    public String color;
    private String brand;

    public Wallet() {}

    public Wallet(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public Wallet(String color, String brand, Integer creditCardNumber) {
        this.color = color;
        this.brand = brand;
        this.creditCardNumber = creditCardNumber;
    }

    private Integer creditCardNumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Integer creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public class SubWallet {
        public void main() {
            System.out.println("SubWallet execution.");
        }
    }


}
