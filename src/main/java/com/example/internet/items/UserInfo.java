package com.example.internet.items;

public class UserInfo {
    private String firstname;
    private String secondname;
    private String email;
    private String phone;
    private String adress;
    private String data;
    private String data_time;
    private String service;
    private String addition;

    public UserInfo(String firstname, String secondname, String email, String phone, String adress, String data, String data_time, String service, String addition) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.data = data;
        this.data_time = data_time;
        this.service = service;
        this.addition = addition;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getSecondName() {
        return secondname;
    }

    public String getEmail() {return email;}
    public String getPhoneNumber() {
        return phone;
    }

    public String getData() { return data; }

    public String getData_time() { return data_time; }

    public String getAdress() {
        return adress;
    }

    public String getService() {
        return service;
    }

    public String getAdditionText() {
        return addition;
    }
}
