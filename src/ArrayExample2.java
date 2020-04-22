import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayExample2 {

	/*
	 * public static void largest() { int[] arr = {3,4,10,1,9}; TreeSet<Integer> set
	 * = new TreeSet<Integer>(); for(int i=0;i<arr.length;i++) { set.add(arr[i]); }
	 * System.out.println(set);
	 * System.out.println("First largest element in array: "+set.pollLast());
	 * Object[] a= set.toArray(); for(int i=0;i<a.length;i++) {
	 * System.out.println("Second largest element in array :"+a[a.length-1]); break;
	 * } }
	 */
	
	public static void largest() {
		int[] arr = { 3, 4, 10, 1, 9 };
		int len =  arr.length;
        int max;
        for(int i=len-1;i>0;i--)
        {
        	for(int j=i-1;j>=0;j--)
        	{
        		if(arr[i]>arr[j])
        		{
        			max = arr[i];
        			arr[i] = arr[j];
        			arr[j] = max;
        		}
        		
        	}
        }
        for(int i=0;i<len-1;i++)
        {
        	System.out.println("First largest element in array :"+arr[i]);
        	System.out.println("Second largest element in arraay :"+(arr[i]-1));
        	break;
        }
	}

}
