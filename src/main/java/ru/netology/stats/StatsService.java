package ru.netology.stats;

public class StatsService {

    public int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSum(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsMoreAvg(long[] sales) {
        long avg = avgSum(sales);
        int monthsCount = 0;
        for (long sale : sales) {
            if (sale > avgSum(sales)) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    public int monthsLessAvg(long[] sales) {
        long avg = avgSum(sales);
        int monthsCount = 0;
        for (long sale : sales) {
            if (sale < avgSum(sales)) {
                monthsCount++;
            }
        }
        return monthsCount;
    }
}
