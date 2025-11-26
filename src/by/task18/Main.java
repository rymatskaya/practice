package by.task18;

public class Main {
    static void main() {
        Mult mult = (int a, int b)  -> {
            return a*b;
        };
        int result = mult.multiplication(5,10);
        System.out.println("Произведение " + result);

        multi(mult,  5,  10);

        Mult dev = (int a, int b)  -> {
            return a/b;
        };
        int result1 = dev.multiplication(10,5);
        System.out.println("Частное " + result1);

        Mult sum = (int a, int b)  -> {
            System.out.println("a= " + a);
            System.out.println("b= " + b);
            return a+b;
        };
        int result2 = sum.multiplication(10,5);
        System.out.println("Cумма " + result2);
    }

    private static void multi(Mult mult, int a, int b) {
        mult.multiplication(a,b);
    }
}
