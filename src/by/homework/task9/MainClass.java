package by.homework.task9;
/**

 * 1.9* Добавить поле в класс животное называемое номер (id). Присвоить уникальный номер каждому
 * животному в зоопарке, увеличивая значение на единицу. Реализуйте метод, который будет выводить
 * все информацию о каждом животном в зоопарке.  Реализовать метод по удалению животного из зоопарка
 * по номеру (id). Вывести информацию о все у животных в зоопарке.
 *
 * Задача
 * 1. Переопределить метод equals и hashcode в классах Птица и Собака из предыдущего задания.*/
public class MainClass {
    public static void main(String[] args) {
        /*Animal animal = new Animal("серый", 3, "насекомые");
        animal.makeSound();
        animal.play();
        System.out.println(animal.toString());*/
        Bird bird = new Bird();
        Bird bird1 = new Bird("серый", 3, "насекомые", "Утка", 200);
        bird1.makeSound();
        bird1.play();
        bird1.peck();
        bird1.incubate();
        System.out.println(bird1.toString());
        Dog dog = new Dog("серый", 12, "собачий корм", "Рекс", "овчарка", 12.0);
        dog.makeSound();
        dog.play();
        dog.bite();
        dog.jump();
        dog.run();
        System.out.println(dog.toString());

        Zoo zoo = new Zoo();

        Dog dog1 = new Dog("серый", 8, "мясо", "Рекс", "овчарка", 12.0);
        Dog dog2 = new Dog("белый", 12, "мясо курицы", "Луна", "бульдог", 10.0);
        Dog dog3 = new Dog("рыжий", 5, "мясо курицы", "Мун", "дог", 10.0);
        Dog dog4 = new Dog("рыжий", 5, "мясо курицы", "Мун", "дог", 10.0);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        Bird bird2 = new Bird("серый", 2, "трава", "гусь", 1);
        Bird bird3 = new Bird("белый", 1, "пшеница", "воробей", 500);
        Bird bird4 = new Bird("рыжий", 5, "овес",  "ласточка", 600);
        Bird bird5 = new Bird("рыжий", 5, "овес",  "ласточка", 600);

        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);
        zoo.addAnimal(bird4);

        zoo.getAnimals();

        dog1.run();
        dog2.jump();
        dog3.play();
        dog1.makeSound();

        bird2.incubate();
        bird3.peck();
        bird4.makeSound();

        Lion lion1 = new Lion("Персиковый", 30, "хищник");
        Lion lion2 = new Lion("Рыжий", 30, "хищник");
        Lion lion3 = new Lion("Песочный", 30, "хищник");

        lion1.makeSound();
        lion2.play();

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);
        zoo.getAnimals();

        zoo.delById(5);
    }
}
