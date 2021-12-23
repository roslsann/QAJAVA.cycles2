package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldcalcSum() {
        int expected = 180;
        int actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldavgSum() {
        int expected = 15;
        int actual = service.avgSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldmaxSalesMonth() {
        int expected = 8;
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldminSalesMonth() {
        int expected = 9;
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldmonthsMoreAvg() {
        int expected = 5;
        int actual = service.monthsMoreAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldmonthsLessAvg() {
        int expected = 5;
        int actual = service.monthsLessAvg(sales);

        assertEquals(expected, actual);
    }

}