public class MatrixToplama {
    public static void main(String[] args) {
        int[] list1= {10,20,30,40,50,60};
        int[] list2= {2,4,6,8,10,12};
        int[] result= sumArrays(list1,list2);
        for (int a=0; a<result.length; a++){
            System.out.println(result[a]+" ");
        }
    }
    public static int[] sumArrays(int[] a, int[] b){
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++)
        result[i] = a[i]+b[i];
        return result;
  }


    
}
