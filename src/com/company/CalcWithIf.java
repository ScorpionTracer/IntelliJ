package com.company;

import java.util.Scanner;

public class CalcWithIf {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление");
        var scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        double result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя");
            } else {
                result = a / b;
            }
        } else {
            throw new Exception("Введите правильную команду");
        }
        System.out.printf("Результат = %f", result);
    }
}



