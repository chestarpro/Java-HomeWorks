package TaskA;

public class Calculator {

    public static int calculate(int a, int b, String operation) {
        if(operationValidate(operation)) {
            if(divideByZero(b, operation)) {
                return switch (operation) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> 0;
                };
            }
        }
        return 0;
    }

    public static boolean operationValidate(String operation) {
        return operation.equals("+") ||
                operation.equals("-") ||
                operation.equals("*") ||
                operation.equals("/");
    }

    public static boolean divideByZero(int b, String operation) {
        if(operation.equals("/") && b == 0) return false;
        return true;
    }
}
