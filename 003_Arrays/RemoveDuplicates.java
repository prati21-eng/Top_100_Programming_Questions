//remove duplicates from an array 

import java.util.LinkedHashSet; //preserves inertion order
class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
