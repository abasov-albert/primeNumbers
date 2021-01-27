/*
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 * */

public class Main {
    public static void main(String[] args) {
        int maxValue = 100;
        int minValue = 2;
        int[] numbers = new int[(maxValue - minValue) + 1];

        for (int i = minValue; i <= maxValue; i++) {
            numbers[i - minValue] = i;
        }

        System.out.println("Original array:");
        for (var i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        numbers = PrimeNumbers(numbers);
        System.out.println("Only prime nubers:");
        for (var i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static int[] PrimeNumbers(int[] array) {
        int[] arrayOfPrimeNumbers = new int[25];
        int divider = 1;
        int dividerAmount = 0;
        int index = 0;

            for (var i : array) {
                while (divider <= i) {
                    if (i % divider == 0) {
                        dividerAmount++;
                    }
                    divider++;
                }
                if (dividerAmount < 3) {
                    arrayOfPrimeNumbers[index] = i;
                    index++;
                }
                dividerAmount = 0;
                divider = 1;
            }

        return arrayOfPrimeNumbers;
    }
}
