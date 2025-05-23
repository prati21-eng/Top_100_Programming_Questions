class Main6 {
    public static void main(String[] args) {
        

        int num =11;
        int flag =0;
        for(int i=2 ;i <=num ;i++)
        {
            if(num%i == 0)
                flag++;
            

        }
        if(flag==1)
        {
            System.out.println("The number is Prime");

        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
