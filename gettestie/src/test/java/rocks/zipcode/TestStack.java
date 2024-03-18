package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestStackPop(){
        Stack<String> stack2 = new Stack<>();
        stack2.push("Hi,How are you?");
        stack2.pop();
        assertEquals(true,stack2.isEmpty());

    }
    @Test
    public void TestStackPeek(){
        Stack<String> stack3 = new Stack<>();
        stack3.push("Hi 1");
        stack3.push("Hi 2");
        stack3.push("Hi 3");
        assertEquals("Hi 3",stack3.peek());
    }
    @Test
    public void TestStackEmpty(){
        Stack<String> stack4 = new Stack<>();
        stack4.empty();
        assertEquals(true,stack4.isEmpty());
    }


}
