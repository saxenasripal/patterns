/*
 1  2  3
 a  b  c
 4  5  6
 d  e  f
 7  8  9
 g  h  i
*/

class Pattern18 
{
	public static void main(String[] args) 
	{
		int a=1;
		char b='a';
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=3 ;j++)
			{
				if (i%2==0)
				{
					System.out.print(" "+b+" ");
					b++;
				}
				else
				{
					System.out.print(" "+a+" ");
					a++;
				}
			}
			System.out.println();
		}
		
	}
}
