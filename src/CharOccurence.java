import java.util.HashMap;
import java.util.Map;

/*
Find the characters that occurs more than twice.
String str = "hello if you are not happy then be happy";
String output = h-3, p-4 times it came, p-3, e-4 ,a-3, y-3, o-3
 */
public class CharOccurence {

	public static void main(String[] args) {
		String str = "hello if you are not happy then be happy";
		String str1 = str.toLowerCase();
		char[] ch = str1.replaceAll("\\s", "").toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<ch.length; i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i],1);
			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> e : map.entrySet()) {
			if(e.getValue() > 2) {
				System.out.println(e.getKey()+"="+e.getValue());
			}
		}

	}

}
