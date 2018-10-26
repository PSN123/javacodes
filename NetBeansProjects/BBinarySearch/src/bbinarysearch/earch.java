package bbinarysearch;

public class earch{    
   
    
    public static void main(String[] args) {
    int n=0,low,high,mid;
        int arr[]={1,2,3,4,5};
    int search= 4;

low=0;
high=4;
mid=(low+high)/2;

while(low<high){
    if(arr[mid]<search){
        low=mid+1;
        mid=(low+high)/2;
       }else if(arr[mid]==search){
        System.out.println("found at "+mid);        
   break;
    }
else{
        high =mid+1;
mid=(low+high)/2;
    }

}
    }
}