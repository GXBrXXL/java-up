import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Type a int number: ");

        int $num = read.nextInt();

        read.close();

        int $fib1 = 1, $fib2 = 1, $fibonacci = 0;
        boolean $check = false;

        while($fibonacci <= $num){
            if($fibonacci == $num){
                $check = true;
                break;
            }
            $fibonacci = $fib1 + $fib2;
            $fib1 = $fib2;
            $fib2 = $fibonacci;
        }
        if($check){
            System.out.print($num + " Is in Fibonacci sequence");
        }else {
            System.out.print($num + " Is not in Fibonacci sequence");
        }
    }
}
