import java.util.List;

public class Numbers {
    public static List<Integer> getArrayWithEvensByAnonymousClass(int[] randomArray) {
        ByCondition getEvens = new ByCondition() {
            @Override
            public boolean isOk(int number) {
                return number % 2 == 0;
            }
        };
        return Sequence.filter(randomArray, getEvens);
    }

    public static List<Integer> getArrayWithEvensByLambda(int[] randomArray) {
        return Sequence.filter(randomArray, item -> item % 2 == 0);
    }

    public static List<Integer> getArrayOfEvensWithSumOfDigitsInNumber(int[] randomArray) {
        return Sequence.filter(randomArray, number -> {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum % 2 == 0;
        });
    }

    public static List<Integer> getArrayOfEachDigitInNumberIsEven(int[] randomArray) {
        return Sequence.filter(randomArray, number -> {
            int lastDigit;
            while (number != 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0)
                    number /= 10;
                else
                    return false;
            }
            return true;
        });
    }

    public static List<Integer> getArrayOfPalindromes(int[] randomArray) {
        return Sequence.filter(randomArray, number -> {
            char[] charArray = Integer.toString(number).toCharArray();

            int i = -1;
            int j = charArray.length;

            while (i < charArray.length / 2) {
                if (charArray[++i] != charArray[--j])
                    return false;
            }
            return true;
        });
    }
}
