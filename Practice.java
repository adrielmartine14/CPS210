import java.util.Scanner;
public class Practice
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Type in an integer: ");
		int n= input.nextInt();
		//Conditionals 
		if ((n%2==1) && (n>5)) {
			System.out.println("n^2= "+Math.pow(n,2));
		}
		else if ((n%2==0) && (n<0)) {
			System.out.println("Absolute value of n is: "+Math.abs(n));
		}
		else {
			System.out.println("The remainder divided by 7 is: "+(n%7));
		}
	}
}