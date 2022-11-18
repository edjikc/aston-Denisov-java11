package ru.aston.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataAnalyser analyser = new DataAnalyser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите: 1 - для сравнения числа, 2 - для сравнения имени, 3 - для анализа массива");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите чило.");
                int myNumber = scanner.nextInt();
                System.out.println(analyser.printHello(myNumber));
                 break;
            case 2:
                System.out.println("Введите имя");
                String name = scanner.next();
                System.out.println(analyser.printNameHello(name));
                break;
            case 3:
                System.out.println("Введите размер будущего массива (целое число), далее по одному числа массива");
                int size = scanner.nextInt();
                int[] numbers = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("следущее число");
                    numbers[i] = scanner.nextInt();
                }
                analyser.printMultiple(numbers);
                break;
            default:
                System.out.println("Неверный ввод.");
                System.exit(0);
        }
    }
}