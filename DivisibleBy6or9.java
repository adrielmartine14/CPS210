public class DivisibleBy6or9
{
	public static void main(String[] args) {
		int count= 0;
		for (int i=1;i<=2000;i++) {
			if (i%6==0 || i%9==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}