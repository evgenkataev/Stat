package ru.netology.stats.Stat;

public class Statservice {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum;
    }

    public int midValue(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum += value;
        }
        return sum / sales.length;
    }

    public int bigThenMidValue(int[] sales) {
        int sum=0;
        for (int value:sales) {
            sum += value;
        }
        int mid = sum/sales.length;
        int bigThen =0;
        for (int i=0;i<sales.length;i++){
            if (sales[i]>=mid){
              bigThen =i;
            }
        }
        return bigThen;
    }

}
