package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        // first test before I write coode
        assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void Test2(){
        assertEquals(0, Recursion.countHi("xxHixx"));
    }

    @Test
    public void Test3(){
        assertEquals(2, Recursion.countHi("xxhihixx"));
    }

    @Test
    public void Test4(){
        assertEquals(2, Recursion.countHi("xxhixxhi"));
    }

    @Test
    public void Test5(){
        assertEquals(1, Recursion.countHi("xxhixxHi"));
    }

    @Test
    public void Test6(){
        assertEquals(0, Recursion.countHi("xxxx"));
    }

    @Test
    public void Test7(){
        assertEquals(1, Recursion.countHi("hi"));
    }
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
