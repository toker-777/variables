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
        long d = -123456789L;
        System.out.println(d);
        float e = 40.0f;
        System.out.println(e);
        double f = 306.0;
        System.out.println(f);
    }
    public static void task2() {
        System.out.println("Задача 2");

        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
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

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        System.out.println("У Людмилы Петровны - " + ludmilaPavlovna + " ученика ");
        System.out.println("У Анны Сергеевны - " + annaSergeevna + " учеников ");
        System.out.println("У Екатерины Андреевной - " + ekaterinaAndreevna + " учеников ");
        System.out.println("Всего закуплено - " + paper + " листов бумаги ");
        System.out.println("На одного ученика рассчитано - " + (paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna)) + " листов бумаги ");
    }
    public static void task4() {
        System.out.println("Задача 4");

        byte machine = 16;
        byte productionOnTime = 2;
        byte period = 20;
        byte days = 1;
        byte months = 1;
        System.out.println("Производительность машины для изготовления бутылок за " + productionOnTime + " минут(ы) " + machine + " бутылок ");
        System.out.println(" За " + period + " минут(ы) машина произвела - " + ((machine / productionOnTime) * period) + " штук бутылок");
        System.out.println(" За " + days + " день машина произвела - " + ((machine * 60 * 24 / productionOnTime) * days) + " штук бутылок");
        days = 3;
        System.out.println(" За " + days + " дня(ей) машина произвела - " + ((machine * 60 * 24 / productionOnTime) * days) + " штук бутылок");
        System.out.println(" За " + months + " месяц(ев) машина произвела - " + ((machine * 60 * 24 * 30 / productionOnTime) * months) + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");

        byte totalCans = 120;
        byte whitePaints = 2;
        byte brownPaints = 4;
        byte clas = 1;
        System.out.println("Всего для ремонта школы требуется - " + totalCans + " банок(ки) краски ");
        System.out.println("На один класс требуется - " + whitePaints + " банок(ки) белой краски ");
        System.out.println("Также на один класс требуется - " + brownPaints + " банок(ки) коричневой краски ");
        System.out.println("Всего для ремонта " + clas + " класса(ов) требуется - " + (whitePaints + brownPaints) + " банок(ки) с разными красками ");
        System.out.println("В школе всего - " + (totalCans  / (whitePaints + brownPaints))+ " класса(ов) ");
        System.out.println("Требуется - " + (whitePaints * totalCans  / (whitePaints + brownPaints) + " белой краски на все классы "));
        System.out.println("Требуется - " + (brownPaints * totalCans  / (whitePaints + brownPaints))+ " коричневой краски на все классы");
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte rawEggs = 70;
        System.out.println("Один банан весит - " + banana + " грамм ");
        System.out.println("100 мл молока весят - " + milk + " граммов ");
        System.out.println("Один брикет мороженного пломбир весит - " + iceCream + " грамм ");
        System.out.println("Одно сырое яйцо весит - " + rawEggs + " грамм ");
        System.out.println("Всего в блендере - " + (float)(5 * banana + 2 * (milk + iceCream) + 4 * rawEggs) / 1000 + " кг ");
    }
    public static void task7() {
        System.out.println("Задача 7");

        short smallLoss = 250;
        short loseWeight = 7000;
        short bigLoss = 500;
        System.out.println("Малая потеря в весе - " + smallLoss + " грамм ");
        System.out.println("Большая потеря в весе - " + bigLoss + " грамм ");
        System.out.println("Всего нужно сбросить в весе - " + (loseWeight / 1000) + " кг ");
        System.out.println("При потере веса в " + smallLoss + " грамм в день, потребуется - " + (byte)(loseWeight / smallLoss) + " дней ");
        System.out.println("При потере веса в " + bigLoss + " грамм в день, потребуется - " + (byte)(loseWeight / bigLoss) + " дней ");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int mashaGetPaid = 67760;
        int denisGetPaid = 83690;
        int cristinaGetPaid = 76230;
        float increaseBy = 1.1f;
        byte month = 1;
        System.out.println("Маша получает зарплату - " + mashaGetPaid + " рублей в месяц ");
        System.out.println("Денис получает зарплату - " + denisGetPaid + " рублей в месяй ");
        System.out.println("Кристина получает зарплату - " + cristinaGetPaid + " рублей в месяй ");
        System.out.println("В год Маша получает - " + 12 * month * mashaGetPaid + " рублей ");
        System.out.println("В год Денис получает - " + 12 * month * denisGetPaid + " рублей ");
        System.out.println("В год Кристина получает - " + 12 * month * cristinaGetPaid + " рублей ");
        System.out.println("У Маши повыстся зарплата до - " + (int)(mashaGetPaid * increaseBy) + " рублей ");
        System.out.println("У Дениса повыстся зарплата до - " + (int)(denisGetPaid * increaseBy) + " рублей ");
        System.out.println("У Кристины повыстся зарплата до - " + (int)(cristinaGetPaid * increaseBy) + " рублей ");
        System.out.println("Годовой доход у Маши вырос на " + (int)(12 * month * (mashaGetPaid * increaseBy - mashaGetPaid)) + " рублей ");
        System.out.println("Годовой доход у Дениса вырос на " + (int)(12 * month * (denisGetPaid * increaseBy - denisGetPaid)) + " рублей ");
        System.out.println("Годовой доход у Кристины вырос на " + (int)(12 * month * (cristinaGetPaid * increaseBy - cristinaGetPaid)) + " рублей ");
    }
}