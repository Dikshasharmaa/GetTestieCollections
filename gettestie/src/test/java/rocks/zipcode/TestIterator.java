package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class TestIterator {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void TestArrayList1(){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("cars");
        array1.add("cars1");
        array1.add("cars2");
        Iterator<String> it = array1.iterator();
        assertEquals(true,it.hasNext());

    }
    @Test
    public void TestArrayList2(){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("cars");
        array1.add("cars1");
        array1.add("cars2");
        Iterator<String> it = array1.iterator();
        //String expected;
        assertEquals("cars",it.next());
        assertEquals("cars1",it.next());

    }
    @Test
    public void TestArrayList3(){
        ArrayList<String> array1 = new ArrayList<String>();

        array1.add("cars");
        array1.add("cars1");
        array1.add("cars2");
        Iterator<String> it = array1.iterator();
        it.next();
        it.remove();
        assertEquals(2,array1.size());


    }



}
