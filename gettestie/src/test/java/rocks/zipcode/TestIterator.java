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
        assertEquals(true,array1.contains("cars"));

    }
    @Test
    public void TestArrayList2(){
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("cars");
        array2.set(0,"electric cars");
        assertEquals(true,array2.contains("electric cars"));

    }
    @Test
    public void TestArrayList3(){
        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("cars");
        array3.remove("cars");
        assertEquals(false,array3.contains("cars"));

    }
    @Test
    public void TestArrayList4(){
        ArrayList<String> array4 = new ArrayList<String>();
        array4.add("cars");
        array4.clear();
        assertEquals(false,array4.contains("cars"));

    }
    @Test
    public void TestArrayList5(){
        ArrayList<String> array5 = new ArrayList<String>();
        array5.add("cars");
        array5.add("electric cars");
        assertEquals(2,array5.size());

    }
    @Test
    public void TestArrayList6(){
        ArrayList<String> array6 = new ArrayList<String>();
        array6.add("cars");
        array6.add("Tesla");
        assertEquals("cars",array6.get(0));

    }


}
