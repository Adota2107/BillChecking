public class Main {
    
    public static void main(String[] args) {
        Person user = new Person();
        //Step 1: input number of bill
        int num = user.billNum();
        //Step 2: input bill vallue
        int[] value = user.billValue(num);
        //Step 3: input wallet amount
        Wallet wallet = new Wallet();
        int amount = wallet.value();
        //Step 4: Calculate total bill value
        int total = user.calcTotal(value);
        //Step 5: Compare it with wallet amount and show message
        user.payMoney(total, amount);
        //Step 6: Exit
    }
}
