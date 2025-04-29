class Amazon {
    void payment(){
        System.out.println("COD");
    }
    void payment(String name){
        System.out.println("UPI Payment");
    }
    void payment(long cardno,int otp){
        System.out.println("Card Payment");
    }
    void payment(String usename,String password){
        System.out.println("Net Bamking");
    }
    
}
public class Prg50{
    public static void main(String[] args){
        Amazon a=new Amazon();
        a.payment();
        a.payment("payment");
        a.payment(12345,18);
        a.payment("ABC","SDNN");
    }
}
