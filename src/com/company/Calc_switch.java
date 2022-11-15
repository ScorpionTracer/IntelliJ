package com.company;

import java.util.Scanner;

public class Calc_switch {
    public static void main(String[] args) {

        System.out.println("Введите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление");
        var scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        double result = 0;
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b == 0) {
                    throw new ArithmeticException("На ноль делить нельзя");
                } else {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Выберите правильную команду");
                break;
        }
        System.out.println(String.format("Результат = %f ", result));
    }
}
