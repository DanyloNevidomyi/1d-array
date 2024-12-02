package learning.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entering array length
        System.out.println("Enter length of your array: ");
        int length = scanner.nextInt();

        double[] array = new double[length];

        // entering elements of array
        System.out.println("Enter your array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
        }

        // counting L length
        double sumOfSquares = 0;
        for (int i = 0; i < length; i++){
            sumOfSquares += array[i] * array[i];
        }
        double L = Math.sqrt(sumOfSquares);

        // Normalising array
        System.out.println("Normalised array:");
        for (int i = 0; i < length; i++) {
            array[i] /= L;
            System.out.println(array[i] + " ");
        }
    }
}