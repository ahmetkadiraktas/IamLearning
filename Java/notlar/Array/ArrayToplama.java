import java.util.concurrent.SubmissionPublisher;

/*  Write a method that takes as its parameters two arrays of integers and
 returns a new array where the value at each index is the sum of the corresponding 
 two elements of the given arrays at the same index.       */ 

//Note: Assume the arrays are of equal length.



public class ArrayToplama {
    public static void main(String[] args) {
        int[] list1 = {10,20,30,40,50,60};
        int[] list2 = {1,2,3,4,5,6};
        int[] result = sumArrays(list1, list2);

        for ( int i=0; i<result.length; i++){
            System.out.println(result[i]+" ");
        }
    }
    public static int [] sumArrays(int[] a, int[] b){
        int[] resalt = new int[a.length];
        for (int i=0; i<resalt.length; i++){
            resalt[i] = a[i]+b[i];
        }
        return resalt;
        
    }
    
}
