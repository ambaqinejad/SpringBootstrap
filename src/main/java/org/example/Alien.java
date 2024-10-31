package org.example;

public class Alien {
    private int age;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age is " + age);
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien object created");
    }

    public void code() {
        System.out.println("I'm coding ...");
        computer.compile();
    }
}
