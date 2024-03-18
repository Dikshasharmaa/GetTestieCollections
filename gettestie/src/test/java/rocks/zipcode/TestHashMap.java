package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestHashMap {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestHashMap() {
        HashMap<String, String> set1 = new HashMap<String, String>();
        set1.put("Name1","Bob");
        assertEquals(true,set1.containsValue("Bob"));
        assertEquals(true,set1.containsKey("Name1"));
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestHashMap1(){
        HashMap<String, String> set2 = new HashMap<String, String>();
        set2.put("Name2","Tom");
        set2.put("Name3","Bob");
        set2.remove("Name2","Tom");
        assertEquals(false,set2.containsValue("Tom"));
        assertEquals(false,set2.containsKey("Name2"));

    }
    @Test
    public void TestHashMap2(){
        HashMap<String, String> set3 = new HashMap<String, String>();
        set3.put("Name4","Frank");
        set3.clear();
        assertEquals(false,set3.containsValue("Frank"));
    }
    @Test
    public void TestHashMap3(){
        HashMap<String, String> set5 = new HashMap<String, String>();
        set5.put("Name5","Rose");
        set5.put("Name6","Joy");
        assertEquals(2,set5.size());
    }
    @Test
    public void TestHashMap4(){
        HashMap<String, String> set6 = new HashMap<String, String>();
        set6.put("Name7","Rose");
        assertEquals("Rose",set6.get("Name7"));
    }

    }
