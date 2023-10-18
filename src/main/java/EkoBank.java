import java.util.Scanner;

public class EkoBank {


    public static void main(String[] args) {

        int balance = 500;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ecobank ATM");


        while(true) {

            System.out.println("**********");
            System.out.println("Select Transaction Type");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw money  ");
            System.out.println("3 Balance Inquiry");
            System.out.println("4 Exit");

            Scanner scan = new Scanner(System.in);
            int process = scan.nextInt();

            switch(process)  {
                case 1:
                {
                    Scanner sca = new Scanner(System.in);
                    System.out.println("Enter Amount to Deposit");
                    int x = sca.nextInt();
                    balance = balance+x;
                    System.out.println("Your money has been deposited into your account.");
                    System.out.println("Your balance: "+balance);
                    System.out.println("Press E to do another action.");
                    System.out.println("Press A to exit");
                    System.out.print("your transaction: ");

                    Scanner sc = new Scanner(System.in);
                    String aaa = sc.nextLine();
                    switch(aaa) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 2:
                {
                    Scanner sca = new Scanner(System.in);

                    System.out.print("Enter Amount to Withdraw:");
                    int b = sca.nextInt();
                    if (balance < b) {
                        System.out.println("Your balance is insufficient. please try again.");
                        continue;
                    }
                    else {
                        balance=balance-b;
                        System.out.println("Your withdrawal was successful");
                        System.out.println("Your balance: "+balance);
                        System.out.println("Press E to perform another operation..");
                        System.out.println("Press A to exit");
                        System.out.print("your transaction: ");

                        Scanner inp = new Scanner(System.in);
                        String a = inp.nextLine();
                        switch(a) {
                            case "A":
                            {
                                break;
                            }
                            case "E":
                            {
                                continue;
                            }
                        }
                    }}

                case 3:
                {


                    System.out.println("Your balance: "+balance);
                    System.out.println("Press E to do another action.");
                    System.out.println("Press A to exit");
                    System.out.print("your transaction: ");









                    Scanner i = new Scanner(System.in);
                    String ss = i.nextLine();
                    switch(ss) {
                        case "A":
                        {
                            break;
                        }
                        case "E":
                        {
                            continue;
                        }
                    }
                }
                case 4:
                {
                    System.out.println("Checking Out.");
                    break;
                }
            }


        }
    }
}
