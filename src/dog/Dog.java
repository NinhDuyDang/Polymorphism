package dog;
import animal.Animal;

import java.util.Scanner;

public class Dog extends Animal {
    private String breed;

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dog's name: ");
        name = scanner.nextLine();
        System.out.print("Enter dog's breed: ");
        breed = scanner.nextLine();
        sound = "Woof";
    }

    @Override
    public void info() {
        System.out.println("Dog: " + name + ", Breed: " + breed + ", Sound: " + sound);
    }
}
