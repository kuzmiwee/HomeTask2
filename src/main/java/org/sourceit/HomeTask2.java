package org.sourceit;

import java.util.Random;

public class HomeTask2 {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int number) {
        long numberBinary;
        int numberDecimal = number;

        if (numberDecimal < 0) {
            return (-1);
        }

        numberBinary = Integer.parseInt(Integer.toBinaryString(numberDecimal));
        return (numberBinary);
    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal(int number) {
        long numberOctal;
        int numberDecimal = number;

        if (numberDecimal < 0) {
            return (-1);
        }

        numberOctal = Integer.parseInt(Integer.toOctalString(numberDecimal));
        return (numberOctal);
    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex(int number) {
        long numberHex;
        int numberDecimal = number;

        if (numberDecimal < 0) {
            return (-1);
        }

        numberHex = Integer.parseInt(Integer.toHexString(numberDecimal));
        return (numberHex);
    }

    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {
        int numberDecimal;
        long numberBinary = binary;

        if (numberBinary < 0) {
            return (-1);
        }

        numberDecimal = Integer.parseInt(Long.toString(numberBinary) , 2);
        return (numberDecimal);
    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal) {
        int numberDecimal;
        long numberOctal = octal;

        if (numberOctal < 0) {
            return (-1);
        }

        numberDecimal = Integer.parseInt(Long.toString(numberOctal) , 8);
        return (numberDecimal);
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex) {
        int numberDecimal;
        long numbererHex = hex;

        if (numbererHex < 0) {
            return (-1);
        }

        numberDecimal = Integer.parseInt(Long.toString(numbererHex) , 16);
        return (numberDecimal);
    }

    /**
     * Генерируют двумерный массив, со случайными числами.
     *
     * @param rows
     * @param columns
     * @return двумерный массив
     */
    public static int[][] generateTwoDimensionArray(int rows, int columns) {
        int i, j;
        Random r = new Random();
        int [][] arrayLocal = new int [rows][columns];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                arrayLocal [i][j] = r.nextInt();
            }
        }
        return (arrayLocal);
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param input двумерный массив
     * @return индекс строки
     */
    public static int findMaxProduct(int[][] input) {
        int i, j, maxIndex = 0;
        long maxProduct = 1, thisProduct;
        int [][] arrayLocal = input;

        for (i = 0; i < arrayLocal.length; i++) {
            thisProduct = 1;
            for (j = 0; j < arrayLocal[i].length; j++) {
                thisProduct *= arrayLocal[i][j];
            }
            if (thisProduct > maxProduct) {
                maxProduct = thisProduct;
                maxIndex = (i);
            }
        }
        return (maxIndex);
    }

    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {
        int [] arrayDigits = new int [n];
        int [] simpleArray = new int [20];
        int i = 2, j =0, k;

        while (i < n) {
            arrayDigits [i] = i;
            i++;
        }
        while (i<=n) {
            if (arrayDigits [i] != 0) {
                simpleArray [j] = arrayDigits [i];
                j++;
                k = i;
                while (k <= n) {
                    arrayDigits [k] = 0;
                    k += i;
                }
            }
        }
        return (simpleArray);
    }

    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long sum(int n) {
        long sumLocal = 0;
        int i;

        for (i = 1; i <= n; i++) {
            sumLocal += i;
        }
        return (sumLocal);
    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {
        return (first * second);
    }

}
