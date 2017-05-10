package java1702.javase.multithreafing;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Li chengjun
 * on 2017/5/10 14:20.
 */
// Account  账户
public class Account {

    private int money;

    public Account(int money) {
        this.money = money;
    }

        //synchronized 添加这个关键字之后只有一个线程能进来，其他线程要等这个线程执行完之后再进入
     void withdraw(int money){
         synchronized(this){
             // synchronized  同步
         }
            System.out.println(Thread.currentThread().getName());
        if(this.money - money < 0){
            System.out.println("Not enough...");
            return;
        }
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         this.money -= money;
        System.out.println("get the money...");

    }
    public int getMoney() {
        return money;
    }

}
class Person implements Runnable{
    private static Account account = new Account(1000);
    @Override
    public void run() {
        account.withdraw(1000);
    }

    public static void main(String[] args) {
        Thread boy = new Thread(new Person(),"boy");
        Thread girl = new Thread(new Person(),"girl");
        boy.start();
        girl.start();
        try {
            boy.join();
            girl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("money:" + account.getMoney());
    }
}