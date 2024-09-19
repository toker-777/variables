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
    public static void task5() {
        System.out.println("Задача 5");

        int totalCans = 120;
        System.out.println("Всего для ремонта школы требуется - " + totalCans + " банок краски ");
        int whitePaints = 2;
        System.out.println("На один класс требуется - " + whitePaints + " банки белой краски ");
        int brownPaints = 4;
        System.out.println("Также на один класс требуется - " + brownPaints + " банки коричневой краски ");
        int allPaints = (whitePaints + brownPaints);
        System.out.println("Всего для ремонта 1 класса требуется - " + allPaints + " банок с красками ");
        int totalClasses = (totalCans / allPaints);
        System.out.println("В школе всего - " + totalClasses + " классов ");
        int allWhitePaints = (totalClasses * whitePaints);
        System.out.println("Требуется - " + allWhitePaints + " белой краски на один класс ");
        int allBrownPaints = (totalClasses * brownPaints);
        System.out.println("Требуется - " + allBrownPaints + " коричневой краски на один класс ");
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte banana = 80;
        System.out.println("Один банан весит - " + banana + " грамм ");
        byte milk = 105;
        System.out.println("100 мл молока весят - " + milk + " граммов ");
        byte iceCream = 100;
        System.out.println("Один брикет мороженного пломбир весит - " + iceCream + " грамм ");
        byte rawEggs = 70;
        System.out.println("Одно сырое яйцо весит - " + rawEggs + " грамм ");
        float mixBlender = (5 * banana + 2 * milk + 2 * iceCream + 4 * rawEggs);
        System.out.println("Всего в блендере - " + mixBlender + " граммов ");
        float kgBlender = mixBlender / 1000;
        System.out.println("Или - " + kgBlender + " кг ");
    }
    public static void task7() {
        System.out.println("Задача 7");

        short smallLoss = 250;
        System.out.println("Малая потеря в весе - " + smallLoss + " грамм ");
        short bigLoss = 500;
        System.out.println("Большая потеря в весе - " + bigLoss + " грамм ");
        short needToReset = 7000;
        System.out.println("Всего нужно сбросить в весе - " + (needToReset / 1000) + " кг ");
        int lowWeightLoss = needToReset / smallLoss;
        System.out.println("При потере веса в " + smallLoss + " грамм, потребуется - " + lowWeightLoss + " дней ");
        int bigWeightLoss = needToReset / bigLoss;
        System.out.println("При потере веса в " + bigLoss + " грамм, потребуется - " + bigWeightLoss + " дней ");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int mashaGetPaid = 67760;
        System.out.println("Маша получает зарплату - " + mashaGetPaid + " рублей в месяц ");
        int denisGetPaid = 83690;
        System.out.println("Денис получает зарплату - " + denisGetPaid + " рублей в месяй ");
        int cristinaGetPaid = 76230;
        System.out.println("Кристина получает зарплату - " + cristinaGetPaid + " рублей в месяй ");
        int oneYearMashaGet = 12 * mashaGetPaid;
        System.out.println("В год Маша получает - " + oneYearMashaGet + " рублей ");
        int oneYearDenisGet = 12 * denisGetPaid;
        System.out.println("В год Денис получает - " + oneYearDenisGet + " рублей ");
        int oneYearCristinaGet = 12 * cristinaGetPaid;
        System.out.println("В год Кристина получает - " + oneYearCristinaGet + " рублей ");
        int increaseSalaryMasha = (int) (mashaGetPaid * 1.1);
        System.out.println("У Маши повыстся зарплата до - " + increaseSalaryMasha + " рублей ");
        int increaseSalaryDenis =(int) (denisGetPaid * 1.1);
        System.out.println("У Дениса повыстся зарплата до - " + increaseSalaryDenis + " рублей ");
        int increaseSalaryCristina = (int)(cristinaGetPaid * 1.1);
        System.out.println("У Кристины повыстся зарплата до - " + increaseSalaryCristina + " рублей ");
        int incomeDifferenceMasha = 12 * increaseSalaryMasha - oneYearMashaGet;
        System.out.println("Годовой доход у Маши вырос на " + incomeDifferenceMasha + " рублей ");
        int incomeDifferenceDenis = 12 * increaseSalaryDenis - oneYearDenisGet;
        System.out.println("Годовой доход у Дениса вырос на " + incomeDifferenceDenis + " рублей ");
        int incomeDifferenceCristina = 12 * increaseSalaryCristina - oneYearCristinaGet;
        System.out.println("Годовой доход у Кристины вырос на " + incomeDifferenceCristina + " рублей ");
    }
}