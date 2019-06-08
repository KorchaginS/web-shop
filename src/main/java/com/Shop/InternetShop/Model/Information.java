package com.Shop.InternetShop.Model;

import java.util.ArrayList;
import java.util.*;

public class Information {

    private static  Information information = null;
    private static ArrayList<Clothing> clothing = new ArrayList<Clothing>();
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Order> orders = new ArrayList<Order>();
    public static Map<Integer,Order> map = new HashMap<Integer, Order>();

    private Information(){

        fillInformation();
    }


    public static Information getInstance() {
        if(information == null) {
            information = new Information();
        }
        return information;
    }


    public Map getMap(){

        return map;
    }

    public static Order getOrderById(int id){
        for (Order order : orders){
            if (order.getID() == id){
                return order;
            }
        }
        return null;

    }

    public ArrayList<Order> getOrders(){

        return orders;
    }

    public  User getUserByLogPas(String log, String pass) {
        for (User user : users){
            if ((user.getLogin().equals(log)) && (user.getPassword().equals(pass)) ){
                return user;
            }
        }
        return null;
    }


    public  Integer getIdUserByLogPas(String log, String pass) {
        for (User user : users){
            if ((user.getLogin().equals(log)) && (user.getPassword().equals(pass)) ){
                return user.getID();
            }
        }
        return 0;
    }

    public  boolean getLogin(String log, String pass) {
        for (User user : users){
            if ((user.getLogin().equals(log)) && (user.getPassword().equals(pass))){
                return true;
            }
        }
        return false;
    }



    public String addUser(int id,String name, String pass) {
        for (User user : users){
            if ((user.getLogin().equals(name))){
                return "Такое имя уже существует";
            }
        }
        users.add(new User(id,name,pass));
        return "Регистрация прошла успешно";
    }

    public int getSizeUsers()
    {
        return users.size();
    }



    public  void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }




    public  Order getOrderById(long id) {
        for (Order or : orders){
            if (or.getID() == id){
                return or;
            }
        }
        return new Order();
    }

    public  Order getOrderByUser(long userId) {
        for (Order or : orders){
            if (or.getUserID() == userId){
                return or;
            }
        }
        return new Order();
    }


    public ArrayList<Clothing> getClothing()
    {
        return this.clothing;
    }



    public  Clothing getClothById(long id) {
        for (Clothing clothing : clothing){
            if (clothing.getID() == id){
                return clothing;
            }
        }
        return null;
    }





    public void fillInformation(){
        users.add( new User(1,"login1", "123456"));
        users.add(new User(2, "login2", "654321"));
        clothing.add(new Clothing("Куртка","Stone Island", 40000, "Техническая ткань",1));
        clothing.add(new Clothing("Шапка","Moncler", 3000, "Шерсть", 2));
        clothing.add(new Clothing("Брюки","C.P. Company", 12000, "Хлопок", 3));
        clothing.add(new Clothing("Мокасины","Timberland", 10000, "Кожа", 4));
        map.put(1, new Order());
        map.put(2, new Order());
    }
}
