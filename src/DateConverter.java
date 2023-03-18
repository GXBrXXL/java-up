import java.util.Scanner;
public class DateConverter {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        int $timeInSeconds = read.nextInt();

        int $hours = $timeInSeconds / 3600;
        int $minutes = ($timeInSeconds % 3600) / 60;
        int $seconds = $timeInSeconds % 60;

        System.out.print($hours + " hours " + $minutes + " minutes " + $seconds + " seconds. ");
    }
}
