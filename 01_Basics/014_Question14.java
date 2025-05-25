//counts digits in a number
import java.util.Scanner;
class Main{

    private static int digitInNumber(int num){
       int digit =0;
        while (num!=0) {
            digit++;
            num/=10;
        }
        return digit;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number to count digits :");
        int num = sc.nextInt();

        System.out.println("The total digits in number "+num+" is "+ digitInNumber(num));
        sc.close();
    }
}
