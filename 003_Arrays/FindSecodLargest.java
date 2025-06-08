class Main {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 0, 2, 3, 4, 5, 6, 10, 8, 11, 12, 5, 87, 86};
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] > smax && arr[i] != fmax) {
                smax = arr[i];
            }
        }

        System.out.println("The second largest element in the array is: " + smax);
    }
}
