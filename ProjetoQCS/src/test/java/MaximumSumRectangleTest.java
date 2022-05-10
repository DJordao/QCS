import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumRectangleTest {

    @Test
    void path1Test() {
        int[][] arr = new int[0][0];
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path6Test() {
        int[][] arr = new int[1][0];
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path8Test() {
        int[][] arr = new int [][] {{1}};
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(1, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path9Test(){
        int[][] arr = new int[][] {{Integer.MIN_VALUE}};
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path10Test() {
        int[][] arr = new int[][] {{-1}};
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(-1, MaximumSumRectangle.maxSumRectangle(arr));
    }
}
