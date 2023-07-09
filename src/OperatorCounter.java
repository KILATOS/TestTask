class OperatorCounter {
    private static int operatorAmount;
    private static char operator = ' ';
    public static void count(String line) {
        for (char element : line.toCharArray()) {
            if (element == '*' || element == '/' || element == '+' || element == '-') {
                operatorAmount++;
                operator = element;
            }
        } // counting operators
        if (operatorAmount == 0) {
            throw new RuntimeException("строка не является математической операцией");
        } else if (operatorAmount > 1) {
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } // throwing exceptions

    }

    public static char getOperator() {
        return operator;
    }
}
