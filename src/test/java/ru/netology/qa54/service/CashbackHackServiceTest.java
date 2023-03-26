package ru.netology.qa54.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test

    public void testRemainOne() {

        int actual = service.remain(400);
        int expected = 600;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void testRemainTwo() {

        int actual = service.remain(0);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void testRemainThree() {

        int actual = service.remain(999);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void testRemainFour() {

        int actual = service.remain(1);
        int expected = 999;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void testRemainWithMistake() {

        int actual = service.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);

    }

}