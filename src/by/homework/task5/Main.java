package by.homework.task5;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1 Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)
                System.out.print("Результат: ");
                for (int i = 1; i < 100; i++) {
                    if (i % 7 == 0 || i % 3 == 0 ) {
                        System.out.println(i + "\t");
                    }
                }
                System.out.println("**************************************");
            }
            case "2" -> {
                /*  Ввести 2 положительных числа с консоли с помощью сканера.
                Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).
                Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте
                в эту переменную сумму чисел.*/
                int sum=0;
                int x;
                int y;

                do {
                    System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число x: ");
                    x = in.nextInt();
                } while (x < 0) ;

                do {
                    System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число y, большее х : ");
                    y = in.nextInt();
                } while (y < x) ;
                x++;
                System.out.println("sum: " + sum);
                while (x < y)
                {
                    //System.out.println("x: " + x);
                    sum += x;
                    //System.out.println("sum: " + sum);
                    x++;
                }
                System.out.println("Результат: " + sum);
                System.out.println("**************************************");
            }
            case "3" -> {
                /** 3* . Ввести число с консоли, которое не заканчивается на 0.
                 * Вывести число в обратном порядке. Использовать оператор %.*/
                int x;
                do {
                    System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число x, не кратное 10: ");
                    x = in.nextInt();
                } while (x < 0 || x % 10 == 0)  ;
                 String result = "";
                while (x % 10 > 0)
                {
                  result = result +  x % 10;
                  x = (int) x / 10;
                }
                System.out.println("Результат  равен " + result);

                System.out.println("**************************************");
            }
            case "4" -> {
                /** Ввести число с консоли, которое не заканчивается на 0.
                 * Вывести чётные и нечётные числа через while and if. Использовать оператор %.*/
                int x;
                do {
                    System.out.println("Введите ПОЛОЖИТЕЛЬНОЕ число x, не кратное 10: ");
                    x = in.nextInt();
                } while (x < 0 || x % 10 == 0)  ;
                String ch = "";
                String nch = "";
                while (x % 10 > 0)
                {
                    if (x % 2 == 0) {
                        ch = ch + x % 10 + " ";
                    }
                    else {
                        nch = nch + x % 10 + " ";
                    }

                    x = (int) x / 10;
                }
                System.out.println("Четные: " + ch);
                System.out.println("Нечетные: " + nch);

                System.out.println("**************************************");
            }

            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }
    }
}
