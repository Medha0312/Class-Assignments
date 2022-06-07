//*****
//****
//***
//**
//*




package basicprogram;


public class Starpattern2 {
	public static void main(String[] agrs)
	{
		int i,j;
		for (i=5;i>=1;i--)//row
		{
			for (j=1;j<=i;j++)//column
			{
				System.out.print("*");
			}//internal loop
			System.out.println();
		}//external loop
				
	}
}	
	

