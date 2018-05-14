import java.util.Scanner;
public class Gratuity
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		int a= input.nextInt();
		int b= input.nextInt();
		//computations
		double x= b*0.1;
		double y= a+x;
		System.out.println("The gratuity is $"+ x +" and the total is $"+ y);
	}
}