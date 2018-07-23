package hexarithmetic;

public interface ArithmeticOperations {
    String add(String firstNumber, String secondNumber) throws NumberNotValidException;

    String subtract(String firstNumber, String secondNumber) throws NumberNotValidException;

    String multiply(String firstNumber, String secondNumber) throws NumberNotValidException;

    String divide(String firstNumber, String secondNumber) throws ArithmeticException, NumberNotValidException;

    boolean isEqual(String firstNumber, String secondNumber) throws NumberNotValidException;

    boolean isGreater(String firstNumber, String secondNumber) throws NumberNotValidException;

    boolean isLess(String firstNumber, String secondNumber) throws NumberNotValidException;
}
