import java.util.Scanner;

public class currency 
{
    public static void main (String []args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency value ");
        double inr =sc.nextInt(); 
        double usd = inr * 0.012; 
        System.out.println("Indian curreny of " + inr +  " rupees will be " + usd + " in US market ");
        sc.close();
    }
    
}
