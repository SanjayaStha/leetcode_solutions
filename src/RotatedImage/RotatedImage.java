package RotatedImage;

import java.util.Arrays;
import java.util.HashMap;

public class RotatedImage {
    public static void main(String[] args) {

        int[][] nums = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        print2D(nums);
//        rotate(nums);
        transpose(nums);
        reflect(nums);
        System.out.println();
        print2D(nums);


    }
    public static void rotate(int[][] matrix) {

        int temp1;
        int temp2;

        HashMap<String,Integer> map = new HashMap<String, Integer>();

        int n = matrix.length;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
              temp1 = matrix[i][j];
              String str = j+","+(n-1-i);
              String str1 = i+","+j;
              map.put(str,  matrix[j][n-1-i]);

                if(map.containsKey(str1)){
                    matrix[j][n-1-i] = map.get(str1);
                }else{
                    matrix[j][n-1-i] = matrix[i][j];
                }


            }

        }

    }

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();

        }

    }

    public static void transpose(int[][] matrix){
        int temp;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = i+1; j <matrix.length ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reflect(int[][] matrix){
        int temp;
        int last = matrix.length -1;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length/2+1 ; j++) {
                int n = last - j;
                if(n>j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n];
                    matrix[i][n] = temp;

                }
            }
        }
    }
}

//00
//02
//22
//20
//00
//
//01
//12
//21
//10
//01

