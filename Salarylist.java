public class Salarylist{
	public static void main(String[] args) {
		int value= Integer.parseInt(args[0]);
		String[] names={"janiece Celli","merrill Deleston","genevie Prader","carter Cembura","harris
			Radomski","arlean Podaras","nakesha Mcgonnell","cordia Suski","joette Lanski","oretha
			Ayudan","aleisha Sauser","winfred Sixtos","glayds Naone","winfred Goularte","oda Levenstein" };
		int[] salaries={45000,45000,55000,50000,45000,
			39000,40000,55000,70000,50000,60000,49000,55000,55000,39000};

			salariesList(salaries, names, value);
	}
	public static void salariesList(int[] salaries, String[] names, int value){
		for (int i=0;i<salaries.length;i++) {
			if (salaries[i]>value) {
				System.out.println(names[i]+" "+salaries[i]);
			}
		}
	}
}