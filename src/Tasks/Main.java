package Tasks;

public class Main {

    public static void main(String[] args) {
        //Task1
        byte apple = 3;
        short trees = 32767;
        int wood = 5;
        long banana = 5L;
        float tomato = 10.3f;
        double carrot = 10.2;
        boolean vegetablesLength = true;
        boolean vegetablesWeight = apple > banana;
        char milk = 33;
        String villageName = "Моя Ферма";

        //Task2
        System.out.println("Task2");
        double boxerFirst = 78.2;
        double boxerSecond = 82.7;
        double weightOfAllBoxers = boxerFirst+boxerSecond;
        double weightDifference = Math.abs(boxerFirst-boxerSecond);
        System.out.println("Вес первого боксера = "+ boxerFirst + "кг." + " Вес второго боксера = " + boxerSecond + "кг.");
        System.out.println("Общий вес боксеров = "+weightOfAllBoxers+ "кг." + " Разница в их весе составляет: "+weightDifference + "кг.");


   /*Task3
           – Бананы – 5 штук (1 банан - 80 грамм);
           – Молоко – 200 мл (100 мл = 105 грамм);
           – Мороженое пломбир – 2 брикета по 100 грамм;
           – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        */
        double countOfBananas = 5.0;
        double weightOfOneBanana = 80.0;
        double countOfMilk = 200.0;
        double weightOf100Milk = 105.0;
        double countOfIcecream = 2.0;
        double weightOfOneIcecream = 100.0;
        double countOfEggs = 4.0;
        double weightOfOneEgg = 70.0;
        double weightOfBreakfast = (countOfBananas * weightOfOneBanana + (countOfMilk * weightOf100Milk / 100)+
                countOfIcecream * weightOfOneIcecream + countOfEggs * weightOfOneEgg) / 1000;
        System.out.println();
        System.out.println("Task3");
        System.out.println("Вес спорт-завтрака " + weightOfBreakfast + "кг.");

        //Task 4
        int needToSpend = 7*1000;
        int minThrow = 250;
        int maxThrow = 500;
        int maxDays = needToSpend / minThrow;
        int minDays = needToSpend / maxThrow;
        int averageResult = needToSpend / ((minThrow + maxThrow)/2);
        System.out.println();
        System.out.println("Task4");
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдёт " + maxDays + " дней");
        System.out.println("Если каждый день будет худеть на 500 грамм, то уйдёт " + minDays + " дней");
        System.out.println("Дней в среднем понадобится " + averageResult);

        //Task5
       /*
       Маша получает 67 760 рублей в месяц
       Денис получает 83 690 рублей в месяц
       Кристина получает 76 230 рублей в месяц
        */
        double incomMashaOld = 67760.00;
        double incomDenisOld = 83690.00;
        double incomKristinaOld = 76230.00;
        double incomUp = 0.1;
        double incomMashaNew = incomMashaOld*incomUp+incomMashaOld;
        double incomDenisNew = incomDenisOld*incomUp+incomDenisOld;
        double incomKristinaNew = incomKristinaOld*incomUp+incomKristinaOld;
        System.out.println();
        System.out.println("Task5");
        System.out.println("Маша теперь получает " + incomMashaNew + " рублей. Годовой доход вырос на " + (incomMashaNew-incomMashaOld) + " рублей.");
        System.out.println("Маша теперь получает " + incomDenisNew + " рублей. Годовой доход вырос на " + (incomDenisNew-incomDenisOld) + " рублей.");
        System.out.println("Маша теперь получает " + incomKristinaNew + " рублей. Годовой доход вырос на " + (incomKristinaNew-incomKristinaOld) + " рублей.");
    }
}
