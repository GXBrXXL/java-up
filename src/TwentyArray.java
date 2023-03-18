import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwentyArray {
    public static void main(String[] args) {
        int[] $numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 11, 12, 13, 14, 15};

        List<Integer> $numbersWithoutClones = new ArrayList<>();

        for (int $number : $numbers) {
            if (!$numbersWithoutClones.contains($number)) {
                $numbersWithoutClones.add($number);
            }
        }
        System.out.print(Arrays.toString($numbersWithoutClones.toArray()));
    }
}
