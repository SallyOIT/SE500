import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ransong on 4/10/16.
 */
public class ContainsDuplicateTest {

    @Test public void testContainsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = { 1, 2, 3, 4, 5, 5, 6 };
        assertTrue(containsDuplicate.containsDuplicate(nums));

        int[] numsWithoutDuplicate = { 1, 2, 3, 4, 5, 6 };
        assertFalse(containsDuplicate.containsDuplicate(numsWithoutDuplicate));
    }

}