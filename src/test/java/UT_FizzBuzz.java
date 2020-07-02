import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UT_FizzBuzz {


    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testForReturningLucky() {
        assertEquals(fizzBuzz.LUCKY, fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testForReturningFizz() {
        assertEquals(fizzBuzz.FIZZ, fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void testForReturningBuzz() {
        assertEquals(fizzBuzz.BUZZ, fizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testForReturningFizzBuzz() {
        assertEquals(fizzBuzz.FIZZBUZZ, fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testForReturningNumber() {
        assertEquals("22", fizzBuzz.fizzBuzz(22));
    }

    @Test
    public void testFizzBuzzResults() {
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", fizzBuzz.runFizzBuzz(20));
    }

}
