import java.util.Scanner;

public class Paycheck {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the amount of employers: ");
        int $numEmployers = read.nextInt();

        double[] $paychecks = new double[$numEmployers];
        double $sumPaychecks = 0;

        for (int i = 0; i < $numEmployers; i++) {
            System.out.print("Type employers payments " + (i + 1) + ": ");
            $paychecks[i] = read.nextDouble();
            $sumPaychecks += $paychecks[i];
        }
        double $averagePaycheck = $sumPaychecks / $numEmployers;

        int $averageEmployers = 0;
        for (int i = 0; i < $numEmployers; i++) {
            if ($paychecks[i] > $averagePaycheck) {
                $averageEmployers++;
            }
        }

        System.out.print("Average paycheck: " + $averagePaycheck);
        System.out.print("\nAmount of employers with above paycheck: " + $averageEmployers);
    }
}
