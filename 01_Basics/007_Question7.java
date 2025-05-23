class Main{
    public static void main(String[] args) {
        int num = 123;
        int revNum =0;

        while(num !=0)
        {
            int rem = num % 10;

            revNum =(revNum*10)+rem;
            num = num /10;
        }

        System.out.println("The reverce number of "+num +" is "+revNum);
    }
}
