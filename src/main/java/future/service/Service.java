package main.java.future.service;

import main.java.future.model.User;

import java.util.List;

public class Service {
    public  User getUser(List<User> list, String idCard) {
        return list.stream().filter(x -> x.getIdCard().equals(idCard)).findFirst().get();
    }
    public  String getBank(List<User> list, String idCard) {
        User user = getUser(list, idCard);
        return user.toString();
    }

}
