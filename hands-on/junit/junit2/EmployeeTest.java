package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	Employee e=new Employee();
	ArrayList<String> list=new ArrayList<>();
	{
		list.add("Muskan");
		list.add("Babita");
		list.add("Agarwal");
	}
	@Test
	public void testFindName() {
		System.out.println(list);
		assertEquals("Result","FOUND",e.findName(list, "Muskan"));
		System.out.println("test");
	}

}
