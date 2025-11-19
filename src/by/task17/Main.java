package by.task17;
/*Использовать Reader, Writer
1. Записать его в файл прописал относительный путь.
2. Записать его в файл прописав абсолютный путь.
3. Вычитать текст из первого файла.
4. Вычитать текст из второго файла
5. Создать объект Ферма с полями. Выполнить сериализацию и
десериализацию в файл. (интерфейс Externelizibel)*/

/*1. Создать 5 потоков, каждый из которых вычисляет среднее арифметическое
коллекции из 5 случайных целых чисел и выводит на экран. Потоки решать двумя
способоами через класс Thread и интерфейс Runnable*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String text = "Сериализация объектов - это процесс сохранения " +
            "состояния объектов в виде последовательности байтов, а также процесс" +
            " восстановления в дальнейшем из этих байтов \"живых\" объектов. Java" +
            " Serialization API предоставляет разработчикам Java стандартный механизм " +
            "управления сериализацией объектов. API мал и легок в применении, а его классы" +
            " и методы просты для понимания. ";

    static void main() throws IOException, ClassNotFoundException {
        writeToRelativeFile();
        writeToAbsoluteFile();

        readFromRelativeFile();
        readFromAbsoluteFile();
        writeSer();
        readSer();

        for (int i = 0; i < 5; i++) {
            new MyThread().start();
        }

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    public static void writeSer() {

        Farm farm = new Farm("Конюшня", 5542.25);
        Farm farm2 = new Farm("Коровник", 542.00);

        ArrayList farms = new ArrayList<>();
        farms.add(farm);
        farms.add(farm2);
        //создаем 2 потока для сериализации объекта и сохранения его в файл
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\Java\\save.ser"))) {
            // FileOutputStream outputStream = ;

           // objectOutputStream.writeObject(farm);
           // objectOutputStream.writeObject(farm2);
           objectOutputStream.writeObject(farms);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readSer() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:\\Java\\save.ser"))) {
            //FileInputStream fileInputStream =

            // System.out.println(objectInputStream.readObject());
            // System.out.println(objectInputStream.readObject());

            List<Farm> Listfarms = (List<Farm>) objectInputStream.readObject();
            System.out.println(Listfarms.get(0));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 1.1 Запись в файл с относительным путем
    public static void writeToRelativeFile() {
        try (FileWriter writer = new FileWriter("output_rel.txt")) {
            writer.write(text);
            System.out.println("Данные записаны в файл с относительным путем");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // 1.2 Запись в файл с абсолютным путем
    public static void writeToAbsoluteFile() {
        try (FileWriter writer = new FileWriter("d:\\Irka\\Java\\output_abs.txt")) {
            writer.write(text);
            System.out.println("Данные записаны в файл с абсолютным путем");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // 1.3 Чтение из файла с относительным путем
    public static void readFromRelativeFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output_rel.txt"))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Содержимое файла с относительным путем:\n" + content);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

    // 1.4 Чтение из файла с абсолютным путем
    public static void readFromAbsoluteFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("d:\\Irka\\Java\\output_abs.txt"))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Содержимое файла с абсолютным путем:\n" + content);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

}
