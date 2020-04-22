import java.util.Scanner;

public class Palindrome {
	public boolean  palindromeFunc(String str)
	{
		if (str==null || str.length()==0 || str==" ") 
		{
			return false;
		}
		else
		{
		  char[] ch = str.toCharArray();
		  String rev = "";
		  for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + ch[i];
		  }
		 System.out.println(rev);
		if (rev.equalsIgnoreCase(str))
			return true;
		else
			return false;
		}
	}
}