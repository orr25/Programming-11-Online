import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){

        assertEquals(testSet.size(), 0);      //should be empty
        assertFalse(testSet.contains(3));     //should not contain 3
        testSet.insert(3);                    //insert a 3
        assertEquals(testSet.size(), 1);      //set should have 1 number
        testSet.insert(5);                     //insert a 5
        assertEquals(test.size(), 2);          //size is now 2
        testSet.insert(3);                     //insert a 3 (should fail)
        assertEquals(test.size(),2);           //size still 2
        assertTrue(testSet.contains(3));       //set contains a 3
        assertTrue(testSet.contains(5));       //set contains a 5


    }
}
