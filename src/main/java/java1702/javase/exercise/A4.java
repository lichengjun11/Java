package java1702.javase.exercise;

/**
 * Created by Li chengjun
 * on 2017/4/8 15:43.
 */
//有工人,农民,教师,科学家,服务生,其中,工人,农民,服务生只有基本工资.教师除基本工资外,还有课酬(元/天),
// 科学家除基本工资外,还有年终奖,请你写出相关类,并编写测试类将各种类型的员工的全年工资打印出来。
public class A4 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    private int pay;

    public A4(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    public class Scientist extends A4 {

        public Scientist(String name, int pay) {
            super(name, pay);
        }
    }
}
