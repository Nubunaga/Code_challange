/*Code Challange (basic)2
* @Author Netanel Avraham Eklind
* Find a valid binary string*/

import java.util.*;

public class ValidBinary {
    public static void main(String[] ars) {
        Scanner in = new Scanner(System.in);
        String binaryInput = in.next();
        System.out.println(("" + binaryInput));
        boolean outcome = checkBinary(binaryInput);

        if (outcome == true) {
            System.out.println("This is a valid binary string " + binaryInput);
        } else {
            System.out.println("Not valid binary string " + binaryInput);
        }
    }

    public static boolean checkBinary (String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1' & input.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }
}
