import java.util.Arrays;

/*
 * 
 * Find the square of that array
   input:{-6,-4,1,2,3,5}
   output: {1,4,9,16,25,36}

   Approach:
    1. First get all the elements from Array n square it and keep them back in the array
    2. Sort the complete array
    3. Iterate through the array and print the elements in the array
  
 */
public class SquareOfArray {

	public static void main(String[] args) {
		int[] arr = {-6,-4,1,2,3,5};
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		 }
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
