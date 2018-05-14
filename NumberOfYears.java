import java.util.Scanner;
public class NumberOfYears
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int x= input.nextInt();
		int a = x / 525600;
		int b = x % 525600;
		int c = b / 1440;

		System.out.println(x + " minutes is approximately " + a + " years and " + c + " days.");
	}
}