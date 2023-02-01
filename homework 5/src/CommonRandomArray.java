import java.util.Random;

public class CommonRandomArray {
    static int[] createRandomArray(
            int minValue,
            int maxValue,
            int arraySize
    ) {
        if (arraySize < 0)
            throw new IllegalArgumentException("Size of array must be above zero!");

        Random random = new Random();
        int[] newArray = new int[arraySize + 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(maxValue + 1 - minValue) + minValue;
        }
        return newArray;
    }
}
