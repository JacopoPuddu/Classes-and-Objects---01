package Esercizio1;

public class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    public void drinkCoffee() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.println(name + " is a " + age + "-yo programmer");
    }

    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses?");
        if (!wearsGlasses) {
            System.out.println("No!");
        } else {
            System.out.println("Yes!");
        }
    }
}