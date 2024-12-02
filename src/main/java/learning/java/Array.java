package learning.java;

import java.util.Scanner;

public class Array {
    private double[] array;
    private int length;

    public Array(int length) {
        this.length = length;
        this.array = new double[length];
    }

    public void inputElements(Scanner scanner) {
        System.out.println("Enter your array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
        }
    }

    public double calculateLength() {
        double sumOfSquares = 0;
        for (int i = 0; i < length; i++) {
            sumOfSquares += array[i] * array[i];
        }
        return Math.sqrt(sumOfSquares);
    }

    public void normalize() {
        double L = calculateLength();
        for (int i = 0; i < length; i++) {
            array[i] /= L;
        }
    }

    public void display() {
        System.out.println("Normalized array:");
        for (double element : array) {
            System.out.println(element + " ");
        }
    }
}
