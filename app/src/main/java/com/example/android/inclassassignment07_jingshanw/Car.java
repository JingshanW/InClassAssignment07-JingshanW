package com.example.android.inclassassignment07_jingshanw;

/**
 * Created by Jing on 3/20/17.
 */

public class Car
{
    private String brand;
    private int Price;
    private boolean suv;

    public Car(String brand, int price, boolean suv) {
        this.brand = brand;
        Price = price;
        this.suv = suv;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSuv() {
        return suv;
    }

    public void setSuv(boolean suv) {
        this.suv = suv;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
