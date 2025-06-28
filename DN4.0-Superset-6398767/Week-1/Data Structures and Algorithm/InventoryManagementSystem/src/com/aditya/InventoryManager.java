package com.aditya;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product already exists with ID: " + product.getProductId());
            return;
        }
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update a product
    public void updateProduct(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product removed with ID: " + productId);
        } else {
            System.out.println("No product found to remove with ID: " + productId);
        }
    }

    // View all products
    public void viewAllProducts() {
        System.out.println("Current Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
