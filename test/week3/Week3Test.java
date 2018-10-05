package week3;

import org.junit.Assert;
import org.junit.Test;


public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()

    @Test
    public void maxtest1() {
        Assert.assertEquals(10, Week3.max(10, 6));
    }

    @Test
    public void maxtest2(){
        Assert.assertEquals(9, Week3.max(-3, 9));
    }

    @Test
    public void maxtest3(){
        Assert.assertEquals(-3, Week3.max(-3, -9));
    }

    @Test
    public void maxtest4(){
            Assert.assertEquals(-10, Week3.max(-27, -10));
    }

    @Test
    public void maxtest5(){
        Assert.assertEquals(0, Week3.max(-11, 0));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()

    @Test
    public void mintest1() {
        int[] arr1 = {8, 2, 3, 4, 1};
        Assert.assertEquals(1, Week3.minOfArray(arr1));
    }

    @Test
    public void mintest2() {
        int[] arr2 = {3, 9, 10, 40, 0, 3, -1};
        Assert.assertEquals(-1, Week3.minOfArray(arr2));
    }

    @Test
    public void mintest3() {
        int[] arr3 = {-27, -1, -2, -8, -6, 10, 23, 35};
        Assert.assertEquals(-27, Week3.minOfArray(arr3));
    }

    @Test
    public void mintest4() {
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, -9};
        Assert.assertEquals(-9, Week3.minOfArray(arr4));
    }

    @Test
    public void mintest5() {
        int[] arr5 = {-2, -6, 4, 7, 9, -10, -11};
        Assert.assertEquals(-11, Week3.minOfArray(arr5));
    }


    // TODO: Viết 5 testcase cho phương thức calculateBMI()

    @Test
    public void BMItest1() {
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(42.5, 1.53));
    }

    @Test
    public void BMItest2() {
        Assert.assertEquals("Bình thường", Week3.calculateBMI(50.0, 1.6));
    }

    @Test
    public void BMItest3() {
        Assert.assertEquals("Bình thường", Week3.calculateBMI(53.5, 1.6));
    }

    @Test
    public void BMItest4() {
        Assert.assertEquals("Béo phì", Week3.calculateBMI(80, 1.65));
    }

    @Test
    public void BMI5(){
        Assert.assertEquals("Béo phì", Week3.calculateBMI(76.6, 1.69));
    }
}
