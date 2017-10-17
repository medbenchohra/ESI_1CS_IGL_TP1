
public class Main {

    public static void main(String[] args) {

        int[] a = {99,8,5,8,2,654,5,2,1,9};
        int[] b = {0,1,5,8,2,4,5,2,1,9};

        VectorHelper.displayVector(a);
        VectorHelper.displayVector(b);
        try {
            VectorHelper.displayVector(VectorHelper.sumVectors(a,b));
        } catch (SumImpossibleException e) {
            e.getMessage();
        }

    }

}
