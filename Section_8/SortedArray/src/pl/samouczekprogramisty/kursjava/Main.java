package pl.samouczekprogramisty.kursjava;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = getIntegers(5);
        printArray(array);
        System.out.println(Arrays.toString(sortIntegers(array,true)));
        System.out.println(Arrays.toString(sortIntegers(array,false)));
    }


    public static int [] getIntegers(int sizeOfArray) {
        Scanner scanner = new Scanner(System.in);
        int [] newArray = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++) {
            System.out.println("Write contents for arr[" + i + "]: ");
            newArray[i] = scanner.nextInt();
        }
        scanner.close();
        return newArray;
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array, boolean toAsc) {
        int [] sortedArray = Arrays.copyOf(array, array.length);
        boolean isNotSorted= true;
        while(isNotSorted) {
            isNotSorted = false;
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(toAsc) {
                    if(sortedArray[i] > sortedArray[i+1]) {
                        sortedArray[i] += sortedArray[i+1];
                        sortedArray[i+1] = sortedArray[i] - sortedArray[i+1];
                        sortedArray[i] -= sortedArray[i+1];
                        isNotSorted = true;
                    }
                } else {
                    if(sortedArray[i] < sortedArray[i+1]) {
                        sortedArray[i] += sortedArray[i+1];
                        sortedArray[i+1] = sortedArray[i] - sortedArray[i+1];
                        sortedArray[i] -= sortedArray[i+1];
                        isNotSorted = true;
                    }
                }
            }
        }
        return sortedArray;
    }

}
