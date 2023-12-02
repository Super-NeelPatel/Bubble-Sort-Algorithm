import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = randomNumbersArray(20);
        printArray(array);
        int [] sortedArray = startBubbleSort(array);
        printArray(sortedArray);
    }

    //Creates array of given length with random numbers
    public static int[] randomNumbersArray(int len){
        int[] myArray = new int[len];
        Random random = new Random();
        int index = 0;
        while (index < len){
            int randomNumber = random.nextInt(101);
            myArray[index] = randomNumber;
            index++;
        }
        return myArray;
    }


    //Sorts array
    public static int[] startBubbleSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {          // i = 0 (firstElement) ....i=3(thirdElement) .... i=n-1
            for (int j = i+1; j < array.length; j++) {      // j = 0+1(secondElement) ....j=3+1(fourthElement) .... j=i+1
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] arrayToPrint){
        System.out.println(Arrays.toString(arrayToPrint));
    }
}