
public class RecursionDemo 
{
  /*public static int fact(int n)
  {
	if(n==0 || n==1)
	  return 1;
	else
		return n*fact(n-1);
  }*/
  
	public static int fibonacii(int val)
	{
		     if (val==0)
		         return 0;
		     else if (val==1)
		       return 1;
		     else
		         return (fibonacii(val-1)+fibonacii(val-2));
		 }
	   
	}
  

