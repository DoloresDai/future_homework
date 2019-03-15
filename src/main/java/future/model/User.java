package main.java.future.model;
public class User{
    private String name;
    private String idCard;
    private Bank bank;

    public User(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public User(String name, String idCard, Bank bank) {
        this.name = name;
        this.idCard = idCard;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "用户"+name+"的银行账户："+bank.getName()+"，余额为："+bank.getMoney()+"元。\n";
    }
}
