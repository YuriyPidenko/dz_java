//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
package dz_01;

import java.util.Scanner;

public class dz_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("введите требуемую операцию: ");
        String operator = scanner.next();
        System.out.print("введите второе число: ");
        double number2 = scanner.nextDouble();
        System.out.print("равно: ");      
        System.out.println(calc(number1, number2, operator));


    }

    static double calc(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            case "*":
                return num1 * num2;
        }
        return 0;
    }
}
