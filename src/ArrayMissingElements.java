import java.util.HashSet;
import java.util.Set;

/*
 * int[] array = {1,2,3,6,7,10,14}

 Missing Elements = {4,5,8,9,11,12,13}

The array is in increasing order. so you no need to sort it.It doesn't have duplicates and even if duplicates ignore them.

Approach
1. Add all the coins that you have into the  container- This may also remove duplicates.

2. you know the starting coin is 1 and ending coin in 14. So walk from 1 to 14 Integers and see if each coin is present in the container or not. If its not present add that coin to a list. And finally return the list.
 
 */
public class ArrayMissingElements {

	public static void main(String[] args) {
		int[] array = {1,2,3,6,7,10,14};
		int first = array[0];
		int last = array.length-1;
		int count = array[last];
		
		Set<Integer> set =  new HashSet<Integer>();
		Set<Integer> set1 =  new HashSet<Integer>();
		
		
		for(int i=0;i<array.length;i++) {
			if(!set.contains(array[i])) {
				set.add(array[i]);
			}
		}
		
		System.out.println(set);
		
		for(int i=first;i<=count;i++) {
			set1.add(i);
		}
		
		System.out.println(set1);
		
		set1.removeAll(set);
		System.out.println(set1);
	}

}
