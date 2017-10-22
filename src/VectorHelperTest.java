import org.junit.runners.Parameterized;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by Antoni on 18/10/2017.
 */
public class VectorHelperTest {
    @org.junit.Test
    public void max_minVector() throws Exception {
        int[] para = new int[] {1,3,-9,4};
        VectorInfo reslt = new VectorInfo(-9,4);
        VectorInfo ret = VectorHelper.max_minVector(para);
        assertEquals(reslt.toString(),ret.toString());

    }

    @org.junit.Test
    public void multiplyVector() throws Exception {
        int[] para = new int[] {1,3,-9,4};
        int[] reslt = new int[] {2,6,-18,8};
        VectorHelper.multiplyVector(para);
        assertArrayEquals(reslt,para);
    }

    @org.junit.Test
    public void sortVector() throws Exception {
        int[] para = new int[] {1,3,-9,4};
        int[] reslt = new int[] {-9,1,3,4};
        VectorHelper.sortVector(para);
        assertArrayEquals(reslt,para);
    }

    @org.junit.Test
    public void sumVectors() throws Exception {
        int[] paraa = new int[] {1,3,-9,4};
        int[] parab = new int[] {1,3,-9,4};
        int[] reslt = new int[] {2,6,-18,8};
        int[] sum = VectorHelper.sumVectors(paraa,parab);
        assertArrayEquals(reslt,sum);
    }

    @org.junit.Test
    public void reverseVector() throws Exception {
        int[] para = new int[] {1,3,-9,4};
        int[] reslt = new int[] {4,-9,3,1};
        VectorHelper.reverseVector(para);
        assertArrayEquals(reslt,para);
    }

}