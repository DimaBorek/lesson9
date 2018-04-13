package anatherpackage;
import static java.lang.System.*;


import javax.tools.JavaCompiler;

public class Student {
    static void m1(){
        int a = 10;
        System.out.println(a);
        Student st = new Student(18, "asd");
        System.out.println(st);
        m2(a,st);
        System.out.println(a);
        System.out.println(st);

    }
    static void m2(int i,Student student){
        System.out.println(i);
        System.out.println(student);
        i=100;
        System.out.println(i);
        student.setAge(123);
        System.out.println(student);
        student = new Student(20,"NewName");
        System.out.println(student);
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return "age = "+age+",name ="+name;
    }
    public static int counter;

    {
        counter++;
    }

    {
        age = 25;
        name = "Ivan";
        school = new School(237, "address   ");
    }
    private int age=12;
    private String name = "gena";
    private School school;




    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public Student(School school) {
        this(20, "Ivan");
        this.school = school;
    }

    public Student() {

    }

    public static void main(String[] args) {
        Student st = new Student(21,"vasia");
        System.out.println(st.getName());
        System.out.println(st.getAge());
        Student st2 = new Student();
        System.out.println(st2.getName());
        System.out.println(st2.getAge());
        m1();

        java.util.Scanner scaaner = new java.util.Scanner(System.in);
        System.out.println(Student.counter);


    }

}

class School {
    private int number;
    private String address;

    public School(int number, String address) {
        this.address = address;
        this.number = number;
    }
    static {
        System.out.println("static initializer");
    }
}




