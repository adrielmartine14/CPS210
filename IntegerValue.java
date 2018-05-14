import java.util.Scanner;
public class IntegerValue
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a single integer: ");
		int x = input.nextInt();
		char c = (char)x;
		System.out.println(c+"");
		System.out.println(Integer.toHexString((int)c));
	}
}