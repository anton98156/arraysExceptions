package arraysexceptions;

public class ArraysOperations {

    public static int[] createArray(String input) {
        String[] numbersString = input.split(" ");
        int[] array = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            array[i] = Integer.parseInt(numbersString[i]);
        }
        return array;
    }

    public static int[] arraysSubtraction (int[] arr1, int[] arr2) throws RuntimeException {
        if(arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны по количеству элементов!");
        }
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = arr1[i] - arr2[i];
        }
        return resultArray;
    }

    public static int[] arraysDivision (int[] arr1, int[] arr2) throws RuntimeException {
        if(arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны по количеству элементов!");
        }
        int[] resultArray = new int[arr1.length];
        for (int i = 0; i < resultArray.length; i++) {
            if(arr2[i] == 0) {
                throw new RuntimeException("Ошибка, деление на 0 невозможно!");
            }
            resultArray[i] = arr1[i] / arr2[i];
        }
        return resultArray;
    }
}
