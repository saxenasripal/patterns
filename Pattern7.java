/*
 *  *  *  *
 a  b  c  d
 *  *  *  *
*/
class Pattern7
{
	public static void main(String[] args) 
	{
		char ch='a';
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i==2)
				{
					System.out.print(" "+ch+" ");
					ch++;
				}
				else
				{
				System.out.print(" * ");
				}
			}
			System.out.println();
		}		
	}
}
