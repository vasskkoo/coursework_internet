package com.example.internet.items;

public class TariffsInfo {
    private String first_price;
    private String second_price;
    private String third_price;

    public TariffsInfo(String first_price, String second_price, String third_price){
        this.first_price = first_price;
        this.second_price = second_price;
        this.third_price = third_price;
    }

    public String getFirst_price() {
        return first_price;
    }

    public String getSecond_price() {
        return second_price;
    }

    public String getThird_price() {
        return third_price;
    }
}
