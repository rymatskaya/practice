package by.lessons;

import java.util.Scanner;

public class Task_3_4_Main {
    public static void main(String[] args) {
        //1 Дано уравнение: (10+12)*x=88;. Найти значение x.
        int x;
        x = 88/ (10 + 12);
        System.out.print("Результат: ");
        System.out.println("x="+ x);

        System.out.println("**************************************");
        /* 4 Введите x,y,z.
        К числу x прибавьте y, число y умножьте на z.
         Используйте операции присваивания.

        Scanner in=new Scanner(System.in);
        System.out.println("Введите x");
        double x1=in.nextDouble();
        System.out.println("Введите y");
        double y=in.nextDouble();
        System.out.println("Введите z");
        double z =in.nextDouble();
        //double res = x + y * z;
        x1 += y;
        y *= z;
        System.out.print("Результат:");
        System.out.println("x + y * z = "+ y);*/

        /*5 Дано уравнение 213/x+258/x+60=217
        double  x2;
        x2 = (213 + 258) / (217- 60);
        System.out.print("Результат: ");
        System.out.println("x  = "+ x2);*/

        /** 6. Даны значения: x=5; y=2; c=x*y;
         * 6.2 Расставьте операции инкремента декремента так,
         * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
        int x3 = 5;
        int y3 = 2;
        int c = x3 * y3;
        x3++;
        y3--;
        System.out.println("Результат: ");
        System.out.println("c = "+ c);
        System.out.println("x = "+ x3);
        System.out.println("y = "+ y3);
        System.out.println("**************************************");*/

        /*Ввести числа a и b с консоли. Если a>b,
        то вывести разность (a-b) передав ее в новую переменную.
        Иначе если a=b  вывести сумму этих чисел.
        Иначе, вывести разность b-a.
        Результат вычисления передать в новую переменную.
        Scanner in=new Scanner(System.in);
        System.out.println("Введите a");
        double a=in.nextDouble();
        System.out.println("Введите b");
        double b=in.nextDouble();
        double res;

        if ( a > b) {
            res = a - b;
        }
        else if ( a == b) {
            res = a + b;
        }
        else {
            res = b - a;
        }
        System.out.println("Результат: " + res);
        System.out.println("**************************************");*/

        /*2. Ввести числа a и b с консоли.
        Если a>b и b не равно 0-вывести результат деления a на b.
        Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        Scanner in=new Scanner(System.in);
        System.out.println("Введите a");
        double a=in.nextDouble();
        System.out.println("Введите b");
        double b=in.nextDouble();
        double res;

        if ( a > b && b != 0) {
            res = a / b;
        }
        else if ( a != 0) {
            res = b / a;
        }
        else {
            res = b + a;
        }
        System.out.println("Результат: " + res);
        System.out.println("**************************************");*/

        /*3. На вход дано число.
         Определить, делиться ли оно на три.
         Вывести соответствующий текст.
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число ");
        int ch=in.nextInt();
        if ( ch % 3 == 0) {
            System.out.println(" Число делится на 3. ");
        }
        else {
            System.out.println(" Число не делится на 3. ");
        }*/

        /*На вход дано число. Определить, делиться ли оно на 3 и на 7,
        если нет, тогда проверить делиться ли оно на 3,
        если не делиться, то проверить, делиться ли оно на 7.
        Вывести соответствующий текст.
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число ");
        int ch=in.nextInt();
        if ( ch % 3 == 0 && ch % 7 == 0) {
            System.out.println(" Число делится на 3 и на 7. ");
        }
        else if ( ch % 3 == 0) {
            System.out.println(" Число делится на 3. ");
        }
        else if ( ch % 7 == 0) {
            System.out.println(" Число делится на 7. ");
        }
        else {
            System.out.println(" Число не делится ни на 3, ни на 7. ");
        }
        */

        /*6. На вход даны три числа. Определить максимальное из них*/
        Scanner in=new Scanner(System.in);
        System.out.println("Введите a");
        double a=in.nextDouble();
        System.out.println("Введите b");
        double b=in.nextDouble();
        System.out.println("Введите с");
        double c=in.nextDouble();
        if ( a >= b && a >= c) {
            System.out.println(" Число а максимальное = " + a);
        }
        else if ( b >= a && b>= c) {
            System.out.println(" Число b максимальное = " + b);
        }
        else {
            System.out.println(" Число c максимальное = " + c);
        }

    }
}
