/**
 * Created by Antoni on 15/10/2017.
 */
public class VectorHelper {

    /**
     * Returns the maximum and minimum values of the inserted vector
     * @param a the vector from which maximum and minimum values are retrieved
     * @return a VectorInfo instance which contains the maximum and the minimum values of the parameter
     */
    public static VectorInfo max_minVector (int[] a){
        int max,min;
        max = min = a[0];
        for (int i=1;i<a.length;i++){
            if (max < a[i]) max = a[i];
            else if (min > a[i]) min = a[i];
        }
        return new VectorInfo(min,max);
    }

    /**
     * Doubles the values of the inserted vector
     * @param a the vector to be modified
     */
    public static void multiplyVector(int[] a){
        for (int i=0; i < a.length ; i++){
            a[i] = 2*a[i];
        }
    }

    /* Mohamed added : */

    /**
     * Sorts the inserted vector
     * @param a the vector to be sorted
     */
    public static void sortVector(int[] a) {
        int c = 1;
        int tmp;

        while (c != 0) {
            c = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    c = 1;
                    tmp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = tmp;
                }
            }
        }
    }

    /**
     * Adds the values of two vectors and returns the result
     * @param v1 the first vector
     * @param v2 the second vector
     * @return the vector obtained by adding the values of the two inserted vectors
     * @throws SumImpossibleException If the two vectors doesn't have the same length
     */
    public static int[] sumVectors(int[] v1,int[] v2) throws SumImpossibleException {
        if (v1.length != v2.length) throw new SumImpossibleException();
        int [] sum = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            sum[i] = v1[i] + v2[i];
        }
        return sum;
    }

    /**
     * Reverses the inserted vector
     * @param a the vector to be reversed
     */
    public static void reverseVector(int[] a) {
        int tmp;
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            tmp = a[i];
            a[i++] = a[j];
            a[j--] = tmp;
        }
    }

    /* Helper methods */

    /**
     * Display a vector
     * @param a the vector to be displayed
     */
    public static void displayVector(int[] a) {
        System.out.print("\n( " + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(" ; " + a[i]);
        }
        System.out.print(" )\n");
    }

}

/**
 * A class used to save the minimum and maximum values of a vector
 */
class VectorInfo{
    public int min = 0;
    public int max = 0;

    VectorInfo(int min,int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return ("\n Min = " + this.min + "\n Max = " + this.max + "\n");
    }
}