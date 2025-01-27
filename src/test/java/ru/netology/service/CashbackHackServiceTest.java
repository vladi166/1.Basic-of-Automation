package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
