package basicprogram;
import java.util.Scanner;

public class Pattern3
{
	public static void main (String[] args)
	{
		int n,i,j,k;
		System.out.println("Enter any Number: ");
		Scanner sc= new Scanner (System.in);
		n=sc.nextInt();// getting input from user
		for(i=1;i<=n;i++)//outerloop
		{
			for (j=n;j>=i;j--)//inner loop for printing space
			{
				System.out.print(" ");//print space
			}
			for (k=1;k<=i;k++)//inner loop star 
			{
				System.out.print(k+ " ");
			}
			System.out.println();// print next line
		}
		//next line
		
		for(i=1;i<=n-1;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for (k=n-1;k>=i;k--)
			{
				System.out.print( k +" ");
			
			}
			System.out.println();//Print next line
		}
			
	}

}
