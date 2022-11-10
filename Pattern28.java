/*

 *  *                          *  *
    *  *                    *  *
       *  *              *  *
          *  *  *  *  *  *
*/

class Pattern28 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==j||i==j-1)
				{
					System.out.print(" * ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			for (int j=6;j<=8 ;j++ )
			{
				if (i==4)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
				
			}
			for (int j=12;j>=9 ;j--)
			{
				/*for (int k=1;k<=4-i ;k++ )
				{
					System.out.print("   ");
				}
				for (int k=1;k<=2 ;k++ )
				{
					System.out.print(" * ");
				}*/
				if(i+8==j||i+8==j-1)
					System.out.print(" * " );
				else
					System.out.print("   ");
				
				
			}
			System.out.println();
			
			
		}
	}
}
