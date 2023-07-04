package maximum_number_of_achievable_transfer_requests;

public class Solution {

    private static int answers = 0;

    public static void main(String[] args) {

        // int[][] requests = new int[][] {{0,0},{1,1},{0,0},{2,0},{2,2},{1,1},{2,1},{0,1},{0,1}};
        int[][] requests = new int[][] {{0,0},{1,2},{2,1}};

        
        int n = 3;
        System.out.println("Expected: "+ 3);
        System.out.println("Actual: "+maximumRequests(n, requests));
    }

    public static int maximumRequests(int n, int[][] requests) {
        
        int[] indegree = new int[n];
        getMaximumRequests(n, requests, indegree, 0, 0);
        return answers;
    }

    public static void getMaximumRequests(int n, int[][] requests,int[] indegree, int count, int index){


        if(index == requests.length){
            for(int i : indegree){
                if(i!=0) return;
            }
            answers = Math.max(count, answers);
            return;
        }

        indegree[requests[index][0]]--;        
        indegree[requests[index][1]]++;

        // move to the next node
        getMaximumRequests(n, requests, indegree, count+1, index+1);

        // backtrack 
        indegree[requests[index][0]]++;        
        indegree[requests[index][1]]--;

        getMaximumRequests(n, requests, indegree, count, index+1);

    }

}


