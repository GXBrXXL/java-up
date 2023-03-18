public class Merge {
    public static void main(String[] args) {
        double[] $firstArray = {1.2, 2.5, 4.0, 5.1};
        double[] $secondArray = {0.8, 2.3, 3.9, 6.0, 7.2};

        double[] $result = $mergeArrays($firstArray, $secondArray);

        for (double $num : $result) {
            System.out.print($num + " ");
        }
    }

    public static double[] $mergeArrays(double[] $firsArray, double[] $secondArray) {
        int $firstSize = $firsArray.length;
        int $secondSize = $secondArray.length;

        double[] $result = new double[$firstSize + $secondSize];

        int $i = 0;
        int $j = 0;
        int $k = 0;

        while ($i < $firstSize && $j < $secondSize) {
            if ($firsArray[$i] < $secondArray[$j]) {
                $result[$k] = $firsArray[$i];
                $i++;
            } else {
                $result[$k] = $secondArray[$j];
                $j++;
            }
            $k++;
        }

        while ($i < $firstSize) {
            $result[$k] = $firsArray[$i];
            $i++;
            $k++;
        }

        while ($j < $secondSize) {
            $result[$k] = $secondArray[$j];
            $j++;
            $k++;
        }
        return $result;
    }
}
