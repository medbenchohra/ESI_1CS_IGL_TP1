/**
 * An exception class which is envoked when an attampt of adding two vectors with different lengths
 */
public class SumImpossibleException extends Exception {
    @Override
    public String getMessage() {
        return "The two vectors don't have the same length";
    }
}
