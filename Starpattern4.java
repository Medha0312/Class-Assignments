// wap to check delta star pattern


package basicprogram;

public class Starpattern4
{
 public static void main(String[] args)
 {
	 int i,j,k;
	 for (i=1;i<=5;i++) //row
	 {
		 for(j=5;j>=i;j--)// space
		 {
			 System.out.print(" ");
			 
		 }
	for (k=1;k<=i;k++)
	{
		System.out.print("* ");//line
	}
	System.out.println();//new line for next row
	 }
 }
}
