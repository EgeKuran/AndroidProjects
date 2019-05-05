package com.example.ege.orderapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductItem implements Serializable{

    private String title;
    private int quantity;
    private double unitPrice;

    public ProductItem() {
    }

    public ProductItem(String title, double unitPrice) {
        this.title = title;

        this.unitPrice = unitPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return title;

    }

    public  static List<ProductItem> getProductList(){
        ProductItem rice = new ProductItem("Rice",7.50);
        ProductItem soup = new ProductItem("Soup",5.50);
        ProductItem dessert = new ProductItem("Dessert",3.50);
        ProductItem mainCourse = new ProductItem("Daily Offer",8.0);

        List<ProductItem> items = new ArrayList<>();
        items.add(rice);
        items.add(dessert);
        items.add(soup);
        items.add(mainCourse);

        return items;
    }
}
