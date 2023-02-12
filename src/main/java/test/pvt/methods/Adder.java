package test.pvt.methods;

public class Adder {

	private int add(Integer a, Integer b, Integer c)
	{
		System.out.println("we are inside here , but from outside! ");
		return a+b+c;
	}
}
