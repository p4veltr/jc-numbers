import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();
        for (Integer a : intList) {
            if (a > 0 && a%2 == 0) {
                resultList.add(a);
            }
        }
        resultList.sort(Comparator.naturalOrder());
        System.out.println(resultList);
    }
}