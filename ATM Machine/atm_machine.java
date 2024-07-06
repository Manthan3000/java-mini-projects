// CREATED ATM MACHINE MINI PROJECT USING CLASSES AND OBJECTS 

import java.util.*;

class atm {
    float Balance;
    int pin = 1350;

    @SuppressWarnings("resource")
    public void chickPin() {
        System.out.print("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin == pin) {
            // menu[];
        } else {
            System.out.println("Incorect Pin ");
        }

    }

    public void menu() {
        System.out.println("Enter your Choice : ");
        System.out.println("1 : Check A/C Balance ");
        System.out.println("2 : Withdraw Money ");
        System.out.println("3 : Deposit Money ");
        System.out.println("4 : EXIT");
        System.out.print("Enter Choice Number : ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            Withdrawmoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter Write Option ");
        }
    }

    public void checkBalance() {
        System.out.println("Balence : " + Balance);
        menu();
    }

    public void Withdrawmoney() {
        System.out.println("Enter Amount to Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println(" Insufficient Balance ");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawed Succesful ");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter The Amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance = Balance + amount;
        System.out.println("Money Deposit Succesfully");
        System.out.println("NOW your Balance is : " + Balance);
        menu();
    }

}

public class atm_machine {
    public static void main(String[] args) {
        atm user1 = new atm();
        user1.chickPin();
        user1.menu();

    }
}

// OUTPUT :

// Enter Your PIN:1350
// Enter your Choice:1:Check A/C Balance
// 2:Withdraw Money
// 3:Deposit Money
// 4:EXIT
// 1 Balence:0.0
// Enter your Choice:1:Check A/C Balance
// 2: Withdraw Money
// 3:Deposit Money
// 4:EXIT
// 3 Enter The Amount:50000
// Money Deposit Succesfully NOW
// your Balance is:50000.0
// Enter your Choice:1 : Check A/C Balance
// 2: Withdraw Money
// 3:Deposit Money
// 4:EXIT
// 1 Balence:50000.0
// Enter your Choice:1: Check A/C Balance
// 2: Withdraw Money
// 3: Deposit Money
// 4:EXIT
// 2 Enter Amount to Withdraw:60000
// Insufficient Balance
// Enter your Choice:1: Check A/C Balance
// 2: Withdraw Money
// 3: Deposit Money
// 4:EXIT
// 2 Enter Amount to Withdraw:30000
// Money Withdrawed Succesful
// Enter your Choice:1: Check A/C Balance
// 2: Withdraw Money
// 3:Deposit Money
// 4:EXIT
// 1 Balence:20000.0
// Enter your Choice:1: Check A/C Balance
// 2: Withdraw Money
// 3: Deposit Money
// 4:EXIT
// 4