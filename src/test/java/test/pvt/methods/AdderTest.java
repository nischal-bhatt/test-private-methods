package test.pvt.methods;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;



public class AdderTest {

	@Test
	public void test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Adder a1 = new Adder();
		
		Method method = Adder.class.getDeclaredMethod("add", Integer.class , Integer.class );
	    
		method.setAccessible(true);
		
		Integer[] a = new Integer[2];
		a[0] = 3;
		a[1] = 4;
		Integer b = 13;
		Integer r  = (Integer)method.invoke(a1,6,7);
		assertEquals(b,r);		
	}
	
}
