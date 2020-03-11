package classwork5;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomMathTest {
    @Before
    public void bef(){
        System.out.println("test start");
    }
    @After
    public void af(){
        System.out.println("test stop");
    }

    @Test
    public void div() {
        assertTrue(CustomMath.div(10, 2) == 5);
        assertEquals(3, CustomMath.div(99, 33));
    }

    @Test
    public void sumPositive() {
        int res = CustomMath.sum(10, 15);
        assertTrue(res == 25);
        assertFalse(res != 25);
        assertEquals(25, res);
//        assertEquals(20, res);
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        CustomMath.div(10, 0);
    }


}