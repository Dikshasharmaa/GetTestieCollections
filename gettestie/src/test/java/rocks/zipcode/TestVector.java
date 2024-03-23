package rocks.zipcode;

import org.junit.Test;

import java.util.Stack;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestVector() {
        Vector<String> vector = new Vector<String>();
        vector.add("Hello world");
        assertEquals(false, vector.isEmpty());
    }

    @Test
    public void TestVector1(){
        Vector<String> vector = new Vector<String>();
        vector.add("Hey");
        vector.set(0,"hello");
        assertEquals("hello",vector.get(0));

    }
    @Test
    public void TestVector2(){
        Vector<String> vector = new Vector<String>();
        vector.add("Hey");
        vector.add("everyone");
        vector.remove("Hey");
        assertEquals(false,vector.contains("Hey"));
    }


}
