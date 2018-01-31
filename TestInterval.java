
/**
The main method of this class tests all of the constructors and methods of the Interval class
*/
public class TestInterval{
	public static void main(String[] args){
		System.out.println("\n\nTesting the Interval class\n\n");
		Interval a = new Interval(1,2);
		Interval a2 = new Interval(1,2);
		Interval b = new Interval(-5,-2);
		Interval c = new Interval(2,4);
		Interval d = new Interval(-2,2);
		Interval e = new Interval(4);

		System.out.println("a.getLo() = "+ a.getLo()+
		   " and it should be 1");
		System.out.println("a.getHi() = "+ a.getHi()+
	 	   " and it should be 2");

		System.out.println("a.getLo() = "+ a.getLo()+
		   " and it should be 3");
		System.out.println("a.getHi() = "+ a.getHi()+
	 	   " and it should be 6");




	}
}
