package ru.netology.stats;

public class StatsService {
    public int getMinDay(int[] temps) {
    int minDay = 0;
    for (int i = 0; i < temps.length; i++) {
        if (temps[i] < temps[minDay]) {
            minDay = i;
        }
    }
    return minDay;
}

    public int getMinTemp(int[] temps) {
        int minDay = getMinDay(temps);
        return temps[minDay];
    }
}
