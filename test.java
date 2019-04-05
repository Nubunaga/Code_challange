/*Code Challange 1
* @Author Netanel
* Pythagoran tripplet*/

import java.util.*;

class test{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter possitive integer between 1-2^64");

        // input for the integer to be checked for tripplets,and also the array to be stored.
        int input = in.nextInt();
        int tripp[] = new int[3];
        int a;
        if (input > 0) {
            // in order to check if the integer has tripplets within itselfe, it need to be checked for pythagora.
            a = tripplet(input,tripp);
        }
    else {
        System.out.println("Zero or negative is not allowed");
    }
    }
    public static int tripplet(int in, int[] tripplets){
        boolean check = false;
        for (int i = 1; i < in; i++) {
            for (int j = 1; j < in; j++) {
                if (check == true) {
                    return 0;
                } else {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(in - i - j, 2)) {
                        tripplets[2] = in - i - j;
                        tripplets[0] = i;
                        tripplets[1] = j;
                        System.out.println(" " + tripplets[0] + " " + tripplets[1] + " " + tripplets[2]);
                        check = true;
                    }
                }
            }
        }
        return 0;
    }
}