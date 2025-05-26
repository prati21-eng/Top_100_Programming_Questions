//  21. Find the largest/smallest element in an array

import java.util.Arrays;

class Main{
    public static void main(String[] args){

        int[] arr = {1,43,238,0,89};
        int max = arr[0];
        int min =  arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i]< min);
                min = arr[i];
        }

        // bu using built in method
        Arrays.sort(arr);
        int min1 = arr[0];
        int max1= arr[arr.length-1];
        System.out.println("Maximum element in an elemet is :"+max1);
        System.out.println("Minimum element in the array is :"+min1);
    }
}