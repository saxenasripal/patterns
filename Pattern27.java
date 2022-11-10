/*
 a
 1  a
 2  3  a
 4  5  6  a
*/


class Pattern27 
{
	public static void main(String[] args) 
	{
		int a=1;
		for (int i=1;i<=4 ;i++ )
		{
			int j;
			for (j=1;j<i ;j++ )
			{
				System.out.print(" "+a+" ");
				a++;
			}
			for (int k=i;k==j ;k++)
			{
				System.out.print(" a ");
			}
				System.out.println();
		}
		
	}
}
