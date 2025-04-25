import java.util.Scanner;
public class StrongNumberCheck {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc2.nextInt();
        int original=number;
        int sum=0;
        while(number>0){
            int digit =number%10;
            sum+=factorial(digit);
            number/=10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a strong number");
        }
    }
    
}
