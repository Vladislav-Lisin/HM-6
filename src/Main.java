public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        //task 2
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //task 3
        System.out.println();
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        //task 4
        System.out.println();
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //task 5
        System.out.println();
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //task 6
        System.out.println();
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //task 7
        System.out.println();
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //task 8
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        //task 9
        float savings1 = 0f;
        for (int i = 1; i <= 12; i++) {
            savings1 += 29000;
            savings1 *= 1.12f;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings1 + " рублей"); }

        //task 10
        int two = 2;
        for (int i = 1; i <= 10; i ++) {
            System.out.println(two + " * " + i + " = " + i * two);
        }

    }
}