package RestoreIPAddress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreIPAddress {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(restoreIpAddresses("").toArray()));
    }

    public static List<String> restoreIpAddresses(String s) {

        List<String> ipList = new ArrayList<>();
        String curString = "";
        int idx = 0;
        curString = curString+s.charAt(idx++);
        generateIPAddress(s,1,ipList, curString);
        curString = curString+s.charAt(1);
        generateIPAddress(s,2,ipList, curString);
        curString = curString+s.charAt(2);
        generateIPAddress(s,3,ipList, curString);



        return null;
    }

     public static void generateIPAddress(String s, int index,  List<String> ipList, String curString){

        if(s.charAt(index) == '0'){

        }

    }


}
