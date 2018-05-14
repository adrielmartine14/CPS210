import java.util.Scanner;
public class SecondsConversion
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter # of seconds: ");
		int x=input.nextInt();
		//Computations
		int days= x/(60*60*24);
		int a= x%(60*60*24);
		int hours= a/(60*60);
		int b= a%(60*60);
		int minutes= b/(60);
		int seconds= b%(60);


		System.out.println(days+" Days, "+hours+" Hours, "+minutes+" Minutes, "+seconds+" Seconds");
	}
}