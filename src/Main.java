import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line = "";
        try (Scanner scanner = new Scanner(System.in)) {
            line = scanner.nextLine();
        }
        OperatorCounter.count(line); //operator counting
        int result = Counter.calc(GetterNumbersFromString.getNumbers(line));
        System.out.println(GetterNumbersFromString.isFlag() ? result : RomanNumeral.arabicToRoman(result));
    }
}