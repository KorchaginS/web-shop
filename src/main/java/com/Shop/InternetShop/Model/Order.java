package com.Shop.InternetShop.Model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int ID;
    private long UserID;
    private List<Integer> Clothings = new ArrayList<Integer>();

    public Order(int id, long userID,List<Integer> clothings) {
        ID = id;
        UserID = userID;
        Clothings = clothings;
    }

    public Order(){

    }


    public int getID() {
        return ID;
    }

    public void setID(int id){
        ID = id;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public long getUserID() {
        return UserID;
    }

    public void setClothing(List<Integer> clothings) {
        Clothings = clothings;
    }

    public List<Integer> getClothings() {
        return Clothings;
    }

    public void addGoods(Integer id){
        Clothings.add(id);
    }
}
