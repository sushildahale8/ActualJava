/*
   User define functions are:

   1. Without parameter without return type.
   2. Without parameter with return type.
   3. With parameter without return type.
   4. With parameter with return type.
 */



package FuntionTypes;

import java.util.Scanner;

public class UserDefinFunctions {
    public static void main(String[] args) {

        //1. Without parameter without return type.
        f1();

        //2. Without parameter with return type.
        String s =f2();
        System.out.println(s);

        //3. With parameter without return type.
        f3(12);

      //  f3_1("Arnav",18, 100000);



        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name= sc.next();

        System.out.println("enter age");
        int age = sc.nextInt();

        System.out.println("enter sal");
        double sal = sc.nextDouble();

        f3_1(name,age,sal);

        //4. With parameter with return type.
        String s1 = f4(001);
        System.out.println(s1);

    }

    //1. Without parameter without return type.

    static void f1()
    {
        System.out.println("1. Without parameter without return type.");
    }

   // 2. Without parameter with return type.

    static String f2()
    {
        return "2. Without parameter with return type.";
    }

    //3. With parameter without return type.
    static void f3(int a)
    {
        System.out.println("3. With parameter without return type. return parameter " +a);

    }

    static void f3_1(String name, int age, double sal)
    {
        System.out.println("Your name is = " +name+ ", Your age is = " +age+ ", Your Salary is = "+sal);
    }

    //4. With parameter with return type.
    static String f4 (int b)
    {
        return "4. With parameter with return type. " +b;

    }
}
