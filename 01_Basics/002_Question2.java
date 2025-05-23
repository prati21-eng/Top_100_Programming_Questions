class Main{
    public static void main(String[] args) {
        //swapping two numbers tradional method
        int a= 10;
        int b= 20;
        // int temp = a;
        // a=b;
        // b=temp;

        // System.out.println(a+" "+ b);

        //without using third variable

        a = b+a;
        b= a-b;
        a= a-b;
        System.out.println(a+" "+ b);
    }
}
