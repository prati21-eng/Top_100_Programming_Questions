import java.util.Scanner;

class Main
{
    private static int calculateDigit(int num)
    {
        return (Integer.toString(num).length());
    }

    public static boolean isArmstrong(int num)
    {
        int digit =  calculateDigit(num);
        int sum =0;
        int temp =num;

        while (temp!=0) {
            int rem = temp %10;

            sum = sum + (int)(Math.pow(rem, digit));

            temp =temp /10;
        }
        if(sum ==num)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find is armstrong or not :");
        int num = sc.nextInt();

        boolean result = isArmstrong(num);

        if(result){
            System.out.println("Is a Armstrong number");
        }
        else{
            System.out.println("Is not armstrong number");
        }
        sc.close();
    }
}