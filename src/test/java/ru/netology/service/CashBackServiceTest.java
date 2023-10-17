package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackServiceTest {

    @Test
    public void shouldRemain100Amount900() {
        CashBackService service = new CashBackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain0Amount1000() {
        CashBackService service = new CashBackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain999Amount1001() {
        CashBackService service = new CashBackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain1Amount2999() {
        CashBackService service = new CashBackService();
        int amount = 2999;
        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }


}
