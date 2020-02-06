package chapter15.exc4;

import org.junit.Test;
import chapter15.exc4.package$;

import static org.junit.Assert.*;

public class packageTest {

    @Test
    public void testSum() {
        assertEquals(10, package$.MODULE$.sum(1,2,3,4));
    }
}