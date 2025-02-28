package Array_Practice;

import java.util.Scanner;

public class Task001 {

    public static void main(String[] args) {
        // Create function Add, Sub, Mul, and Div
        // With parameter a,b (Take the parameter from user)

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b= sc.nextInt();

        int Addition = add(a,b);
        System.out.println("addition is = " +Addition);

        int Multiplication = mul(a,b);
        System.out.println("Multiplication is = " +Multiplication);

        int div= div(a,b);
        System.out.println("division = " +div);
    }

    static int add(int a, int b)
    {
        return a+b;
    }

    static int mul(int a, int b)
    {
        return a*b;
    }

    static int div(int a, int b)
    {
        return a/b;
    }

}
