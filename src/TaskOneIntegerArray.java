import java.util.Random;

/**
 * Introduction to the array
 * @date 31.03.2022
 * @author Alex Krentik
 */
public class TaskOneIntegerArray {
    public static void main(String[] args) {
        int[] integerArray = new int[20];
        Random numbers = new Random();
        int randomInt = 0;
        int sumElements = 0;
        int averageArithmetic = 0;
        for (int i = 0; i < 20; i++) {
            randomInt = numbers.nextInt(100);
            integerArray[i] = randomInt;
            sumElements += randomInt;
            System.out.println(randomInt);
        }
        averageArithmetic = sumElements / integerArray.length;
        System.out.println("The arithmetic mean of the array: " + averageArithmetic);
    }
}
