import java.util.Scanner;
public class UnicodeValue
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Input a single character");
		char a= input.nextLine().charAt(0);
		//
		System.out.println(Integer.toHexString((int)a));
	}
}