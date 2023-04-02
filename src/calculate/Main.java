package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ans='Y';
        Calculator obj = new Calculator();
        Scanner scan = new Scanner(System.in);
        while(ans == 'Y' || ans == 'y') {
            System.out.println("Please enter First Number: ");
            int a = scan.nextInt();
            System.out.println("Please Enter Second Number: ");
            int b = scan.nextInt();
            System.out.println("Please Enter one of Symbol (+,-,*,/) : ");
            char symbol = scan.next().charAt(0);
            obj.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation, Please Enter 'Y' or 'N': ");
            ans = scan.next().charAt(0);
        }
        scan.close();
    }
}
