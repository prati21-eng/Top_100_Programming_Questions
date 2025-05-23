class Main{

    private static int findFact(int num){
        return num * findFact(num-1);
    }
    public static void main(String[] args) {
        int num =20;
        System.out.println("Factorial of number "+num +"is"+findFact(num));
    }
}