import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc4=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc4.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
    
}
