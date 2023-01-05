package com.example.a777moneymaker.models;

public class ExpenseModel {
    private int id;
    private String name;
    private String description;
    private float price;
    private String category;
    private String account;
    private int day;
    private int month;
    private int year;


    public ExpenseModel(int id, String name, String description, float price, String category, String account, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.account = account;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public ExpenseModel(String name, String description, float price, String category, String account, int day, int month, int year) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.account = account;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "id= " + id
                + ", nazwa= "      + name
                + ", opis= "       + description
                + ", cena= "       + price
                + ", kategoria= "  + category
                + ", konto= "      + account
                + ", data= "       + day + "." + month + "." + year;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        return day + "." + month + "." + year;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ExpenseModel(){}
}
