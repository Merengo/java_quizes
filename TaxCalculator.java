import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Income amount");
       double amount = sc.nextDouble();
       double result = incomeTax(amount);
       System.out.print("Your income tax is "+result);
       sc.close();
    }
    
    static double incomeTax(double i)
    {
        double tax, amount = i;
        if(amount<=300000){
            tax = 0.00;
        }else{
           tax = 0.25*amount;
        }
       return tax;
    }
}
