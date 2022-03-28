package Esercizio1;

public class TestProgrammer {
    public static void main(String[] args) {

        /*
         * Creation of two new objects of type "Programmer"
         */

        Programmer Prog1 = new Programmer();
        Programmer Prog2 = new Programmer();

        /*
         * Initialization of the two objects
         */

        Prog1.name = "Antonio";
        Prog1.age = 25;
        Prog1.wearsGlasses = true;

        Prog2.name = "Claudio";
        Prog2.age = 28;
        Prog2.wearsGlasses = false;

        /*
         * Tests of the methods requested
         */

        System.out.println("-------------------------------------------");

        // This one prints out the phrase about espresso with a little addition

        System.out.println(Prog1.name + " what is the key to coding?");
        Prog1.drinkCoffee();

        // This method prints the details of the programmer

        Prog1.printDetails();

        System.out.println("-------------------------------------------");

        Prog2.printDetails();

        // This method prints out the boolean variable, checking if a programmer wears glasses

        Prog2.hasGlasses();

        System.out.println("-------------------------------------------");

    }
}
