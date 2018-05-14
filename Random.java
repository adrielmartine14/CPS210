public class Random
{
	public static void main(String[] args) {
		int num1= (int)((Math.random()*6)+1);
		int num2= (int)((Math.random()*6)+1);
		int num3= (int)((Math.random()*6)+1);
		int num4= (int)((Math.random()*6)+1);
		int num5= (int)((Math.random()*6)+1);

		System.out.println("First roll: "+num1);
		System.out.println("Second Roll: "+num2);
		System.out.println("Third roll: "+num3);
		System.out.println("Fourth roll: "+num4);
		System.out.println("Fifth roll: "+num5);
		System.out.println("Mean value of throws: "+(num1+num2+num3+num4+num5)/5.0);
	}
}