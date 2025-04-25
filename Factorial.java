import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc1.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial *=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
    
}
