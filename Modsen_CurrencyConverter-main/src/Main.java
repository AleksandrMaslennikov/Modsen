import Exceptions.EmptyExpressionException;
import Logic.InputParser;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputParser parser = new InputParser();
        System.out.print("Введите выражение: ");

        try {
            parser.read();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }

        try {
            System.out.println("Результат: " + parser.calculate());
        } catch (EmptyExpressionException e) {
            System.err.println(e);
        }
    }
}
