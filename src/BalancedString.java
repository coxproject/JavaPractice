import java.util.Stack;

/*1. consider each of them as characters '{', '(', '[' '}', ')', ']' iterate through complete string

when ever you see openings characters'{', '(', '[' push them to stack
​
2. When ever you see closing character make sure check from the stack using peek and if closing is of same type as the one that is pushed into stack then just pop it

for example take 1st input {( -- these 2 are there in stack, the next element is ) in the string then 

peek in the stack and if is ( then pop that element so ) will be popped. like wise do others */

public class BalancedString {

	public static void main(String[] args) {
		
       String str = "{}[]()";
       char[] ch = str.toCharArray();
       Stack<Character> stack = new Stack<Character>();
       
       for(int i=0;i<ch.length;i++) {
    	   if(ch[i]=='{' || ch[i]=='(' || ch[i]=='[') {
    		   stack.push(ch[i]);
    	   }
    	   else if(ch[i]=='}' && stack.peek()=='{') {
    		   stack.pop();
    	   }
    	   else if(ch[i]==')' && stack.peek()=='(') {
    		   stack.pop();
    	   }
    	   else if(ch[i]==']' && stack.peek()=='[') {
    		   stack.pop();
    	   }
       }
       
       if(stack.isEmpty()) {
    	   System.out.println("True");
       }
       else
    	   System.out.println("False");
    		   
	}

}
