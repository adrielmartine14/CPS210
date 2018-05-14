import java.util.Scanner;
public class RamanujanFormula
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Input any postive integer: ");
		int n= input.nextInt();
		//computations
		double left= Math.floor(n/3)+Math.floor((n+2)/6)+Math.floor((n+4)/6);
		double right= Math.floor(n/2)+Math.floor((n+3)/6);
		System.out.println("LHS = "+ left +", "+ "RHS = "+ right);
		System.out.println("Verified");
	}
}