public class SmallestIntN
{
	public static void main(String[] args) {
		int n=1;
		while (Math.pow(n,2)<12000) {
			if(Math.pow(n,2)>12000){
				System.out.println(n);
			}
			n++;
		}
		System.out.println("Smallest integer where n squared is greater than 12000: "+n);
	}
}