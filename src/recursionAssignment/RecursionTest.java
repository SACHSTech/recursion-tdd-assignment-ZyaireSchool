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
    @Test
    public void Test8(){
        assertEquals(0, Recursion.countHi("h"));
    }
    @Test
    public void Test9(){
        assertEquals(0, Recursion.countHi(" "));
    }
    
    //from now on that is problem set 2
    @Test
    public void Test10(){
      //first test, red test
        assertEquals("x3.14x", Recursion.changePi("xpix"));
    }

    @Test
    public void Test11(){
        assertEquals("3.143.14", Recursion.changePi("pipi"));
    }

    @Test
    public void Test12(){
        assertEquals("3.14p", Recursion.changePi("pip"));
    }

    @Test
    public void Test13(){
        assertEquals(" ", Recursion.changePi(" "));
    }

    //problem set 3
    @Test
    public void Test14(){
        assertEquals(true, Recursion.array220(new int[]{1, 2, 20}, 0));
    }

    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
