import java.util.Scanner;
class CheckPositiveNegativezero{
public static void main(String args[]){
    Scanner scan=new Scanner(System.in); //create a scanner object for input
System.out.print("Enter the integer number: ");

int num=scan.nextInt();//get input from the user for num
if(num>0){
  System.out.println(num+" is a positive number");
}else if(num<0){

  System.out.println(num+" is a Negative number");
}
else{
  System.out.println("The given number is zero");
}
}

