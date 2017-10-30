package state_pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {
    Movie _movie;
    @Test
    public void testPriceCode() {
        _movie = new Movie("Paul",1);
        //assertEquals(20, _movie.getCharge(10));
        assertEquals(29.0,_movie.getCharge(10),1.1);
    }
}