import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDemo 
{
  public static void uniqueElements()
  {
	  int[] arr1 = new int[] {1,2,5,6,75,2,1,2,3};
	  int arr2[] = new int[arr1.length];
	  int count=0;
	  
	  Arrays.sort(arr2);
	  for (int i=0;i<arr2.length;i++)
	  {
		  while(i<arr2.length-1 && arr2[i]==arr2[i+1])
			  i++;
		  System.out.println(arr2[i]+" ");
		
	  }
	  
	  for(int i=0;i<arr2.length;i++)
	  {
		  for(int j=0;j<arr1.length;j++)
		  {
			  if(arr2[i]==arr1[j]+1)
			  {
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  
  }
  
}
