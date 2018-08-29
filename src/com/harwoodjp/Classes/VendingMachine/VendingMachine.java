package com.harwoodjp.Classes.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private Integer balance = 0;
    private List<Product> inventory = new ArrayList<Product>();

    public VendingMachine() {}

    public List<Product> getInventory() {
        return inventory;
    }

    public void addCredits(Integer creditAmount) {
        this.balance += creditAmount;
        this.printCreditBalance();
    }

    public void addInventory(Product product) {
        this.inventory.add(product);
    }

    public Product getProductByCode(String code) {
        for (Product product : inventory) {
            if (code.equals(product.getCode())) {
                return product;
            }
        }
        return null;
    }

    public void printCreditBalance() {
        System.out.println("Balance: " + balance.toString() + " credits");
    }

    public void printInventory() {
        for (Product product : inventory) {
            System.out.println(product.toString());
        }
    }

    public Product vendInventory(String code) {
        Product product = this.getProductByCode(code);
        if (product != null) {
            if (this.balance >= product.getPrice() && product.getQuantity() > 0) {
                System.out.println("Vending " + product.getDescription());
                product.setQuantity(product.getQuantity() - 1);
                return new Product(product.getDescription());
            } else {
                System.out.println("Invalid code, insufficient balance, or out of stock item.");
            }
        }
        return product;
    }

}
