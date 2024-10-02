public class Main {
    public static void main(String[] args) {
        System.out.println("------------Задача №1-----------");
        byte meaningByte = -103;
        short meaningShort = 20253;
        int meaningInt = -1174567;
        long meaningLong = 1045787412L;
        float meaningFloat = -45.23423f;
        double meaningDouble = 3.141592653589793;
        System.out.println("Значение переменной meaningByte с типом byte равно " + meaningByte + ";");
        System.out.println("Значение переменной meaningShort с типом short равно " + meaningShort + ";");
        System.out.println("Значение переменной meaningInt с типом int равно " + meaningInt + ";");
        System.out.println("Значение переменной meaningLong с типом long равно " + meaningLong + ";");
        System.out.println("Значение переменной meaningFloat с типом float равно " + meaningFloat + ";");
        System.out.println("Значение переменной meaningDouble с типом double равно " + meaningDouble + ";");
        System.out.println(" ");
        System.out.println("------------Задача №2-----------");
        float meaning1 = 27.12f;
        long meaning2 = 987678965549L;
        float meaning3 = 2.786f;
        short meaning4 = 569;
        short meaning5 = -159;
        short meaning6 = 27897;
        byte meaning7 = 67;
        System.out.println("Значение " + meaning1 + " типа float;");
        System.out.println("Значение " + meaning2 + " типа long;");
        System.out.println("Значение " + meaning3 + " типа float;");
        System.out.println("Значение " + meaning4 + " типа short;");
        System.out.println("Значение " + meaning5 + " типа short;");
        System.out.println("Значение " + meaning6 + " типа short;");
        System.out.println("Значение " + meaning7 + " типа byte;");
        System.out.println(" ");
        System.out.println("------------Задача №3-----------");
        byte studentsLp = 23;
        byte studentsAs = 27;
        byte studentsEa = 30;
        short sheets = 480;
        short sheetsStudent = (short) (sheets / (studentsLp + studentsAs + studentsEa));
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");
        System.out.println(" ");
        System.out.println("------------Задача №4-----------");
        byte bottle = 16;
        byte time = 2;
        byte speed = (byte) (bottle / time);
        System.out.println("Производительность машины " + bottle + " бутылок за " + time + " минуты, т.е. скорость машины составляет " +
                speed + " бутылок в минуту");
        short quantityBottle = (short) (speed * 20);
        System.out.println("За 20 минут машина произвела " + quantityBottle + " штук бутылок;");
        short quantityBottleDay = (short) (speed * 60 * 24);
        System.out.println("за сутки машина произвела " + quantityBottleDay + " штук бутылок;");
        int quantityBottleDay1 = quantityBottleDay * 3;
        System.out.println("за 3 дня машина произвела " + quantityBottleDay1 + " штук бутылок;");
        int quantityBottleMonth = quantityBottleDay * 30;
        System.out.println("за 30 дней машина произвела " + quantityBottleMonth + " штук бутылок(за 31 день произвела " +
                (quantityBottleMonth + quantityBottleDay) + " штук бутылок);");
        System.out.println(" ");
        System.out.println("------------Задача №5-----------");
        byte numberCans = 120;
        byte brown = 4;
        byte white = 2;
        byte numberClass = (byte) (numberCans / (brown + white));
        byte numberBrown = (byte) (brown * numberClass);
        byte numberWhite = (byte) (white * numberClass);
        System.out.println("В школе, где " + numberClass + " классов, нужно " + numberWhite + " банок белой краски и " +
                numberBrown + " банок коричневой краски;");
        System.out.println(" ");
        System.out.println("------------Задача №6-----------");
        short waightIngridient = 80;
        short quantytiIngridient = 5;
        short comonBananas = (short) (waightIngridient * quantytiIngridient);
        System.out.println("Общий вес бананов составляет - " + comonBananas + " г.");
        short waightIngridientMilk = 105;
        byte quantytiIngridientMilk = (byte) (200 / 100);
        short comonMilk = (short) (quantytiIngridientMilk * waightIngridientMilk);
        System.out.println("Общий вес молока составляет - " + comonMilk + " г.");
        waightIngridient = 100;
        quantytiIngridient = 2;
        short comonCream = (short) (waightIngridient * quantytiIngridient);
        System.out.println("Общий вес мороженного составляет - " + comonCream + " г.");
        waightIngridient = 70;
        quantytiIngridient = 4;
        short comonEgg = (short) (waightIngridient * quantytiIngridient);
        System.out.println("Общий вес яиц составляет - " + comonEgg + " г.");
        short weightG = (short) (comonEgg + comonCream + comonMilk + comonBananas);
        int grPerKg = 1000;
        float weightKg = weightG / (float) grPerKg;
        System.out.println("Итоговый вес завтрака спортсмена составляет - " + weightG + " г.(" + weightKg + (" кг.)"));
        System.out.println(" ");
        System.out.println("------------Задача №7-----------");
        float resetWeight = 7f;
        short resetDay1 = 250;
        short resetDay2 = 500;
        byte quantityDay1 = (byte) (resetWeight / (resetDay1 / 1000f));
        byte quantityDay2 = (byte) (resetWeight / (resetDay2 / 1000f));
        System.out.println(quantityDay1 + " - дней уйдет на сброс веса в " + resetWeight + " кг. при ежедневном сбросе " + (int) (resetDay1) + " г;");
        System.out.println(quantityDay2 + " - дней уйдет на сброс веса в " + resetWeight + " кг. при ежедневном сбросе " + (int) (resetDay2) + " г;");
        byte averagQuantity = (byte) ((quantityDay1 + quantityDay2) / 2);
        System.out.println("В среднем спортсмен похудеет на " + resetWeight + " кг. за - " + averagQuantity + " день.");
        System.out.println(" ");
        System.out.println("------------Задача №8-----------");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte percent = 10;
        byte numberMonth = 12;
        int incresedMasha = salaryMasha + (int) (salaryMasha * percent / 100f);
        int incresedDenis = salaryDenis + (int) (salaryDenis * percent / 100f);
        int incresedKristina = salaryKristina + (int) (salaryKristina * percent / 100f);
        int incomeDeferencMasha = (incresedMasha - salaryMasha) * numberMonth;
        int incomeDeferencDenis = (incresedDenis - salaryDenis) * numberMonth;
        int incomeDeferencKristina = (incresedKristina - salaryKristina) * numberMonth;
        System.out.println("Маша теперь получает " + incresedMasha + " рублей. Годовой доход вырос на " + incomeDeferencMasha +
                " рублей.");
        System.out.println("Денис теперь получает " + incresedDenis + " рублей. Годовой доход вырос на " + incomeDeferencDenis +
                " рублей.");
        System.out.println("Кристина теперь получает " + incresedKristina + " рублей. Годовой доход вырос на " + incomeDeferencKristina +
                " рублей.");

    }
}