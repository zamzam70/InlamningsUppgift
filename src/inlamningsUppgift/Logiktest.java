package inlamningsUppgift;

import org.junit.Test;

import wordCounter.WordCounter;

import static org.junit.Assert.assertEquals;

public class Logiktest {

    @Test
    public void getInitialNumberOfSavedRows(){

        //assertEquals(expected, actual);
        int expected = 1;

      Logik logik = new Logik();

      // int actual =logik.getRows();

      // assertEquals(expected, actual);

    }
    @Test
    public void setOneRow(){

       /* WordCounter counter = new WordCounter();
       counter.checkText("Hej jag heter Staffan");

       //expected, Actual

        int actual= counter.getRows();
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void setTwoRow(){

        WordCounter counter = new WordCounter();
        counter.checkText("Hej jag heter Staffan");
        counter.checkText("Vilken fin och soligt dag det är");

        //expected, Actual

        int actual= counter.getRows();
        int expected = 2;
        assertEquals(expected, actual);
    }*/
}}
