public class Counter {
    private static int result;
    public static int count(int[] numbers) {
        try {
            result = switch (OperatorCounter.getOperator()) {
                case '+' -> numbers[0] + numbers[1];
                case '-' -> numbers[0] - numbers[1];
                case '*' -> numbers[0] * numbers[1];
                case '/' -> numbers[0] / numbers[1];
                default -> throw new IllegalStateException("Unexpected value: " + OperatorCounter.getOperator());
            };
        } catch (ArithmeticException e) {
            throw new RuntimeException("деление на ноль");
        }
        return result;
    }

}
