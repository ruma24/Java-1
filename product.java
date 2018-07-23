import java.util.*;
import java.lang.*;
import java.util.Scanner;

class product
{  
    

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        product = num1 * num2;
        System.out.println("Product of these numbers: "+product);
    }
}
