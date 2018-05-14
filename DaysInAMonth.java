import java.util.Scanner;
public class DaysInAMonth
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Month in terms of an integer: ");
		int month= input.nextInt();
		System.out.println("Enter a Year: ");
		int year= input.nextInt();
		//
		if (((year % 4==0) && (year % 100 !=0) ) || (year % 400==0)) {
			switch(month){
			case 1: System.out.println("This month has 31 days");
			break;
			case 2: System.out.println("Ths month has 29 days");
			break;
			case 3: System.out.println("This month has 30 days");
			break;
			case 4: System.out.println("This month has 30 days");
			break;
			case 5: System.out.println("This month has 31 days");
			break;
			case 6: System.out.println("This month has 29 days");
			break;
			case 7: System.out.println("This month has 31 days");
			break;
			case 8: System.out.println("This month has 31 days");
			break;
			case 9: System.out.println("This month has 30 days");
			break;
			case 10: System.out.println("This month has 31 days");
			break;
			case 11: System.out.println("This month has 30 days");
			break;
			default: System.out.println("This month has 31 days");
			}
		}
		else
			switch(month){
			case 1: System.out.println("This month has 31 days");
			break;
			case 2: System.out.println("Ths month has 28 days");
			break;
			case 3: System.out.println("This month has 30 days");
			break;
			case 4: System.out.println("This month has 30 days");
			break;
			case 5: System.out.println("This month has 31 days");
			break;
			case 6: System.out.println("This month has 29 days");
			break;
			case 7: System.out.println("This month has 31 days");
			break;
			case 8: System.out.println("This month has 31 days");
			break;
			case 9: System.out.println("This month has 30 days");
			break;
			case 10: System.out.println("This month has 31 days");
			break;
			case 11: System.out.println("This month has 30 days");
			break;
			default: System.out.println("This month has 31 days");
			}
	}
}