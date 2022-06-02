package NGAY1;

import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c' , pleas enter");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a :");
        double a = scanner.nextDouble();

        System.out.print("b :");
        double b = scanner.nextDouble();

        System.out.print("c : ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c-a)/b;
            System.out.printf("Equation pass with x = %f!¥n", answer);
        } else {
            if (b==c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
