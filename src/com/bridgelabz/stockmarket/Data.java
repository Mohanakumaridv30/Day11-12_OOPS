package com.bridgelabz.stockmarket;

public class Data {
    String nameOfStock;
    int numOfShare;
    int priceOfShare;


    @Override
    public String toString() {
        return "Data{" +
                "nameOfStock='" + nameOfStock + '\'' +
                ", numOfShare=" + numOfShare +
                ", priceOfShare=" + priceOfShare +
                '}';
    }
}
