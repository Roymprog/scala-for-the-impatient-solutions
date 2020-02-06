package chapter15.exc5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadFileTest {
    @Test public void readString() {
        String s = ReadFileInto.String("src/main/scala/chapter15/exc5/txt.txt");
        assertEquals(s, "This is a text that will be read\n" +
                "It contains multiple lines\n" +
                "And will be read into a String");
    }
}
