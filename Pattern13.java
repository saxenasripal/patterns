/*
 1  3  5
 7  9  11
 13  15  17
*/

class Pattern13
{
	public static void main(String[] args) 
	{
		int a=2;
		for (int i=1;i<=3 ;i++ )
		{
			for (int j=1;j<=3 ;j++ )
			{
				System.out.print(" "+a+" ");
				a+=2;
			}
			System.out.println();
		}		
	}
}
