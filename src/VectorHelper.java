/**
 * Created by Antoni on 15/10/2017.
 */
public class VectorHelper {

    public VectorInfo max_minVector (int[] a){
        int max,min;
        max = min = a[0];
        for (int i=1;i<a.length;i++){
            if (max < a[i]) max = a[i];
            else if (min > a[i]) min = a[i];
        }
        return new VectorInfo(min,max);
    }

    public static int[] multiplyVector(int[] a){
        int[] c = null;
        for (int i=0; i < a.length ; i++){
            c[i] = 2*a[i];
        }
        return c;
    }

    /* Mohamed added : */
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

    /* Helper methods */

    public static void displayVector(int[] a) {
        System.out.print("( " + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(" ; " + a[i]);
        }
        System.out.print(" )");
    }

}

class VectorInfo{
    public static int min = 0;
    public static int max = 0;

    VectorInfo(int min,int max){
        this.min = min;
        this.max = max;
    }
}