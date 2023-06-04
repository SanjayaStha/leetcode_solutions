package MinimumOperationstoReduceanIntegerto0;

public class MinimumOperationstoReduceanIntegerto0 {

    // 1 2 4 8 16 32 64 128

    public static void main(String[] args) {
        System.out.println(minOperations(54));
    }

    public static int minOperations(int n) {
        System.out.println("N:\t"+n);
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        int num = 2;
        int cnum = 0;
        int nnum = 0;
        int diff;
        int count = 0;
        int ncount = 0;
        while( Math.pow(num, ncount) < n){
            cnum = (int) Math.pow(num, ncount);
            nnum = (int) Math.pow(num, ncount+1);
            System.out.println("cnum:\t"+cnum+"\t nnum: \t"+nnum);
            if(n <= nnum && n>=cnum){
                if((nnum - n) < (n-cnum)){
                    diff = nnum-n;
                    count = 1 + minOperations(diff);
                    return count;
                }else {
                    diff = n - cnum;
                    count = 1 + minOperations(diff);
                    return count;
                }
                // break;
            }

            ncount++;

        }
        System.out.println("Count:\t"+ count);
        return count++;
    }
    
}
