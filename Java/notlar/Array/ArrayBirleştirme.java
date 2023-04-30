//Write a method that combines two given arrays and returns the resulting array back.  Complete your program with a main method.
//public static int[ ] combineArrays(int[ ]  a1, int[ ] a2)

public class ArrayBirleştirme {
    public static void main(String[] args) {
        int[] list1 = {-2, 5, 9};
		int[] list2 = {-8, 12, -4, 56};
		int[] list3 = combineArrays(list1,list2);
		System.out.println("The elements of the new array: ");
		for(int i=0;i< list3.length;i++)
    	  	 System.out.print(list3[i]+  " ");

    }
	
    public static int[] combineArrays(int[] A1, int[] A2){
		int[] res = new int[A1.length+A2.length];
		int j=0;
		for(int i=0;i<A1.length;i++){
		     res[j]=A1[i];
		     j++;
	       }
	       for(int i=0;i<A2.length;i++){
		    res[j]=A2[i];
		    j++;
	       }
		return res;
	}

}
