
import java.util.Stack;


public class SenteceRev {

	public static void stack_operations(String str) {
		
		Stack<String> stack = new Stack<String>();
		String[] arr_str = str.split(" ");
		
		for(int i=0;i<arr_str.length;i++)
		{
			System.out.print(stack.push(arr_str[i])+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr_str.length;i++)
		{
			System.out.print(stack.pop()+" ");
		}
	}
	
	
}
