package Exceptions;

public class EmptyExpressionException extends Exception {
    @Override
    public String toString() {
        return "Empty expression in InputParser. Use read() method first.";
    }
}
