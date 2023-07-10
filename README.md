# TestTask
There are five classes here, every one has only one responsibility. The main one is an enter point to the programm, here we 
create an objext of type Scanner in try with resources block, it reads a line from console. Then we cause methods of other 
classes, that our programm has.
OperatorCounter
Here we count, how many operators the line has, and, if it equals to zero, or more than 1, our programm throws an Runtime
Exception, otherwise, method saves founded operator to use it later.
GetterNumbersFromString 
Here we parse Roman or Arabic numerals into int value to operate with them easily, also, our programm checks. in witch systems
our numerals are, and, if there are different, throws a RuntimeException, otherwise, it saves an array of length 2, with parsed
numerals an boolean value with information of system of numerals in input string
Counter
It is a simple class, witch calculates a result of values, witch we got in previous class, with using of operator, that we
got in OperatorCounter, it throws IllegalStateException if we got unexpected operator, and ArithmeticException if we have deviding
by zero. It returns result of operation.
RomanNumerals
It is a class to work with RomanNumerals, it is a enum, so as constans we have main RomanNumerals, with witch we can build
all numerals due to 4000, there are some extra methods here. getReverseSortedValue, here we get a List of values, witch sorted
in reversed order, we need to convert Roman numeral to Arabic. romanToArabic here we convert Roman numerals to Arabic. And
we have method arabicToRoman, witch helps to convert arabicToRoman, we need it to give answer in Roman format, if we got
both values in this format.

If we back to Main class, we see, that firstly we count and get an operator with method count of class OperatorCounter, than
we get an array of values with method getNumbers of class GetterNumbersFromString. Than we calculate a result with method
calc of class Counter. Finally, we show a result in the same system, witch we got in the input line.
