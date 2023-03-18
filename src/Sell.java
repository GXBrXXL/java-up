import java.util.Scanner;
public class Sell {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        String $name;
        double $price;
        int $quantity;
        double $totalValor = 0.0;

        System.out.println("Welcome to the store!");

        do{
            System.out.print("Type the name of product: ");
            $name =  read.nextLine();

            if (!$name.equalsIgnoreCase("end")) {
                System.out.print("Type the price: ");
                $price = Double.parseDouble(read.nextLine());

                System.out.print("Type the quantity do you want: ");
                $quantity = Integer.parseInt(read.nextLine());

                double $itemValor = $price * $quantity;
                double $discount;

                if($quantity <= 10){
                    $discount = 0.0;
                    $totalValor += $itemValor;
                }else if($quantity <= 20){
                    $discount = 0.1;
                    $totalValor += $itemValor * 0.9;
                }else if ($quantity <= 50){
                    $discount = 0.2;
                    $totalValor += $itemValor * 0.8;
                }else{
                    $discount = 0.25;
                    $totalValor += $itemValor * 0.75;
                }

                System.out.print("Product: " + $name);
                System.out.printf("Total valor: $ %.2f\n", $itemValor);
                System.out.printf("Total discount: %.0f%%\n", $discount * 100);
                System.out.print("Type 'end' to end shopping, or type another product to continue.\n");

            }

        }while(!$name.equalsIgnoreCase("end \n"));

        System.out.printf("Total: $ %.2f", $totalValor);

        read.close();
    }
}
