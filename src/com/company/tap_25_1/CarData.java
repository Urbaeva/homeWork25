package com.company.tap_25_1;

public class CarData {
    private int yeaOfIssue;
    private String model;
    private int price;
    private String colory;

    public CarData(int yeaOfIssue, String model, int price, String colory) {
        this.yeaOfIssue = yeaOfIssue;
        this.model = model;
        this.price = price;
        this.colory = colory;
    }

    public int getYeaOfIssue() {
        return yeaOfIssue;
    }

    public void setYeaOfIssue(int yeaOfIssue) {
        this.yeaOfIssue = yeaOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColory() {
        return colory;
    }

    public void setColory(String colory) {
        this.colory = colory;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "yeaOfIssue=" + yeaOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colory='" + colory + '\'' +
                '}';
    }
}
