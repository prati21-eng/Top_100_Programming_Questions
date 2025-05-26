class Main{

    private static boolean isSorted(int[] arr)
    {
        for(int i = 0 ; i<arr.length-1 ;i++){

            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4};

        boolean sorted = isSorted(arr);

        if(sorted){
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted");
        }
    }
}
