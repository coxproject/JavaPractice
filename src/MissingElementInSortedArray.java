
/*
 * Problem statemnet
 * ​given sorted array of integers {1,2,3,5,6,7}
 * Output-4
 * Algorithm
 * 1. Find sum all elements in the array (store in some variable) - This call as sum variable
 * 2. Find the largest elemnet in the array & apply the formula n*(n+1)/2 where n is the largest element in the array - store in K variable
 * 3. Perform sum-k
 */
public class MissingElementInSortedArray {

	public static void main(String[] args) {
		
        int[] nums = {1,2,3,5,6,7};
        int len = nums.length;
        int max = nums[len-1]; //Largest element in the array
        int sum =0;
        
        //sum of all array elements
        for(int i=0;i<len;i++) {
        	sum+=nums[i];
        }
        
        //applying formula
        int k = max*(max+1)/2;
        
        int m = k - sum;
        System.out.println("Missing elemnt in the array is :"+m);
        
        
	}

}
