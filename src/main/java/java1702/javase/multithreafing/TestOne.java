package java1702.javase.multithreafing;

/**
 * Created by Li chengjun
 * on 2017/5/14 13:27.
 */
public class TestOne {
    public TestOne(int money) {
        this.money = money;
    }

    private int money;//  创建一个域   钱
    synchronized void withdraw(int money){  // 创建一个方法。。取钱的过程
        System.out.println(Thread.currentThread().getName());
        if (this.money - money < 0) {
            System.out.println("余额不足，取钱失败");
            return;
        }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.money -= money;
        System.out.println("get the money  ");
        }

    public int getMoney() {
        return money;  // 创建get方法。  获取剩余的钱数
    }


}
class TestOneTest implements Runnable{
    private static TestOne testOne =new TestOne(1000);  // static  类对象只有一个
    @Override
    public void run() {
        testOne.withdraw(1000);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new TestOneTest(),"boy");
        Thread thread2 = new Thread(new TestOneTest(),"girl");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(testOne.getMoney());
    }
}
