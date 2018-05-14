import java.util.Scanner;
public class CharOutput
{
	public static void main(String[] args) {
		Scanner output= new Scanner(System.in);
		int x1= (int)(65+(Math.random()*26));
		int x2= (int)(65+(Math.random()*26));
		char a= (char)x1;
		char b= (char)x2;
		System.out.println(a+","+ b);
		int y1= (int)(97+(Math.random()*26));
		int y2= (int)(97+(Math.random()*26));
		char c=(char)y1;
		char d=(char)y2;
		System.out.println(c+","+ d);
	}
}