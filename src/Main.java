import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Dog");
            System.out.println("2. Chicken");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    menuDog();
                    break;
                case 2:
                    menuChicken();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Please choose again.");
            }
        }
    }

    private static void menuDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of dogs: ");
        int numDogs = scanner.nextInt();
        scanner.nextLine();

        Dog[] dogs = new Dog[numDogs];
        for (int i = 0; i < numDogs; i++) {
            dogs[i] = new Dog();
            dogs[i].input();
        }

        for (Dog dog : dogs) {
            dog.info();
        }
    }

    private static void menuChicken() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chickens: ");
        int numChickens = scanner.nextInt();
        scanner.nextLine();

        Chicken[] chickens = new Chicken[numChickens];
        for (int i = 0; i < numChickens; i++) {
            chickens[i] = new Chicken();
            chickens[i].input();
        }

        for (Chicken chicken : chickens) {
            chicken.info();
        }
    }

    static class Dog {
        String name;
        int age;

        void input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter dog's name: ");
            name = scanner.nextLine();
            System.out.print("Enter dog's age: ");
            age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        void info() {
            System.out.println("Dog Name: " + name);
            System.out.println("Dog Age: " + age);
        }
    }

    static class Chicken {
        String name;
        String color;

        void input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter chicken's name: ");
            name = scanner.nextLine();
            System.out.print("Enter chicken's color: ");
            color = scanner.nextLine();
        }

        void info() {
            System.out.println("Chicken Name: " + name);
            System.out.println("Chicken Color: " + color);
        }
    }
}
