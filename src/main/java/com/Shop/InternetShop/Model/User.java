package com.Shop.InternetShop.Model;

public class User {

    private int ID;
    private String Login;
    private String Password;


    public User(int id, String login, String password) {
        ID = id;
        Login = login;
        Password = password;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
}
