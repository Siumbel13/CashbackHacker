package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();


    @Test
    public void remain1() {
        int amount = 900;
        int expected = 100;
        int result = cashbackHackService.remain(amount);

        assertEquals(result,expected);
    }

    @Test
    public void remain2() {
        int amount = 1000;
        int expected = 0;
        int result = cashbackHackService.remain(amount);

        assertEquals(result,expected);
    }
}