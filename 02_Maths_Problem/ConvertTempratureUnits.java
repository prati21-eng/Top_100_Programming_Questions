// Convert temperature units (C <-> F)
import java.util.Scanner;
class Main{

    public static double ctof(double cel){
        return (cel* 9/5)+32;
    }

    public static double ftoc(double far)
    {
        return( far-32)*5/9;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre Temprature in Celcius :");
        double ctemp = sc.nextDouble();

        System.out.print("Enter temprature in fahrenheit");
        double ftemp = sc.nextDouble();

        System.out.println(ctemp +" = " +ctof(ctemp) +"fahrenheit");
        System.out.println(ftemp +" = " +ftoc(ftemp) +"celcius");
        sc.close();
    }
}