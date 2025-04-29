public class City {
    void place(int a){
        System.out.println("Chennai");
    }
    void place(int a,int b){
        System.out.println("Udupi");
    }
    void place(int a,int b,int c){
        System.out.println("Pune");
    }

    
    public static void main(String[] args) {
        City c=new City();
        c.place(10);
        c.place(15,55);
        c.place(10,30,56);
       
    }
    
}
