package ru.netology.stats.Stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;

public class StatserviceTest {
    @Test
    public void DayOfMinSales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);
        Assertions.assertEquals(expectedDay,actualDay);
        System.out.println(actualDay);

    }
    @Test
    public void DayOfMaxSales() {
        Statservice service = new Statservice();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);
        Assertions.assertEquals(expectedDay,actualDay);
        System.out.println(actualDay);}
}
