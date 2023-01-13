import java.util.Scanner;

public class Person {
    int billNum;
    int billValue;

    Scanner sc = new Scanner(System.in);

    public int checkInput(){
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException nfe) {
                System.out.println("Wrong type of input!!!");
                System.out.print("Enter again: ");
            }
        }
    }

    public Person() {
    }

    public Person(int billNum, int billValue){
        this.billNum = billNum;
        this.billValue = billValue;
    }

    public int billNum(){
        System.out.print("input number of bill: ");  
        int num = checkInput();
        return num;
    }
    
    public int[] billValue(int x){
        int[] bill = new int[x];
        for (int i = 0; i < bill.length; i++) {
           System.out.print("input value of bill " + (i+1) + " : "); 
           bill[i] = checkInput();
        } 
        return bill;
    }

    public int calcTotal(int[] bills){
        int totalBills = 0;
        for (int i = 0; i < bills.length; i++) {
            totalBills += bills[i];
        }
        System.out.println("this is total of bills: " + totalBills);
        return totalBills;
    }

    public boolean payMoney(int total, int amount){
        if (total <= amount) {
            System.out.println("you can buy it.");
            return true;
        } else {
            System.out.println("you can't buy it.");
            return false;
        }
    }
}
