package by.task18_1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Задание №2
 * 1. Создать класс авто. Поля: id, марка, пробег, год выпуска,
 * максимальная скорость, цена.

 * 1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
 * 1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)

 */
public class Main {
    static void main() {
        Car car = new Car(1, "BMW", 200000, 2015, 270, 15100.00);
        Car car1 = new Car(2, "FORD", 95000, 2015, 180, 15200.00);
        Car car2 = new Car(3, "TOYATA", 52000, 2020, 210, 15300.00);
        Car car3 = new Car(4, "AUDI", 75000, 2010, 250, 15400.00);
        Car car4 = new Car(5, "BMW", 350000, 2010, 270, 15500.00);
// * 1.1 Создать коллекцию из авто.
        List<Car> cars = List.of(car, car1, car2, car3, car4);

        //   * 1.3 Найти самую медленную машину.
        System.out.println("Найти самую медленную машину");
        Optional<Car> resultMinSpeed = cars.stream().min(Comparator.comparing(Car::getMax_speed));
        if (resultMinSpeed.isPresent()) {
            System.out.println(resultMinSpeed.get());
        }

        // * 1.4 Найти самую старую
        System.out.println("Найти самую старую");
        Optional<Car> resultMinYear = cars.stream().min(Comparator.comparing(Car::getYear));
        if (resultMinYear.isPresent()) {
            System.out.println(resultMinYear.get());
        }

// * 1.6 Найти машины, у которых пробег от 50000 до 100000.
        System.out.println("Найти машины, у которых пробег от 50000 до 100000");
        List<Car> list = cars.stream().filter(car5 -> {
            if (car5.getMileage() >= 50000 && car5.getMileage() <= 100000) {
                return true;
            }
            return false;
        }).toList();

        List<Car> list1 = cars.stream().filter(car5 -> car5.getMileage() >= 50000 && car5.getMileage() <= 100000).toList();

        System.out.println(list);
// * 1.2 Найти самую быструю машину.
        System.out.println("Найти самую быструю машину.");
        Optional<Car> resultMaxSpeed = cars.stream().max(Comparator.comparing(Car::getMax_speed));
        if (resultMaxSpeed.isPresent()) {
            System.out.println(resultMaxSpeed.get());
        }
//  1.5 Найти самую новую
        System.out.println("Найти самую новую");
        Optional<Car> resultMaxYear = cars.stream().max(Comparator.comparing(Car::getYear));
        if (resultMaxYear.isPresent()) {
            System.out.println(resultMaxYear.get());
        }
//  1.7 Найти самую дорогую машину.
        System.out.println("Найти самую дорогую машину");
        Optional<Car> resultMaxPrice = cars.stream().max(Comparator.comparing(Car::getPrice));
        if (resultMaxPrice.isPresent()) {
            System.out.println(resultMaxPrice.get());
        }
//  1.8 Найти самую дешёвую машину.
        System.out.println("Найти самую дешёвую машину");
        Optional<Car> resultMinPrice = cars.stream().min(Comparator.comparing(Car::getPrice));
        if (resultMinPrice.isPresent()) {
            System.out.println(resultMinPrice.get());
        }
//  1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию)
        System.out.println("Отсортировать машины по пробегу по возрастанию ");
        List<Car> sortedCars = cars.stream()
                .sorted(Comparator.comparingInt(Car::getMileage))
                .collect(Collectors.toList());
        System.out.println(sortedCars);
        System.out.println("Отсортировать машины по пробегу по убыванию ");
        List<Car> sortedCarsReversed = cars.stream()
                .sorted(Comparator.comparingInt(Car::getMileage).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedCarsReversed);
//  1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
        System.out.println("Отсортировать машины по стоимости по возрастанию ");
        List<Car> sortedCarsPrice = cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice))
                .collect(Collectors.toList());
        System.out.println(sortedCarsPrice);
        System.out.println("Отсортировать машины по стоимости по убыванию ");
        List<Car> sortedCarsPriceReversed = cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedCarsPriceReversed);

//  1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне
//  цен от 10000 до 20000.
        System.out.println("Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000");
        List<Car> listcars = cars.stream().filter(car5 -> {
            if (car5.getMileage() >= 20000 && car5.getMileage() <= 100000
                && car5.getPrice() >= 10000 && car5.getPrice() <= 20000 ) {
                return true;
            }
            return false;
        }).toList();

        List<Car> listcars1 = cars.stream().filter(car5 -> car5.getMileage() >= 20000 && car5.getMileage() <= 100000 && car5.getPrice() >= 10000 && car5.getPrice() <= 20000 ).toList();
        System.out.println(listcars1);

        System.out.println(listcars);

// * 1.12 Получить не повторяющиеся значения марок авто (distinct).
        System.out.println("Получить не повторяющиеся значения марок авто (distinct).");
        List<String> brands = cars.stream().map(car5 -> {
            return car5.getBrand();
        }).distinct().toList();
        System.out.println(brands);
//   1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега,
//   в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        System.out.println("Найти машину определённой марки, с заданным дипазоном скорости,\n" +
                              "//    Если таких нет, выбросить своё исключение");
        Car car6 = cars.stream().filter(car5 -> {
            if (car5.getBrand().equals("BMW") && car5.getMax_speed() > 200) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("Нет такой машины!"));

        System.out.println(car6);
    }

}
