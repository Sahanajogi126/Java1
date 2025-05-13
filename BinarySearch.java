public class BinarySearch {
    int binarysearch(int[] arr,int l,int r,int ele)
    {
        while(l<=r)
        {
           int mid=(l+r)/2;
           if(arr[mid]==ele)
           {
               return mid;
           }
           else if(arr[mid]<ele)
           {
              l=mid+1; 
           }
           else if(arr[mid]>ele)
           {
               r=mid-1;
           }
        }
        return 0;
      
        
    }
    public static void main(String[] args)
    {
        int[] arr={5,9,17,23,25,45,59,63,71,89};
        int l=0;
        int r=arr.length-1;
        int ele=59;
        BinarySearch b=new BinarySearch();
        System.out.println(b.binarysearch(arr, l, r, ele));
    }
    
}
