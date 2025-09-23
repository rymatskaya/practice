package by.homework.task4;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1 На вход даны 3 числа. Вывести в консоль только четные числа
                System.out.println("Введите x");
                int x = in.nextInt();
                System.out.println("Введите y");
                int y = in.nextInt();
                System.out.println("Введите z");
                int z = in.nextInt();
                System.out.print("Результат: ");
                if (x % 2 == 0) {
                    System.out.println("Четное " + x);
                }
                if (y % 2 == 0) {
                    System.out.println("Четное " + y);
                }
                if (z % 2 == 0) {
                    System.out.println("Четное " + z);
                }

                System.out.println("**************************************");
            }
            case "2" -> {
                /* На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
                 (используйте оператор % для проверки деления без остатка)*/
                System.out.println("Введите x");
                int x = in.nextInt();
                System.out.println("Введите y");
                int y = in.nextInt();
                System.out.println("Введите z");
                int z = in.nextInt();
                System.out.print("Результат:");
                String str = "";
                if ( x % 10 == 0) {
                    str = str + " " + x;
                }
                if ( y % 10 == 0) {
                    str = str + " " + y;
                }
                if ( z % 10 == 0) {
                    str = str + " " + z;
                }
                System.out.println(" Числа, которые делится на 2 и на 5: "+ str);
                System.out.println("**************************************");
            }
            case "3" -> {
                /** Дано 15/x=result, где x-число, которое вводится с командной строки,
                 * result-результат вычисления. Написать программу, которая будет выводит разный текст,
                 * в зависимости от значения result.
                 * В случае result=3 вывести: "Результат деления равен 3"
                 * В случае result=5 вывести: "Результат деления равен 5"
                 * В других случаях вывести: "Результат деления равен дробному числу".
                 * При этом в последнем случае вывести точный результат деления
                 * (использовать приведение типов)
                 Для выполнения задания использовать оператор switch- case*/
                System.out.println("Введите x");
                int x = in.nextInt();
                System.out.println("Результат: ");
                double result;
                if (15 % x == 0) {
                    System.out.println("Результат деления равен " + 15 / x);
                }
                else {
                    System.out.println("Результат деления равен дробному числу. ");
                }

                System.out.println("**************************************");
            }

            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }
    }
}
