package com.example.a777moneymaker.models;

public class ExpenseModel {
    private int id;
    private String name;
    private String description;
    private float price;
    private String category;
    private String date;

    public ExpenseModel(int id, String name, String description, float price, String category, String date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = date;
    }

    public ExpenseModel(String name, String description, float price, String category, String date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Wydatek: id= "  + id +
                ", nazwa= "     + name +
                ", opis= "      + description +
                ", cena= "      + price +
                ", kategoria= " + category +
                ", data= "      + date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ExpenseModel(){}
}
