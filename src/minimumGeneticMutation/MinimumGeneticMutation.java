package minimumGeneticMutation;

import java.util.Arrays;

public class MinimumGeneticMutation
{

    public static void main(String[] args) {
//        System.out.println(minMutation("AAAAACCC", "AACCCCCC", new String[] {}));
        System.out.println(minMutation("AACCGGTT", "AAACGGTA", new String[] {"AACCGATT","AACCGATA","AAACGATA","AAACGGTA"}));
    }

    public static int minMutation(String start, String end, String[] bank) {

        String[] geneChoices = new String[] {"A", "C", "G", "T"};
        String[] startArr = start.split("");
        String[] endArr = end.split("");
        int count = 0;
        for (int i = 0; i <startArr.length ; i++) {
//            System.out.println(startArr[i]);
            if(startArr[i].equals(endArr[i])) continue;

            String newstart = start.substring(0,i)+endArr[i]+start.substring(i+1);

            if(Arrays.asList(bank).contains(newstart)) {
                System.out.println("pass");
                count++;
                int x = minMutation(newstart, end, bank);
                return 1 + x;
            }
        }
        if(start.equals(end)) return 0;

        return 0;


    }

}
