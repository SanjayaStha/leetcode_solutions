package PowerOfFour;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(255));
    }

    public static boolean isPowerOfFour(int n) {
//
//        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 4, 16, 64, 256, 1024, 4096, 16384, 65536, 262144, 1048576, 4194304, 16777216, 67108864, 268435456, 1073741824));
//
//        if(arr.contains(n))
//            return true;
//
//        return false;

        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
