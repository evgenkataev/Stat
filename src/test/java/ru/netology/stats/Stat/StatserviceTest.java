package ru.netology.stats.Stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatserviceTest {
    @Test
    public void MonthOfMinSales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);

    }

    @Test
    public void MonthOfMaxSales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }

    @Test
    public void SummarySales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
        System.out.println(actualSum);
    }

    @Test
    public void MidValueSales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMid = 15;
        int actualMid = service.midValue(sales);
        Assertions.assertEquals(expectedMid, actualMid);
        System.out.println(actualMid);
    }
    @Test
    public void BigThenMid () {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBig = 7;
        int actualBig = service.bigThenMidValue(sales);
        Assertions.assertEquals(expectedBig, actualBig);
        System.out.println(actualBig);
    }
}
