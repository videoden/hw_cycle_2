public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int deposite = 15_000;
        int monthNumber = 0;
        while (sum < 2_459_000) {
            sum = sum + sum / 100;
            sum = sum + deposite;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int natality = 17;
        int mortality = 8;
        int population = 12_000_000;
        int yearNumber = 1;
        for (; yearNumber <= 10; yearNumber++) {
            population = population + (population / 1000 * natality) - (population / 1000 * mortality);
            System.out.println("Год " + yearNumber + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 0;
        int monthNumber = 1;
        int deposite = 15_000;
        while (total <= 12_000_000) {
            total = total + deposite + total / 100 * 7;
            System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + total);
            monthNumber++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 0;
        int monthNumber = 1;
        int deposite = 15_000;
        while (total <= 12_000_000) {
            total = total + deposite + total / 100 * 7;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + total);
            }
            monthNumber++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 0;
        int monthNumber = 1;
        int deposite = 15_000;
        while (monthNumber <= 108) {
            total = total + deposite + total / 100 * 7;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + total);
            }
            monthNumber++;

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int date = 7;
        while (date <= 31) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            date = date + 7;
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        while (year<=2022){
            year=year+79;
            if (year>=1822){
                System.out.println(year);
            }
        }
    }
}