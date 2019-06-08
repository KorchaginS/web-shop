package com.Shop.InternetShop.Model;

public class Clothing {

    private int ID;
    private String Name;
    private String Manufacturer;
    private double Cost;
    private String Material;

    public Clothing(String name, String manufacturer, double cost, String material, int id) {
        ID = id;
        Name = name;
        Manufacturer = manufacturer;
        Cost = cost;
        Material = material;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
