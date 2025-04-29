class Whatsapp1 {
    void deliveryReport(){
        System.out.println("Single Tick");
    }
    void chat(){
        System.out.println("Texting");
    }
    
}
class Whatsapp2 extends Whatsapp1{
    void deliveryReport(){
        super.deliveryReport();
        System.out.println("Double Tick");
    }
    void calling(){
        System.out.println("Voice/Video Calling");
    }
    
}
class Whatsapp3 extends Whatsapp2{
    void deliveryReport(){
        super.deliveryReport();
        System.out.println("Blue Tick");
    }
    void status(){
        System.out.println("Status Updation");
    }
}
public class Whatsapp{
    public static void main(String[] args){
        Whatsapp3 wa=new Whatsapp3();
        wa.deliveryReport();
        wa.chat();
        wa.calling();
        wa.status();
    }
}

