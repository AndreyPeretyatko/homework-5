import java.util.ArrayList;
import java.util.List;

public class Sequence {
    public static List<Integer> filter (int[] array, ByCondition condition) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int i = 0;
        for (int item: array) {
            if (condition.isOk(item)) {
                newArray.add(item);
            }
        }
        return newArray;
    }
}
