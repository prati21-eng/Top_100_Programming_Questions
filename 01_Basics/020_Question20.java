//   20. Sum of first N natural numbers
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end limit:");
        int limit = sc.nextInt();
        int sum =0;

        for(int i =1 ;i<= limit ;i++){
            sum+=i;                
        }

        System.out.println("Sum upto "+limit +" is "+sum);

        // by using formula  formula = (n*(n+1))/2
        int sum2 = (limit* (limit+1))/2;
        System.out.println("Sum upto "+limit +" is "+sum2);


        sc.close();
    }
}