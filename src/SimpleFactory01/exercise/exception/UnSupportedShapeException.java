package SimpleFactory01.exercise.exception;

public class UnSupportedShapeException  extends Exception{

    public UnSupportedShapeException() {
        super();
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }
}
