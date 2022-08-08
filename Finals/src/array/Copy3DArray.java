package array;

import java.util.Scanner;

//Copy 3D array
public class Copy3DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dimensions: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int depth = sc.nextInt();
        int arr1[][][] = new int[rows][cols][depth];    // declare array 1
        System.out.println("enter array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<depth; k++){               //input for array 1
                    arr1[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println("Original array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<depth; k++){                //print array 1
                    System.out.print(arr1[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int arr2[][][] = new int[rows][cols][depth];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<depth; k++){             //copy array 1 and 2
                    arr2[i][j][k]=arr1[i][j][k];
                }
            }
        }
        System.out.println();
        System.out.println("Copied Array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                for(int k=0; k<depth; k++){               //print the copied array (array 2)
                    System.out.print(arr2[i][j][k]+" ");
}
            }
        }}}