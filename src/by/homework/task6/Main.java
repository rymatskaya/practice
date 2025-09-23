package by.homework.task6;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String task = in.nextLine();

        switch (task) {
            case "1" -> {
                //1Создать массив из 10 элементов.
                // Заполните массив числами и вывести их в консоль (выводите через цикл for each).
                // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив
                // в консоль через цикл for each
                int[ ] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } ;
                for(int x: nums) {
                    System.out.print("" + x + "\t");
                }
                System.out.print("Результат: ");
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        nums[i] = 0;
                      }
                }
                for(int x: nums) {
                    System.out.print("" + x + "\t");
                }
                System.out.println("\n**************************************");
            }
            case "2" -> {
                /*  Создать массив из 5 чисел и заполните этот массив вручную.
                 Создайте второй массив с размерностью больше на 1 чем первый массив.
                 Необходимо скопировать первый массив со всеми значениями во второй массив.
                 Последний элемент во втором массиве пусть будет 0.
                 Выведите второй массив в консоль с помощью цикла for each.*/

                int[] a = new int[5];
                int[] b = new int[6];
                for (int i = 0; i < a.length; i++) {
                    System.out.println("Введите " + i +"-тый элемент массива: ");
                    a[i] = in.nextInt();
                    //b[i] = a[i];
                }

                for (int i = 0; i < a.length; i++) {
                    b[i] = a[i];
                }

                for(int x: b) {
                    System.out.print("" + x + "\t");
                }
                System.out.println("\n**************************************");
            }
            case "3" -> {
                /** 3* . Создать массив вручную. Заменить максимальный и минимальный элемент массива.
                 * Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.*/

                int size;
                do {
                    System.out.println("Введите размерность массива: ");
                    size = in.nextInt();
                } while (size < 1 )  ;

                int[] a = new int[size];
                for (int i = 0; i < a.length; i++) {
                    System.out.println("Введите " + i +"-тый элемент массива: ");
                    a[i] = in.nextInt();
                }
                int max = a[0];
                int imax = 0;
                int min = a[0];
                int imin = 0;
                for (int i = 1; i < a.length; i++) {
                    if (a[i] < min) {
                        min = a[i];
                        imin = i;
                    }
                    if (a[i] > max) {
                        max = a[i];
                        imax = i;
                    }
                }
                a[imin] = -1000;
                a[imax] = 1000;

                for(int x: a) {
                    System.out.print("" + x + "\t");
                }
                System.out.println("\n**************************************");
            }
            case "4" -> {
                /** Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
                 * Вывести полученный массив. Выполнить с помощью цикла for      */
                int size;
                do {
                    System.out.println("Введите размерность массива: ");
                    size = in.nextInt();
                } while (size < 1 )  ;

                int[] a = new int[size];
                for (int i = 0; i < a.length; i++) {
                    System.out.println("Введите " + i +"-тый элемент массива: ");
                    a[i] = in.nextInt();
                }

                for (int j = a.length - 1; j > 0; j--) {
                    for (var i = 0; i < j; i++) {
                        if (a[i] > a[i + 1]) {
                            var temp = a[i];
                            a[i] = a[i + 1];
                            a[i + 1] = temp;
                        }
                    }
                }


                for(int x: a) {
                    System.out.print("" + x + "\t");
                }
                System.out.println("\n**************************************");
            }

            default -> System.out.println("Нет такого пункта меню. Попробуйте еще раз.");
        }
    }
}
