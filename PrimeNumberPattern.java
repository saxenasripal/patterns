/*
 2
 3  5
 7  11  13
 17  19  23  29
*/


class PrimeNumberPattern 
{
	public static void main(String[] args) 
	{
		
		int n=1;
		for (int i=1;i<=4 ;i++ )
		{
			int c=1;
			while(c<=i)
				{
					int count=0;
					for (int k=1;k<n ;k++ )
					{
						if(n%k==0)
						{
							count++;
						}
						if (count==2)
						{
						break;
						}
					}
					if (count==1)
					{
					System.out.print(" "+n+" ");
					c++;
					}
					n++;
				}
				
				System.out.println();			
			
		}
	}	
}
