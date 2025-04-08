public class Prg38 {
    public static void main(String[] args){
        int[] n={11,7,5,3,4};
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
            }
        }
        System.out.println(min);
    }
    
}
