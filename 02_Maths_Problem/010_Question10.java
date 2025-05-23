//find lcm and GCD of two numbers
class Main{

    // private static int findGcd(int num1 , int num2){
    //     int small = (num1 < num2) ? num1 : num2;
    //     int big = (num1 > num2) ? num1 : num2;
    //     for(int i=small ;i>=1 ;i--)
    //     {
    //         if(big % i ==0)
    //         {
    //             return i;
    //         }
    //     }

        


        
    //     return 0;
    // }

    // Euclidean Algorithm to find GCD
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public  static int findLCM(int num1 , int num2 )
    {
        // lcm = (num1*num2)/(GCD (num 1,num2))
        return (num1*num2)/findGCD(num1, num2);
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        
        System.out.println("GCD of numbers "+num1+ " "+num2+" is"+findGCD(num1, num2));
        System.out.println("LCM of numbers "+num1+ " "+num2+" is"+findLCM(num1, num2));
        
        sc.close();
    }
}
