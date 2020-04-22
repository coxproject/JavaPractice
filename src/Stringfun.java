import java.util.HashMap;

public class Stringfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String str = "success";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}*/
		
		//finding duplicate charcter occurences in a string
		String str = "success";
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		
		for (char a : ch)
		{
			if(Character.isAlphabetic(a))
			{
				if(charMap.containsKey(a))
				{
					charMap.put(a, charMap.get(a)+1);
				}
				else
				{
					charMap.put(a,1);
				}
			}
		}
		System.out.println(charMap);

	}

}
