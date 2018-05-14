import java.util.Scanner;
public class StringInput
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string:");
		String s= input.next();
		//
		System.out.println("Length of string: "+s.length());
		System.out.println("First character: "+s.charAt(0));
		System.out.println("Last Character: "+s.charAt(s.length()-1));
		//
		String s2= s.toUpperCase();
		System.out.println(s2);
		String s3= s.toLowerCase();
		System.out.println(s3);
	}
}