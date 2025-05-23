class Main{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter A number :");
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //another method
        if ((num & 1) == 0) {
            System.out.println(" is even.");
        } else {
            System.out.println(" is odd.");
        }
    }
}