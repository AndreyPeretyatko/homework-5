import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = CommonRandomArray.createRandomArray(
                0,
                1000,
                10000);

        System.out.println("Массив чисел: " + Arrays.toString(randomArray));

        List<Integer> arrayWithEvensByAnonymousClass =
                Numbers.getArrayWithEvensByAnonymousClass(randomArray);
        List<Integer> arrayWithEvensByLambda =
                Numbers.getArrayWithEvensByLambda(randomArray);
        System.out.println("1.1 Массив четных чисел с использованием анонимного класса: "
                + Arrays.toString(arrayWithEvensByAnonymousClass.toArray()));
        System.out.println("1.2 Массив четных чисел с использованием лямбда-выражения: "
                + Arrays.toString(arrayWithEvensByLambda.toArray()));

        List<Integer> arrayOfEvensWithSumOfDigitsInNumber =
                Numbers.getArrayOfEvensWithSumOfDigitsInNumber(randomArray);
        System.out.println("2. Массив четных сумм цифр в числе: "
                + Arrays.toString(arrayOfEvensWithSumOfDigitsInNumber.toArray()));

        List<Integer> arrayOfEachDigitInNumberIsEven =
                Numbers.getArrayOfEachDigitInNumberIsEven(randomArray);
        System.out.println("3. Массив всех четных цифр в числе: "
                + Arrays.toString(arrayOfEachDigitInNumberIsEven.toArray()));

        List<Integer> arrayOfPalindromes = Numbers.getArrayOfPalindromes(randomArray);
        System.out.println("4. Массив палиндромов: "
                + Arrays.toString(arrayOfPalindromes.toArray()));
    }
}
