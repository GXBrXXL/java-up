import java.util.Scanner;
public class MonthSelector {
    public static void main(String[] args) {
        String[] $calendar = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int $month = read.nextInt();

        if ($month < 1 || $month > 12) {
            System.out.print("Invalid!");
        } else {
            System.out.print($calendar[$month - 1]);
        }
    }
}

