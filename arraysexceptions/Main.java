package arraysexceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\nВведите 2 массива с одинаковым количеством элементом. Программа проведет их вычетание и делеение.");
        System.out.println("Нельзя указывать 0 элементом во 2 массиве, т.к. деление на 0 невозможно.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы 1 массива через пробел: ");
        String inputArray1 = sc.nextLine();
        int[] array1 = ArraysOperations.createArray(inputArray1);
        System.out.println("Введите элементы 2 массива через пробел: ");
        String inputArray2 = sc.nextLine();
        int[] array2 = ArraysOperations.createArray(inputArray2);
        sc.close();

        try {
            int[] arraySubtractionResult = ArraysOperations.arraysSubtraction(array1, array2);
            System.out.println("Результат вычетания массиов: ");
            System.out.println(Arrays.toString(arraySubtractionResult));
            int[] arrayDivisionResult = ArraysOperations.arraysDivision(array1, array2);
            System.out.println("Результат деления массиов: ");
            System.out.println(Arrays.toString(arrayDivisionResult));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}