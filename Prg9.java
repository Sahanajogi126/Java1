public class Prg9 {
    public static void main(String[] args){
        int age=46;
        char gender='f';
        if(gender=='M'||gender=='m')
        {
            if(age>18)
                    {
                      System.out.println("Eligible bachelor");
                    }
            else
            {
                System.out.println("Not eligible bachelor");
            }
        }
        else if(gender=='F'||gender=='f')
        {
            if(age>18)
                    {
                       System.out.println("Eligible spinster");
                    }
            else
            {
                System.out.println("Not eligible spinster");
            }
        }
    }
    
}
