package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void CashBackMax() {
        CashbackHackService service = new CashbackHackService();

        int expected = 800;
        int actual = service.remain(1200);
        assertEquals(expected, actual);
    }

    @Test
    public void CashBackMin() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);
        assertEquals(expected, actual);
    }

    @Test
    public void CashBackNon() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}