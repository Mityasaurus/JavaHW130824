import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lastname");
        String lastname = scanner.nextLine();

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + lastname + " " + name + "!");
    }
}