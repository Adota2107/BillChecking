public class Wallet extends Person{
    int walletValue;

    public int value(){
        System.out.print("input value of wallet: ");
        int value = checkInput();
        return value;
    }
}
