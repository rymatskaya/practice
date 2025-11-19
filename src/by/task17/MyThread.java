package by.task17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread extends Thread {

    private List<Integer> numbers;

    public MyThread() {
        numbers = generateRandomNumbers();
    }

    private List<Integer> generateRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100)); // случайные числа от 0 до 99
        }
        return list;
    }

    public void run() {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}



