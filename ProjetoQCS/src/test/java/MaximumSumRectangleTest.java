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
        int arr[][] = new int[1][1];
        arr[0][0] = Integer.MIN_VALUE;
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path10Test() {
        int[][] arr = new int[1][1];
        arr[0][0] = -1;
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(-1, MaximumSumRectangle.maxSumRectangle(arr));
    }

    //Black Box testing
    @Test
    void BB1Test() {
        int arr[][] = new int[][] {
                {  1,  2, -1, -4, -20 },
                { -8, -3,  4,  2,  1 },
                {  3,  8, 10,  1,  3 },
                { -4, -1,  1,  7, -6 } };
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(29, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void BB2Test() {
        int arr[][] = new int[][] {
                {  1,  2,  7, -6 } };
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(10, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void BB3Test() {
        int arr[][] = new int[][] {
                {  1,  2 },
                { -4, -1,  1, 12 } };
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(3, MaximumSumRectangle.maxSumRectangle(arr));
    }

}
