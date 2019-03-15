import main.java.future.model.Bank;
import main.java.future.model.User;
import main.java.future.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("农行", 100, "123");
        Bank bank2 = new Bank("建行", 500, "234");

        User zhangsan = new User("张三", "1", bank1);
        User lisi = new User("李四", "2", bank2);
        User wangwu = new User("王五", "3");

        List<User> userList = new ArrayList<>();
        userList.add(zhangsan);
        userList.add(lisi);
        userList.add(wangwu);

        Service service = new Service();
        CompletableFuture<String> result = CompletableFuture.supplyAsync(() -> service.getBank(userList, "1")).thenCompose(x -> CompletableFuture.supplyAsync(() -> x + service.getBank(userList, "2")));
        CompletableFuture<Integer> money = CompletableFuture.supplyAsync(() -> service.getUser(userList, "1").getBank().getMoney()).thenCompose(x -> CompletableFuture.supplyAsync(() -> x + service.getUser(userList, "2").getBank().getMoney()));

        try {
            System.out.println(result.get());
            System.out.println(zhangsan.getName() + "和" + lisi.getName() + "一共有" + money.get() + "元。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
