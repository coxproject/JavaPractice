
public class StringExampleSpl {

	public static void specialchar_remove()
	{
		
		String s1 = "Hey@ ManHello!!HowR123U";
		char[] ch = s1.toCharArray();
		String s11 = " ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>64 && ch[i]<=122)
			{
				s11+=ch[i];
			}
		}
		System.out.println("String after removing special characters"+s11);
		
	}
}
