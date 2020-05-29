import java.util.Scanner;
public class Reverse
{
	public static void main(String[] args) 
	{
		int number, i;
		Scanner s= new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		number = s.nextInt();	
		for(i = number; i >= 1; i--)
		{
			System.out.print(i +"\t"); 
		}	
	}
}