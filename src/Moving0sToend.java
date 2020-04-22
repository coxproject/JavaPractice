
/*

 Given an input array {1,0,3,25,6,2,0,4,0,10,0}, the program is to move all zeros to the end of the array

  output: {1,3,25,6,2,4,10,0,0,0,0}

  Approach :
   1. Take an extra array, when ever you see a 0 don't keep that element in the extra array. just count that zero

   2. If the element is not zero, keep that in the extra array

   3. Finally keep adding the count till the extra array gets filled. 

 */

public class Moving0sToend {

	public static void main(String[] args) {
		int[] input = {1,0,3,25,6,2,0,4,0,10,0};
		
		int[] add = new int[input.length];
		
		int count =0;
		
		for(int i=0; i<input.length;i++) {
			if(input[i]!=0) {
				add[count++] = input[i];
			}
		}
		
		while(count < add.length) {
			add[count++]=0;
		}
		
		for(int i : add) {
			System.out.print(i+" ");
		}

	}

}
