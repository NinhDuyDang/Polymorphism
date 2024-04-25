package chicken;

import animal.Animal;

import java.util.Scanner;

public class Chicken extends Animal {
    private int eggsPerDay;

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter chicken's name: ");
        name = scanner.nextLine();
        System.out.print("Enter eggs per day: ");
        eggsPerDay = scanner.nextInt();
        sound = "Cluck";
    }


    @Override
    public void info() {
        System.out.println("Chicken: " + name + ", Eggs per day: " + eggsPerDay + ", Sound: " + sound);
    }
}
