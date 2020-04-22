
public class ArrayExample
{
 public static void array_fun()
 {
	 int[] arr = {0,5,3,2,0,0,6,0,2,10,5,0};
	 int size = arr.length;
	 int k = 0;
	 
	 for(int i=0;i<size;i++)
	 {
		if(arr[i] != 0)
		{
			arr[k++]=arr[i];
		}
	 }
	 while(k < size)
	 {
		 arr[k++] =0;
	 }
	 
	 for(int j=0;j<size;j++)
	 {
		 System.out.print(arr[j]+" ");
	 }
	 
 }
}
