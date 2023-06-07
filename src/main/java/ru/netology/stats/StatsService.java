package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }


    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int MonthMaxSales(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int MonthMinSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }


    public int SalesBelowAverage(long[] sales) {
        long averageSales = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int SalesAboveAverage(long[] sales) {
        long averageSales = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}



