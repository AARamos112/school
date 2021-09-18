/**
 * @author Angel Ramos
 *
 */
package week03;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest
{
	Employee tester = new Employee();
	String word = "Test";
	
	
	@Test
	public void testEmployeeOne()
	{
		Employee tester = new Employee();
		assertEquals("New First", tester.getFirstName());
		assertEquals("New Last", tester.getLastName());
	}
	
	@Test
	public void testEmployeeTwo()
	{
		Employee tester = new Employee("the first", "the last");
		assertEquals("the first", tester.getFirstName());
		assertEquals("the last", tester.getLastName());
	}
	
	@Test
	public void testEmployeeThree()
	{
		Employee tester = new Employee("the first", "the last", 3.3);
		assertEquals("the first", tester.getFirstName());
		assertEquals("the last", tester.getLastName());
		assertEquals(3.3, tester.getSalary(), 1);
	}
	
	@Test
	public void testSetFirstName()
	{
		Employee tester = new Employee();
		tester.setFirstName("Test");
		String expected = "Test";
		String actual = tester.getFirstName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testSetLastName()
	{
		Employee tester = new Employee();
		tester.setLastName("Test");
		String expected = "Test";
		String actual = tester.getLastName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testDisplayName()
	{
		Employee tester = new Employee("first", "last");
		String expected = "last, first";
		String actual = tester.getDisplayName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testSetSalary()
	{
		Employee tester = new Employee();
		tester.setSalary(3000.0);
		Double expected = 3000.0;
		Double actual = tester.getSalary();
		assertEquals(expected, actual, 1);		
	}
	
	@Test
	public void testGetSalary()
	{
		Employee tester = new Employee();
		tester.setSalary(3000.0);
		Double expected = 3000.0;
		Double actual = tester.getSalary();
		assertEquals(expected, actual, 1);		
	}
	
	@Test
	public void testGetFormattedSalary()
	{
		Employee tester = new Employee();
		tester.setSalary(3000);
		String expected = "3,000.00";
		String actual = tester.getFormattedSalary();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetLastName()
	{
		Employee tester = new Employee();
		tester.setLastName("Test");
		String expected = "Test";
		String actual = tester.getLastName();
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testGetFirstName()
	{
		Employee tester = new Employee();
		tester.setFirstName("Test");
		String expected = "Test";
		String actual = tester.getFirstName();
		assertEquals(expected, actual);		
	}
}
