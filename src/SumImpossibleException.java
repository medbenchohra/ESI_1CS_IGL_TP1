public class SumImpossibleException extends Exception {
    @Override
    public String getMessage() {
        return "The two vectors don't have the same length";
    }
}
