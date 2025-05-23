class Main{
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int revNum =0;

        while(temp !=0)
        {
            int rem = temp % 10;

            revNum =(revNum*10)+rem;
            temp = temp /10;
        }

        if(num == revNum)
        {
            System.out.println("Is pallindrome ");
        }
        else{
            System.out.println("is Not pallindrome");
        }
    }
}