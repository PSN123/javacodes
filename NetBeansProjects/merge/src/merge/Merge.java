package merge;

public class Merge {

public static void arrayinsert(int arr[]){
    int index = 0;
    
    System.out.println("length half "+arr.length/2);

    for(int b=0; b<arr.length-arr.length/2;b++){
        System.out.print("loop 1 "+ arr[b]+" "); 
       
    }
    System.out.println("\\n");
for(int c=0;c<arr.length/2;c++){
    System.out.print("loop 2 "+arr[c]+" ");
index=c;
}
   System.out.println("\\n");
for(int d=0; d<arr.length/2;d++){
    System.out.println("loop 3 "+arr[d]);
}
    System.out.println("\\n");

    for(int e=index; e<arr.length;e++){
        System.out.print("loop 4 "+arr[e]+" ");       
    }
 System.out.println("\\n");
   
  for(int e=index; e<arr.length;e++){
        System.out.print("loop 5 "+arr[e]+" ");       
    }
 System.out.println("\\n");
 
 
    }
    
    public static void main(String[] args) {
  int a[] ={10,30,40,20,50};
       
    Merge.arrayinsert(a);
    }
    
}
