// Find ASCII value of a character
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      
      System.out.println("Enter a character to find ASCII value :");
      char ch = (sc.next()).charAt(0);
      int ASCII =ch;

      System.out.println("ASCII value of character "+ch+" is "+ASCII);
      sc.close();
    }
}