package Assignments;

public class Employee {
    private String name;
    private int age;

    public Employee setName(String name) {
        this.name = name;
        return this; // return current object
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        Employee emp = new Employee();
    emp.setAge(5).setName("john").display();
    }
}


