import java.util.*;
import java.lang.*;

class Calc
{  
  
   public static void main(String args[])
    {
        
        int num1, num2, sum,diff,pro,quo,mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 / num2;
        System.out.println("Sum of these numbers: "+sum);
        diff = num1 - num2;
        System.out.println("Difference of these numbers: "+diff);
        pro = num1 * num2;
        System.out.println("Product of these numbers: "+pro);
        quo= num1 / num2;
        System.out.println("Quotient of these numbers: "+quo);
        mod = num1 % num2;
        System.out.println("Remainder of these numbers: "+mod);
    }
   
}
