import java. util. Arrays;

class ArraySort{
    public static void main(String [] args){
        int[] arr = {2,5,2,6,3,5,7,4};
        // remove repetitions
        for(int i=0; i<arr.length; i++)
        {   
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]);
            }
            
          
          
        }
        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
     
    }
}
