import java.util.Scanner;
public class Max_Min
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 ints: ");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		int d= input.nextInt();
		int e= input.nextInt();
		//Computations
		int x= Math.max(Math.max(Math.max(Math.max(a,b),c),d),e);
		int y= Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
		System.out.println("Max: "+ x);
		System.out.println("Min: "+ y);
		//System.out.println(1100*Math.tan(Math.toRadians(19)));
	}
}