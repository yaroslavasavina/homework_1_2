public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte apple = 3;
        short lemon = 5;
        int strawberry = 6;
        long cherry = 8L;
        double sugarWeight = 4.5;
        float saltWeight = 6.45f;
        boolean appleTree = apple > 7;
        char a = 42;
        char b = '*';
        System.out.println(a + " = " + b);

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double allBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксёров "+ allBoxers);
        System.out.println("Разница в весе между боксёрами " + weightDifference);

        // Задание 3
        int bananas = 5;
        int weightBananas = 80;
        int milk = 2;
        int milkWeight = 105;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int allWeight = bananas * weightBananas + milk * milkWeight + icecream * icecreamWeight + eggs * eggsWeight;
        double allWeightKg = allWeight /1000.0;
        System.out.println("Общий вес спорт-завтрака " + allWeight + " грамм.");
        System.out.println("Общий вес спорт-завтрака " + allWeightKg + " кг.");

        // Задание 4

        int weight = 7;
        double choice1 = 0.25;
        double choice2 = 0.5;
        double timeChoice1 = weight / choice1;
        double timeChoice2 = weight / choice2;
        double averageTime = (timeChoice1 + timeChoice2) /2;
        System.out.println(timeChoice1 + " дней нужно, чтобы сбрасывать по 500 гр ежедневно.");
        System.out.println(timeChoice2 + " дней нужно, чтобы сбрасывать по 250 гр ежедневно.");
        System.out.println("Среднее время составляет " + averageTime + " день.");

        // Задание 5

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        double masha10 = masha *0.1;
        double mashaUpgrade = masha + masha10;
        double denis10 = denis *0.1;
        double denisUpgrade = denis + denis10;
        double kris10 = kris *0.1;
        double krisUpgrade = kris + kris10;
        int mashaYear = masha *12;
        int denisYear = denis *12;
        int krisYear = kris *12;
        double mashaYearUpgrade = mashaUpgrade *12;
        double denisYearUpgrade = denisUpgrade *12;
        double krisYearUpgrade = krisUpgrade *12;
        double mashaDifference = mashaYearUpgrade - mashaYear;
        double denisDifference = denisYearUpgrade - denisYear;
        double krisDifference = krisYearUpgrade - krisYear;

        System.out.println("Зарплата Маши после повышения " + mashaUpgrade + " в месяц.");
        System.out.println("Зарплата Дениса после повышения " + denisUpgrade + " в месяц.");
        System.out.println("Зарплата Кристины после повышения " + krisUpgrade + " в месяц.");
        System.out.println("Годовая зарплата Маши до повышения " + mashaYear + " в год.");
        System.out.println("Годовая зарплата Дениса до повышения " + denisYear + " в год.");
        System.out.println("Годовая зарплата Кристины до повышения " + krisYear + " в год.");
        System.out.println("Годовая зарплата Маши после повышения " + mashaYearUpgrade + " в год.");
        System.out.println("Годовая зарплата Дениса после повышения " + denisYearUpgrade + " в год.");
        System.out.println("Годовая зарплата Кристины после повышения " + krisYearUpgrade + " в год.");
        System.out.println("Теперь Маша получает " + mashaUpgrade + " рублей в месяц. И годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Теперь Денис получает " + denisUpgrade + " рублей в месяц. И годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Теперь Кристина получает " + krisUpgrade + " рубля в месяц. И годовой доход вырос на " + krisDifference + " рублей.");



    }
}