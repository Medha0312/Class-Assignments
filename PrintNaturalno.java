package basicprogram;

import java.util.Scanner;

public class PrintNaturalno
{
	public static void main(String[] args) {
		int i,n;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the range to print natural no: ");
		n=sc.nextInt();
		
		for (i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
