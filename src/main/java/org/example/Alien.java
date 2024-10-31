package org.example;

public class Alien {
    private int age;
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
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

    public Alien(int age) {
        System.out.println("Alien object created with age " + age);
        this.age = age;
    }

    public Alien(int age, Laptop laptop) {
        System.out.println("Alien object created with age " + age + " and laptop " + laptop);
        this.age = age;
        this.laptop = laptop;

    }

    public void code() {
        System.out.println("I'm coding ...");
        laptop.compile();
    }
}
