import java.util.Scanner;

public class AtmMachine
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args)
    {
        int balance = 200, withdraw = 0, deposit = 0, acc = 0, amo = 0, flag1=0, flag2=0, flag3=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your User ID: ");
        String id = sc.nextLine();

        System.out.println("Enter Your Password: ");
        int pass = sc.nextInt();

        System.out.println("****************************************************");
        System.out.println("\t\t\tWEL-COME to ATM ");
        System.out.println("****************************************************");
        System.out.println("Press 1 for Balance amount");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Deposit");
        System.out.println("Press 4 for Transfer");
        System.out.println("Press 5 for Transactions History");
        System.out.println("Press 6 for Exit");
        System.out.println("****************************************************");

        while (true){
            System.out.println(ANSI_RESET+"Choose the operation you want to perform:"+ANSI_YELLOW);

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Your current Balance is : " + balance);
                    System.out.println("----------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        flag1 = 1;
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("----------------------------------------------------");
                }

                case 3 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    flag2 = 1;
                    balance = balance + deposit;
                    System.out.println("Successfully Deposited");
                    System.out.println("----------------------------------------------------");

                }

                case 4 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Enter Account Number, you want to transfer money");
                    acc= sc.nextInt();

                    System.out.println("Enter amount to be transfer");
                    amo=sc.nextInt();
                    flag3 = 1;
                    System.out.println(amo+"rs. transferred successfully.");
                    balance = balance - amo;
                    System.out.println("----------------------------------------------------");
                }

                case 5 -> {
                    System.out.println("----------------------------------------------------");
                    System.out.println("*** Transaction History ***");
                    if(flag1 == 1){
                        System.out.println(withdraw + "rs. amount withdraw from your bank.");
                    }
                    if (flag2 == 1) {
                        System.out.println(deposit + "rs. amount deposit to your bank.");
                    }
                    if (flag3 == 1) {
                        System.out.println(amo + "rs. amount transferred to "+ acc+" bank");
                    }
                    System.out.println("----------------------------------------------------");
                }

                case 6 -> {
                    System.exit(0);
                }
            }
        }
    }
}
