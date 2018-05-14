import java.util.Scanner;
public class SingleChar
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a character: ");
		char a= input.nextLine().charAt(0);
		//
		if (Character.isLetter(a)){
			if (Character.isLowerCase(a)) {
				System.out.println(a+" is a lower case letter");
			}
			else (Character.isUpperCase(a)) {
				System.out.println(a+" is a upper case letter");
			}
		}
		else if (Character.isDigit(a)) {
			System.out.println(a+" is a digit");
		}
		else {
			System.out.println("Character is neither a digit nor letter");
		}
	}
}