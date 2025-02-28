package Switch_programs;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("enter no 1-7");
        int day = s1.nextInt();


        switch (day)
        {
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("Tue");
                case 3:
                    System.out.println("wed");
                    break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("out of range");
        }
    }
}
