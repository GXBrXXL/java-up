import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int $quantity = read.nextInt();
        int[] $numbers = new int[$quantity];

        for (int $i = 0; $i < $quantity; $i++) {
            System.out.printf("Enter a %d° number: ", $i + 1);
            $numbers[$i] = read.nextInt();
        }

        for (int $number : $numbers) {
            if ($prime($number)) {
                System.out.printf("%d its prime.%n", $number);
            } else {
                System.out.printf("%d its not prime.%n", $number);
            }
        }

        System.out.print("Type the amount of prime values you want to show: ");
        int $n = read.nextInt();
        int $amountOfPrimeFound = 0;
        int $i = 2;

        while ($amountOfPrimeFound < $n) {
            if ($prime($i)) {
                System.out.printf("%d its prime.%n", $i);
                $amountOfPrimeFound++;
            }
            $i++;
        }
    }

    public static boolean $prime(int $number) {
        if ($number < 2) {
            return false;
        }
        for (int $i = 2; $i <= Math.sqrt($number); $i++) {
            if ($number % $i == 0) {
                return false;
            }
        }
        return true;
    }
}
