package ru.netology.qa54.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test

    public void testRemainOne() {

        int actual = service.remain(400);
        int expected = 600;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test

    public void testRemainTwo() {

        int actual = service.remain(0);
        int expected = 1000;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test

    public void testRemainThree() {

        int actual = service.remain(999);
        int expected = 1;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test

    public void testRemainFour() {

        int actual = service.remain(1);
        int expected = 999;

        org.junit.Assert.assertEquals(actual, expected);

    }
    @org.junit.Test

    public void testRemainMistakeInService() {

        int actual = service.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);

    }

}