import java.util.Scanner;

public class Wallet extends Person{
    int walletValue;
    Scanner sc = new Scanner(System.in);

    public int value(){
        System.out.print("input value of wallet: ");
        int value = sc.nextInt();
        return value;
    }
}
