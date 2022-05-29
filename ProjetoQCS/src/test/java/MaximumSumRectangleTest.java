import org.junit.jupiter.api.Test;
import java.lang.Math;


import java.util.Arrays;
import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;

class MaximumSumRectangleTest {

    @Test
    void path2Test() {
        int[][] arr = new int[0][0];
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path4Test() { //caminho 4
        int[][] arr = new int[1][0];
        System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path6Test() { //caminho 6
        int[][] arr = new int [][] {{1}};
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(1, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path7Test(){ //caminho 7
        int[][] arr = new int[][] {{Integer.MIN_VALUE}};
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(Integer.MIN_VALUE, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void path8Test() { //caminho 8
        int[][] arr = new int[][] {{-1}};
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
        assertEquals(13, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void BB4Test() {
        int arr[][] = null;
        //System.out.println(Arrays.deepToString(arr));
        assertEquals(0, MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void BB5Test() {
        int arr[][] = new int[][] {
                {(int) -(Math.pow(2,32))},
                };
        //System.out.println(Arrays.deepToString(arr));
        System.out.println(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE , MaximumSumRectangle.maxSumRectangle(arr));
    }

    @Test
    void BB6Test() {
        Random r = new Random();
        int[][] arr = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                arr[i][j] = r.nextInt(2000);
            }
            assertEquals(99889, MaximumSumRectangle.maxSumRectangle(arr));
        }
    }


}
