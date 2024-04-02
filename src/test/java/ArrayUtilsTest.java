import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }


    @Test
    public void testFindLastEmpty() {
        // For any input where y appears in the second or later position, there is no error. Also,
        // if x is empty, there is no error.
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        // Any nonempty x with only non-negative elements works, because the first part of the
        // compound if-test is not necessary unless the value is negative.
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testCountOf_TargetInArray() {
        int[] arr = {1, 2, 3, 4, 1, 5};
        int target = 1;
        assertEquals(2, ArrayUtils.countOf(arr, target)); // Expecting 2 occurrences of 1
    }

    @Test
    public void testCountOf_TargetNotInArray() {
        int[] arr = {2, 3, 4, 5};
        int target = 1;
        assertEquals(0, ArrayUtils.countOf(arr, target)); // Expecting 0 occurrences of 1
    }

    @Test
    public void testCountOf_EmptyArray() {
        int[] arr = {};
        int target = 3;
        assertEquals(0, ArrayUtils.countOf(arr, target)); // Expecting 0 occurrences of 3
    }

    @Test
    public void testCountOf_OnlyTargetInArray() {
        int[] arr = {7, 7, 7, 7, 7};
        int target = 7;
        assertEquals(5, ArrayUtils.countOf(arr, target)); // Expecting 5 occurrences of 7
    }

    @Test
    public void testCountOf_MultipleOccurrencesOfTarget() {
        int[] arr = {2, 3, 4, 4, 2, 4, 1, 4};
        int target = 4;
        assertEquals(4, ArrayUtils.countOf(arr, target)); // Expecting 4 occurrences of 4
    }


}