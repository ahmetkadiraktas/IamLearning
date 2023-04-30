/*Write a method called linearSearch that inputs a key element and an array and compares the key element sequentially with each element in the array.  
It continues to do so until the key matches an element in the array or the array is exhausted without a match being found. 
If a match is made, the linearSearch returns the index of the element in the array that matches the key. 
If no match is found, the search returns -1.       */

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);  // returns 1
        int j = linearSearch(list, -4); // returns -1 ************************  burada bir hata var  ******************
        int k = linearSearch(list, -3); // returns 5
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
      }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++){
          if (key == list[i]){
            return i;
          }
        }
        return -1;
    
    }
    
}
