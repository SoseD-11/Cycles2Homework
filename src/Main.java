public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание-1");
        //Задание-1
        int savingPerMonth = 15_000;
        int initialCapital =0;
        int months = 1;
        while(initialCapital < 2_459_000){
            months++;
            initialCapital = initialCapital + initialCapital/100;
            initialCapital = initialCapital + savingPerMonth;
        System.out.println("Месяц " + months + " сумма накоплений равна " + initialCapital + " рублей");
        }
        //Задание-2
        int i = 0;
        while(i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 10;i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание-3
        int populationY = 12_000_000;
        float fertilityYear = (float)17/1000;
        float mortalityYear = (float)8/1000;
        float increasePerYear = fertilityYear - mortalityYear;
        int year = 0;
        while(year < 10){
        populationY = populationY + Math.round(populationY * increasePerYear);
        year++;
        System.out.println("Год " + year + " численность населения составляет " + populationY);
        }
        System.out.println("Домашнее задание-2");
        //Задание-1
        int firstAccumulation = 15_000;
        int monthS = 0;
        while(firstAccumulation < 12_000_000) {
            firstAccumulation += firstAccumulation * 7 / 100;
            monthS++;
            System.out.println("Месяц " + monthS + " сумма накоплений равна " + firstAccumulation + " рублей" );
        }
        System.out.println("Задание-2");
        int first = 15_000;
        int monthZ = 0;
        while(first < 12_000_000){
            first = first + first * 7/100;
            monthZ++;
            if(monthZ % 6 == 0){
                System.out.println("Месяц " + monthZ + " сумма накоплений равна " + first + " рублей");
            }
        }
        //Задание-3
        int f = 15_000;
        int monthC = 0;
        while(monthC < 12 * 9) {
        f = f +f * 7/100;
        monthC++;
        if(monthC % 6 == 0){
            System.out.println("Месяц " + monthC + " сумма накоплений равна " + f + " рублей");
        }
        }
        //Задание-4
        int friday = 1;
        while (friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
         friday += 7;
        }
        // Домашнее задание-3.

        System.out.println("   ДЗ 3.");
        // Задание - 1.
        System.out.println("   Задание - 1.");
        int nowADays = 2022;
        int year1 = nowADays - 200;
        int future = nowADays + 100;
        for (int u = year1; u <= future; u++){
            if (i % 79 ==0){
                System.out.println(u);
            }
        }

        // Задание-2.
        System.out.println("   Задание - 2.");
        for (int factor = 1; factor <= 10; factor++) {
            System.out.println("2 * " + factor + " = " + 2 * factor);
        }


    }
}