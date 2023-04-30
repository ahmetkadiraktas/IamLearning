import java.util.Scanner ;

public class ArrayElemanSilme {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double [] list = new double[10];
        for(int i=0;i<list.length;i++){
           list[i] = Math.random()*100;
           System.out.print(list[i]+  " ");
        }
        System.out.print("Enter an index value: ");
        int index = kb.nextInt();
        double[] list2 = removeMember(list, index);
        System.out.println("New list: ");
        for(int i=0;i<list2.length;i++)
           System.out.print(list2[i]+  " ");
       }
       public static double[] removeMember(double[] a, int idx){
        double[] b = new double[a.length-1];
        int j=0;
        for(int i=0;i<a.length;i++){
         if(i!=idx){
           b[j]=a[i];
           j++;
         }
        }
         return b;
      
    }
    
}
