package learning.java;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of your array: ");
        int length = scanner.nextInt();

        Array array = new Array(length);

        array.inputElements(scanner);

        array.normalize();

        array.display();

        scanner.close();
    }
}
