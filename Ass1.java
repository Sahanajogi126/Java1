import java.util.Scanner;
public class Ass1 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        while(b>0)
        {
            a++;
            b--;
            
        }
        System.out.println(a);
    }
    
}
