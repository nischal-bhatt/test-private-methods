package test.pvt.methods;

public class Adder {

	public static void main(String[] args)
	{
		System.out.println("egt");
		Adder a = new Adder();
		System.out.println(a.add(2, 3, 4));
		System.out.println();
	}
	
	private int add(Integer a, Integer b, Integer c)
	{
		System.out.println("we are inside here , but from outside! ");
		return a+b+c;
	}
}
