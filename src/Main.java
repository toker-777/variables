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

        byte howManyBanana = 5;
        short howMachMilk = 200;
        byte howMuchIceCream = 2;
        byte howMuchRawEggs = 4;
        byte bananaWeight = 80;
        byte hundredMlMilk = 100;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte rawEggsWeight = 70;
        int i = howManyBanana * bananaWeight + (howMachMilk / hundredMlMilk) * milkWeight + howMuchIceCream * iceCreamWeight + howMuchRawEggs * rawEggsWeight;
        System.out.println(" всего в блендере - " + i + " грамм(ов) коктейля ");
        System.out.println(" Или " + (float) i / 1000 + " кг ");
    }
    public static void task7() {
        System.out.println("Задача 7");

        short smallLoss = 250;
        short loseWeight = 7000;
        short bigLoss = 500;
        System.out.println("При потере веса в " + smallLoss + " грамм в день, потребуется - " + (byte)(loseWeight / smallLoss) + " дней ");
        System.out.println("При потере веса в " + bigLoss + " грамм в день, потребуется - " + (byte)(loseWeight / bigLoss) + " дней ");
        System.out.println("В среднем может потребоваться для похудения - " + (byte) ((loseWeight / smallLoss) + (loseWeight / bigLoss)) / 2 + " день(дней) ");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int mashaGetPaid = 67760;
        int denisGetPaid = 83690;
        int cristinaGetPaid = 76230;
        byte percentageIncrease = 10;
        float increaseBy = (float)(percentageIncrease + 100) / 100;
        byte year = 12;
        System.out.println("Сейчас Маша получает зарплату - " + mashaGetPaid + " рубля(ей) в месяц.");
        System.out.println("Годовой доход Маши - " + year * mashaGetPaid + " рубля(ей).");
        System.out.println("При увеличении зарплаты на - " + percentageIncrease + " %, годовой доход составит - " + (int)(year * (mashaGetPaid * increaseBy)) + " рубля(ей).");
        System.out.println("Разница между годовым доходом - " + (int)(year * (mashaGetPaid * increaseBy - mashaGetPaid)) + " рубля(ей)");
        System.out.println("Теперь Маша получает зарплату - " + (int)(mashaGetPaid * increaseBy) + " рубля(ей) в месяц, что на - " + (int)(mashaGetPaid * increaseBy - mashaGetPaid) + " рубля(ей) в месяц больше, чем в прошлом году.");
        System.out.println("...");
        System.out.println("Сейчас Денис получает зарплату - " + denisGetPaid + " рубля(ей) в месяц.");
        System.out.println("Годовой доход Дениса - " + year * denisGetPaid + " рубля(ей).");
        System.out.println("При увеличении зарплаты на - " + percentageIncrease + " %, годовой доход составит - " + (int)(year * (denisGetPaid * increaseBy)) + " рубля(ей)");
        System.out.println("Разница между годовым доходом - " + (int)(denisGetPaid * increaseBy) + " рубля(ей).");
        System.out.println("Теперь Денис получает зарплату - " + (int)(denisGetPaid * increaseBy) + " рубля(ей) в месяц, что на - " + (int)(denisGetPaid * increaseBy - denisGetPaid) + " рубля(ей) в месяц больше, чем в прошлом году.");
        System.out.println("...");
        System.out.println("Сейчас Кристина получает зарплату - " + cristinaGetPaid + " рубля(ей) в месяц.");
        System.out.println("Годовой доход Кристины - " + year * cristinaGetPaid + " рубля(ей).");
        System.out.println("При увеличении зарплаты на - " + percentageIncrease + " %, годовой доход составит - " + (int)(year * (cristinaGetPaid * increaseBy)) + " рубля(ей)");
        System.out.println("Разница между годовым доходом - " + (int)(year * (cristinaGetPaid * increaseBy - cristinaGetPaid)) + " рубля(ей).");
        System.out.println("Теперь Кристина получает зарплату - " + (int)(cristinaGetPaid * increaseBy) + " рубля(ей) в месяц, что на - " + (int)(cristinaGetPaid * increaseBy - cristinaGetPaid) + " рубля(ей) в месяц больше, чем в прошлом году.");

    }
}