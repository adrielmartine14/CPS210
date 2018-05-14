import java.util.Scanner;
public class CurrencyExchange
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double x= input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int a= input.nextInt();
		if (a==0) {
			System.out.print("Enter the dollar amount: ");
			double y=input.nextInt();
			System.out.print("$"+y+" is "+ y*x+" Yuan");
		}
		else if (a==1) {
			System.out.print("Enter the RMB amount: ");
			double z=input.nextInt();
			System.out.print("$"+z+" Yuan is"+" $"+z/x);
		}
		else
			System.out.println("Incorrect input");
	}
}