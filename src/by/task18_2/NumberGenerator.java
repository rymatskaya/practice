package by.task18_2;

import java.util.List;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable <String> {

    private List<Integer> numbers;
    private String name;

    public NumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberGenerator(List<Integer> numbers, String name) {
        this.numbers = numbers;
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println(name + " start");
        int result = numbers.stream().mapToInt( number -> number).sum();
        Thread.sleep(10000);
        System.out.println(result);
        return String.valueOf(result);
    }
}
