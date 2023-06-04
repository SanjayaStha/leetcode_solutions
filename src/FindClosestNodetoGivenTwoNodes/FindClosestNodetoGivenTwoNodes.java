package FindClosestNodetoGivenTwoNodes;

import java.util.ArrayList;
import java.util.HashMap;

public class FindClosestNodetoGivenTwoNodes {
    public static void main(String[] args) {
        System.out.println("*************************STARTED*************************");
        int[] edges = new int[] {1,2,-1};
        int node1 = 0;
        int node2 = 2;
        System.out.println(closestMeetingNode(edges,node1,node2));
    }

    public static int closestMeetingNode(int[] edges, int node1, int node2) {

        ArrayList<Integer> traversedNode1 = new ArrayList<Integer>(); // Create an ArrayList object
        ArrayList<Integer> traversedNode2 = new ArrayList<Integer>(); // Create an ArrayList object


        while (true){


            if (traversedNode1.contains(node1)){
                node1 = -1;
            }
            if (traversedNode2.contains(node2)){
                node2 = -1;
            }

            if (node2 == -1 && node1 == -1){
                return -1;
            }

            if(node1 >= 0){
                int nextNode = edges[node1];
                traversedNode1.add(node1);
                if(traversedNode1.contains(node2) || traversedNode2.contains(node1)){
                    int pos1 = traversedNode1.indexOf(node2)+1;
                    int pos2 = traversedNode2.indexOf(node1)+1;
                    return Math.max(pos2, pos1);
//                break;
                }
                node1 = nextNode;

            }

            if (node2 >= 0){
                int nextNode = edges[node2];
                traversedNode2.add(node2);
                if(traversedNode1.contains(node2) || traversedNode2.contains(node1)){
                    int pos1 = traversedNode1.indexOf(node2)+1;
                    int pos2 = traversedNode2.indexOf(node1)+1;
                    return Math.max(pos2, pos1);
//                break;
                }
                node2 = nextNode;

            }

        }




//        return index;
    }
}
