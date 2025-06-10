package inlamningsUppgift;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Logiktest {


    @Test
    public void getteckenCount() {

        Logik logik = new Logik();

        int actual = logik.teckenCount("Zamzam");
        int expected = 6;
        //assertEquals(expected, actual);
        assertEquals(expected, actual);

    }

    @Test
    public void getlongestWord() {
        Logik logik = new Logik();
        String actual = logik.longestWord("my name is Zamzam");
        String expected = "Zamzam";
        //String expected = "Zamzam";
        assertEquals(expected, actual);
    }


    @Test
    public void setOneRow() {
        Logik logik = new Logik();
        logik.checkText("Hej jag heter Staffan");
        // logik.checkText("Vilken fin och soligt dag det är");
        int actual = logik.getRows();
        int expected = 1;
        assertEquals(expected, actual);


    }


    @Test
    public void setTwoRow() {

        Logik logik = new Logik();
        logik.checkText("Hej jag heter Staffan");
        logik.checkText("Vilken fin och soligt dag det är");
        int actual = logik.getRows();
        int expected = 2;
        assertEquals(expected, actual);
    }
}
