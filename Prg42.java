public class Prg42 {
    public static void main(String[] args){
        int n=1234;
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Total number of digit is"+ count);
    }
    
}
