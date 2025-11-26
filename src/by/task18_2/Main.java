package by.task18_2;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    static void main() {
        List<Integer> numbers1 = List.of(1,2,3,4);
        List<Integer> numbers2 = List.of(5,6,7,8);
        List<Integer> numbers3 = List.of(-5,9,-3,4);
        List<Integer> numbers4 = List.of(-55,95,-35,45);

        NumberGenerator numberGenerator1 = new NumberGenerator(numbers1, "first");
        NumberGenerator numberGenerator2 = new NumberGenerator(numbers2, "second");
        NumberGenerator numberGenerator3 = new NumberGenerator(numbers3, "thrid");
        NumberGenerator numberGenerator4 = new NumberGenerator(numbers4, "fourth");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(numberGenerator1);
        Future<String> future2 = executorService.submit(numberGenerator2);
        Future<String> future3 = executorService.submit(numberGenerator3);
        Future<String> future4 = executorService.submit(numberGenerator4);

//        try {
//            future1.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

    }
}
