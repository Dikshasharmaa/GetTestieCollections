package rocks.zipcode;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TestTreeMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestTreeMap() {
        Map<Integer, String> set1 = new TreeMap<>();
        set1.put(1,"Bob");
        assertEquals(true,set1.containsValue("Bob"));
        assertEquals(true,set1.containsKey(1));
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestTreeMap1(){
        Map<Integer, String> set2 = new TreeMap<>();
        set2.put(1,"Tom");
        set2.put(2,"Bob");
        set2.remove(1,"Tom");
        assertEquals(false,set2.containsValue("Tom"));
        assertEquals(false,set2.containsKey(1));

    }
    @Test
    public void TestTreeMap2(){
        Map<Integer, String> set3 = new TreeMap<>();
        set3.put(1,"Frank");
        set3.clear();
        assertEquals(false,set3.containsValue("Frank"));
    }
    @Test
    public void TestTreeMap3(){
        Map<Integer, String> set5 = new TreeMap<>();
        set5.put(1,"Rose");
        set5.put(2,"Joy");
        assertEquals(2,set5.size());
    }
    @Test
    public void TestTreeMap4(){
        Map<Integer, String> set6 = new TreeMap<>();
        set6.put(1,"Rose");
        assertEquals("Rose",set6.get(1));
    }

    }
