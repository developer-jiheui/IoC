package com.gdu.ioc.xml01;

public class Computer {
    private String model;
    private int price;
    private Calculator calculator;

    public Computer() {

    }
    public Computer(String model, int price, Calculator calculator) {
        this.model = model;
        this.price = price;
        this.calculator = calculator;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
