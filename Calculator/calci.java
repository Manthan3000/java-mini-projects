
//CREATE A SIMPLE CALCULATOR USING CONDITIONAL STATEMENT ( SWITCH )

import java.util.*;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num A:");
        int A = sc.nextInt();
        System.out.print("Enter Num B:");
        int B = sc.nextInt();
        System.out.print("Enter 1 for add, 2 for sub ,3 for mul , 4 for div :");
        int Operation = sc.nextInt();
        switch (Operation) {
            case 1:
                System.out.println(A + B);
                break;
            case 2:
                System.out.println(A - B);
                break;
            case 3:
                System.out.println(A * B);
                break;
            case 4:
                System.out.println(A / B);
            default:
                System.out.println("Invalid operator");
        }

    }
}
