import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1=scanner.nextDouble();
        System.out.println("Enter num2: ");
        double num2=scanner.nextDouble();
        double sum=num1+num2;
        double diff=num1-num2;
        double prod=num1*num2;
        double div1=num1/num2;
        int div2=(int)(num1/num2);
        double rem1=num1%num2;
        double exp1=Math.pow(num1,num2);
        System.out.println("Sum = "+ sum);
        System.out.println("Difference = "+ diff);
        System.out.println("Product = "+ prod);
        System.out.println("Decimal Division  = "+ div1);
        System.out.println("Quotient  = "+ div2);
        System.out.println("Remainder = "+ rem1);
        System.out.println("Exponentiation = "+ exp1);
        scanner.close();
    }
}
        
        
        
        
        
        
    
    

