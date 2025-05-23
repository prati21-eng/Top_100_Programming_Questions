class Main{
    public static void main(String[] args) {
        int num =123 ;
        int temp = num;
        int sum =0;

        while(temp!=0)
        {
            int rem = temp %10;
            sum +=rem;
            temp =temp/10; 
            
        }

        System.out.println("Sum of digit of number "+num +" is "+sum);
    }
}
