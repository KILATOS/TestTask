public class GetterNumbersFromString {
    private static final int[] numbers = new int[2];
    private static boolean flag = false; // if false then Roman, else Arabic
    public static int[] getNumbers(String line){

        String[] arrayOfLine = line.split(" ");
        int i = 0;
        int checker = 0;
        for (String element : arrayOfLine) {
            if (Character.isLetter(element.charAt(0))) {
                numbers[i] = RomanNumeral.romanToArabic(element);
                i++;
                checker++;
            } else if (Character.isDigit(element.charAt(0))) {
                numbers[i] = Integer.parseInt(element);
                i++;
                checker--;
                flag = true;
            }
        }
        if (Math.abs(checker) != 2) {
            throw new RuntimeException("используются одновременно разные системы счисления");
        } // throwing exception to different systems of counting
        return numbers;
    }

    public static boolean isFlag() {
        return flag;
    }
}
