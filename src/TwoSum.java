import java.util.HashSet;
import java.util.Set;

/*
 *Two Sum Problem or pair elements
  I give you a list of array of elements
  target_sum =8;
  You have to give me the pair of elements matching to target sum
  Output : {2,6}, {0,8}
  Approach :
   1. Find a way to remove the duplicates in the complete array. 
   (You can use some container to remove the duplicate and let the elements be in the container

   2. Again Iterate through complete array and for each element, find the difference that is (difference = target sum - each number)

   3. Check if the diff is there in the container, if it is there then that number and diff are pair of elements thats all. 
    Just print that num and diff

​
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,6,0,1,10,13,8,5,4,2,6};
		int target_sum = 8;
		int diff;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0 ; i<nums.length; i++) {
		  if(!set.contains(nums[i])) {
			  set.add(nums[i]);
		  }
		}
		
		for(int i=0;i<nums.length; i++) {
			diff = target_sum - nums[i];
			if(set.contains(diff))
				System.out.println("{"+nums[i]+","+diff+"}");
		}

	}

}
