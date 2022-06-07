//*
//**
//***
//****
//*****


package basicprogram;

public class Starpattern3
{
	
		public static void main(String[] agrs)
		{
			int i,j;
			for (i=1;i<=5;i++) //row i=1<=5 true
			{
				for (j=1;j<=i;j++) //column j=1<=5 
				{
					System.out.print("*");
				}//internal loop
				
					System.out.println();
					
				
			}//external loop
					
		}
	}

