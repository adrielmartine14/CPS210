public class RandomDigitsAndChars
{
	public static void main(String[] args){
		System.out.println("Printing 5 random Digits");
		for (int i=0; i<4;i++){
 			System.out.print(randomDigitAsChar()+ ", ");
		}
		System.out.println(randomDigitAsChar());

		System.out.println("Printing 5 random lower case letters");
		for (int i=0; i<4;i++){
 			System.out.print(randomLowercaseChar()+ ", ");
		}
		System.out.println(randomLowercaseChar());

		System.out.println("Printing 5 random upper case letters");
		for (int i=0; i<4;i++){
 			System.out.print(randomUppercaseChar()+ ", ");
		}
		System.out.println(randomUppercaseChar());
 	}
 	//methods
 	public static int randomDigitAsInt(){
 		return (int)(Math.random()*10);
 	}
 	public static char randomDigitAsChar(){
 		return (char)(Math.random()*10);
 	}
 	public static char randomLowercaseChar(){
 		int x=(int)(97+Math.random()*26);
 		return (char)x;
 	}
 	public static char randomUppercaseChar(){
 		int x=(int)(65+Math.random()*26);
 		return (char)x;
 	}
}