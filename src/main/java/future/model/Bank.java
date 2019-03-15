package main.java.future.model;

public class Bank {
    private String name;
    private int money;
    private String id;

    public Bank(String name, int money, String id) {
        this.name = name;
        this.money = money;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
