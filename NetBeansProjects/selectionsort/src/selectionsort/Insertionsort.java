package selectionsort;

public class Insertionsort {

    void sort(int arr[]){
        int n=arr.length;
    
     for(int i=0; i<n-1; i++){
         
         int mid=i;
         for(int j=i+1;j<n;j++)
          if(arr[j]<arr[mid])
              mid=j;
         
         int temp=arr[mid];
         arr[mid]=arr[i];
         arr[i]=temp;
             }   
    
    }

    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n; ++i)
            System.out.println(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
Insertionsort i=new Insertionsort();
int arr[]={7,5,3,4,2,6,1};
i.sort(arr);
        System.out.println("before sorting:"+arr);
System.out.println("Sorted array");
        i.printArray(arr);
    }
    
}
