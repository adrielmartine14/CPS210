import java.util.Scanner;
public class FeetToMeters
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double x= input.nextDouble();
		System.out.println(x +" feet is "+(x*0.305)+ " meters");	
	}
}