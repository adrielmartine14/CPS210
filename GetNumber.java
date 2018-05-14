import java.util.Scanner;
public class GetNumber{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1= input.next();
		//
		for (int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if (Character.isLetter(c)== true) {
				c=Character.toUpperCase(c);
				int x= getNumber(c);
				System.out.print(x);
			}
			else {
				System.out.print(c);
			}
		}
	}
	public static int getNumber(char uppercaseLetter){
		switch (uppercaseLetter) {
			case'A':
			case'B':
			case'C': 
				return 2;
			case'D':
			case'E':
			case'F': 
				return 3;
			case'G':
			case'H':
			case'I': 
				return 4;
			case'J':
			case'K':
			case'L': 
				return 5;
			case'M':
			case'N':
			case'O': 
				return 6;
			case'P':
			case'Q':
			case'R':
			case'S': 
				return 7;
			case'T':
			case'U':
			case'V': 
				return 8;
			default: 
				return 9;
		}
	}
}