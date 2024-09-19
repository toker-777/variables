public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        byte a = 120;
        System.out.println(a);
        short b = 31555;
        System.out.println(b);
        int c = 1351098;
        System.out.println(c);
        long d = -123456789;
        System.out.println(d);
        float e = 40f;
        System.out.println(e);
        double f = 306d;
        System.out.println(f);
    }

    public static void task2() {
        System.out.println("Задача 2");

        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786D;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int ludmilaPavlovna = 23;
        System.out.println("У Людмилы Петровны - " + ludmilaPavlovna + " ученика ");
        int annaSergeevna = 27;
        System.out.println("У Анны Сергеевны - " + annaSergeevna + " учеников ");
        int ekaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевной - " + ekaterinaAndreevna + " учеников ");
        short paper = 480;
        System.out.println("Всего закуплено - " + paper + " листов бумаги ");
        int sheetsOfPaper = paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На одного ученика рассчитано - " + sheetsOfPaper + " листов бумаги ");
    }

    public static void task4() {
        System.out.println("Задача 4");

        byte machine = 16;
        System.out.println("Производительность машины для изготовления бутылок за 2 минуты - " + machine + " бутылок ");
        byte productionOnTime = 2;
        int oneMinuteProduction = (machine / productionOnTime);
        System.out.println("За 1 минуту производится - " + oneMinuteProduction + " бутылок ");
        int twentyMinute = oneMinuteProduction * 20;
        System.out.println("За 20 минут производится - " + twentyMinute + " бутылок ");
        int oneDay = (oneMinuteProduction * 60) * 24;
        System.out.println("В сутки производится - " + oneDay + " бутылок ");
        int threeDays = oneDay * 3;
        System.out.println("За три дня производится - " + threeDays + " бутылок ");
        int oneMonth = threeDays * 10;
        System.out.println("В месяц производится - " + oneMonth + " бутылок ");

    }
}