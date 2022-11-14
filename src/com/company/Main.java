package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Сепаратор блять ахазхаххахахахаха
        System.out.println("Введите операцию:" + System.lineSeparator() + "1. Сложение" + System.lineSeparator() + "2. Вычитание" + System.lineSeparator() + "3. Умножение" + System.lineSeparator() + "4. Деление");
        var scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result = 0;
        //Это проба с IDEA
        if (operation == 1) {
            result = a + b;
            System.out.println(String.format("Результат = %s ", result));
        } else if (operation == 2) {
            result = a - b;
            System.out.println(String.format("Результат = %s ", result));
        } else if (operation == 3) {
            result = a * b;
            System.out.println(String.format("Результат = %s ", result));
        } else if (operation == 4 && b == 0) {
            System.out.println("На ноль делить нельзя");
        } else if (operation == 4 && b != 0) {
            result = a / b;
            System.out.println(String.format("Результат = %s ", result));
        } else {
            System.out.println("Введите правильную команду");
        }
    }
}
