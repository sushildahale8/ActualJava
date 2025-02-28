package Array_Practice;

public class Task_002 {

    public static void main(String[] args) {


        int[] mar = {23, 43, 12, 12};

        int[] mar2 = new int[4];

        System.out.println(mar2.length);

        String st = "Sushil";
        System.out.println(st.length());


        mar2[0] = 91;
        mar2[1] = 12;
        mar2[2] = 13;
        mar2[3] = 14;
        //mar2[4] = 15;

        System.out.println(mar2[0]);
        System.out.println(mar2[3]);
        //System.out.println(mar2[10]); // ArrayIndexOutOfBoundsException
    }
}
