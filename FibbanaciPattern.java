 /*
 0
 1  1
 2  3  5
 8  13  21  34
 
 */


class FibbanaciPattern 
{
	public static void main(String[] args) 
	{
	int a=0,b=1,c=0;
	for (int j=1;j<=4 ;j++ )
		{
			for (int k=1;k<=j ;k++ )
			{
				c=a+c;
				System.out.print(" "+c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}
