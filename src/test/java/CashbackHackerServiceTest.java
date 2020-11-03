import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @org.testng.annotations.Test
    void shouldRemain0withAmountEqualsToBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemain1withAmountEquals999() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemain1000withAmountEquals0() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemainOnewithAmountEquals999() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemainZeroWithAmountMoreBoundary() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1200;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}