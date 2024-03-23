package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class TestComparable {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestComparable() {
        Person person1 = new Person("leo",2021);
        Person person2 = new Person("joe",2020);
        Person[] arr = new Person[2];
        arr[0] = person1;
        arr[1] = person2;
        Person[] expected = new Person[2];
        expected[0] = person2;
        expected[1] = person1;
        Arrays.sort(arr);
        Assert.assertEquals(expected,arr);

    }

}
