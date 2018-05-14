import java.util.Scanner;
public class VolumeOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Give a radius value: ");
		double x= input.nextDouble();
		System.out.println("Give a length value: ");
		double y= input.nextDouble();
		double z= (x*x*Math.PI);
		System.out.println("The area is: "+ z);
		System.out.println("The volume is: "+ (z*y));
	}
}