
public class Factorial 
{
	public static int fact_num(int num)
	{
		int fact = 1;
		if(num==0 || num==1)
			return 1;
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
		}
		return fact;
	}
}


