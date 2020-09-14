package exceptions.assertions;

public class ResultNotWaitedAssertion extends AssertionError{
    public static final String FAILED_VALIDATION = "La palabra clave no se guardó";
    public ResultNotWaitedAssertion(String message, Throwable cause){
        super (message, cause);
    }
}
