import java.util.Scanner;
public class Valid
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a value for months: ");
		int x=in.nextInt();
		//
		int a = x / 12;
		int b = x % 12;
		int c = b / 12;
		System.out.println("Parking tag is valid for "+ a +"and"+ b);
	}
}