/*

 *           *
 *  *     *  *
 *  *  *  *  *
 
 */

class Pattern26
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=3;i++ )
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(" * ");				
			}
			for (int k=1;k<=3-i;k++ )
			{
				System.out.print("   ");
			}
			for (int l=1;l<=2-i ;l++ )
			{
				System.out.print("   ");
			}
			for (int m=1;m<=i;m++ )
			{
				if (m!=3)
				{
					System.out.print(" * ");
				}
				
			}
			System.out.println();
		}		
	}
}
