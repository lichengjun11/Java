package java1702.javase.oop;

/**
 * Created by lichengjun on 2017/3/17.
 */
public class Oop5 {
    public static void main(String[] args) {
        Student student = new Student("170201","李成军",1);
        System.out.println(student.getNumber());
        System.out.println(student.getName());
        System.out.println(student.getGrade());
    }

}

class Student {
   private String number;
   private String name;
   private int grade;

    public Student(String number, String name, int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String getNumber() {

        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}