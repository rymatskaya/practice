package by.homework.task2;
//Срок выполнения 28.09.2025.
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1 Дано уравнение x/6+25=98. Найти x и вывести его в консоль
                int x;
                x = 6 * (98 - 25);
                System.out.print("Результат: ");
                System.out.println("x=" + x);

                System.out.println("**************************************");
            }
            case "2" -> {
            /* 4 x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился.
                x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)*/

                System.out.println("Введите x");
                double x1 = in.nextDouble();
                System.out.println("Введите y");
                double y = in.nextDouble();
                System.out.println("Введите z");
                double z = in.nextDouble();
                x1 =+ 5;
                y *= 9;
                z -= 6;
                System.out.print("Результат:");
                System.out.println("x = " + x1);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("**************************************");
            }
            case "3" -> {
                /** Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе,
                 * присвоить числу c значение 10. (тернарный оператор)*/
                int a = 35;
                int b = 65;
                int c = a > b ? 5 : 10;
                System.out.println("Результат: ");
                System.out.println("c = " + c);
                System.out.println("**************************************");
            }
            case "4" -> {
               /* Даны значения: x=5; y=2; c=x*y; Расставьте операции инкремента декремента так,
               чтобы после выполнения операции (c=x*y) с равнялось 12,
                x=равнялось 6, y=1 Выведите полученные значения в консоль. */
                int x = 5;
                int y = 2;
                int c = ++x * y--;

                System.out.println("Результат: " + c);
                System.out.println("**************************************");
            }
            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }
    }
}
