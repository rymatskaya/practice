package by.task12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1. Условие
 * 1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
 * 1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
 * 1.3 Вывести все записи.
 * 1.4 Проверить, содержит ли коллекция слово Конфета
 * 1.5 Посчитать количество элементов в коллекции
 */
public class ListLesson {
    static void main() {
        ex4();
    }

    public static void ex1() {
        List<String> strings = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = new String("Как дела");
        String string3 = new String("Праздник");
        String string4 = new String("Суфле");
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        strings.add(string4);
        print(strings);
        if (strings.contains("Конфета")) {
            System.out.println("Содержит слово Конфета");
        } else {
            System.out.println("Не Содержит слово Конфета");
        }
        System.out.println("Количество элементов коллекции: " + strings.size());
    }

    /**
     * 2. Условие: Создайте ArrayList<String> для хранения списка покупок.
     * Добавь в него 5 товаров. Затем выведите весь список на экран,
     * а после — удалите один товар по названию и снова выведите обновлённый список.
     */
    public static void ex2() {
        List<String> goods = new ArrayList<>(List.of("Молоко", "Кефир", "Сметана", "Масло", "Сыр"));

        print(goods);
        goods.remove("Молоко");
        print(goods);

    }
    public static void print(List<String> strings) {
        System.out.println("Вывод коллекции: ");
        for (String word : strings) {
            System.out.println(word);
        }
    }
    /**3. Условие: Создай класс Book с полями:
     • String title
     • String author
     3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
     3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
     3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.*/
    public static void ex3() {
        Book book1 = new Book("Му-му","Тургенев");
        Book book2 = new Book("Незнайка","Носков");
        Book book3 = new Book("Сумерки","Райан");
        //List<Book> books = List.of(book1, book2, book3);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Переопределения метода equals ");
        System.out.println(book1.equals(book2));

        books.remove(books.indexOf(book3));

        System.out.println("Вывод коллекции: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    /**4. Условие: Создай ArrayList<Integer> и заполни его числами от 1 до 10.
     *  Затем создай новый список,
     *  в который добавь только чётные числа из первого списка. Выведи оба списка.*/
    public static void ex4() {

        List<Integer> numbers1 = new ArrayList<Integer>();

        List<Integer> numbers2 = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++)
        {
            numbers1.add(i);
            if (i % 2 == 0) {
                numbers2.add(i);
            }
        }
        System.out.println(numbers1);
        System.out.println("Вывод коллекции: ");
        System.out.println(numbers2);

    }

    /**8. Условие: Создай класс Book с полями:
     • String title
     • String author
     Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты
     (одинаковое название и автор). Переопределите методы equals() и hashCode() так,
     чтобы книги с одинаковыми значениями title и author считались одинаковыми.
     Выведи содержимое множества и убедись, что дубликаты не добавляются.*/
    public static void ex8() {
        Book book4 = new Book("Идиот","Достоевский");
        Book book5 = new Book("Идиот","Достоевский");
        Book book6 = new Book("Идиот","Достоевский");

        Set<Book> books = new HashSet<>();
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println("Вывод коллекции: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
