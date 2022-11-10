/*

 *  *  *  *  *  *
 *  *        *  *
 *              *
 *  *        *  *
 *  *  *  *  *  *

*/

class Pattern30 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3 ;i++ )
		{
			if (i!=3)
			{
			
				for (int j=1;j<=4-i ;j++ )
				{
					System.out.print(" * ");
				}
				for (int j=1;j<=i-j;j++ )
				{
					System.out.print("   ");
				}
				for (int j=1;j<=i-j;j++)
				{
					System.out.print("   ");
				}
				for (int j=1;j<=4-i ;j++ )
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			else
			{
				for (int j=1;j<=6 ;j++ )
				{
					if (j==1||j==6)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
			}
		}
		System.out.println();
		for (int i=1;i<=2 ;i++ )
		{
			for (int j=1;j<=i+1;j++ )
			{
				System.out.print(" * ");
			}
			for (int j=1;j==2-i ;j++ )
			{
				System.out.print("   ");
			}
			
			for (int j=1;j==2-i ;j++ )
			{
				System.out.print("   ");
			}
			for (int j=1;j<=i+1;j++ )
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
