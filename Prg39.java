public class Prg39 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int left=arr.length/2;
        int right=arr.length-1;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
}
