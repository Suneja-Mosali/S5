package demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AgeTest
{
	private int input;
	private String output;
	Age age;
	public AgeTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
	@Before
	public void init()
	{
		age=new Age();
	}
	@Parameterized.Parameters
	public static Collection aget()
	{
		return Arrays.asList(new Object[][] {
			{14,"not eligible"},
			{23,"eligible"}
		});
	}
	@Test
	public void addTest()
	{
		assertEquals(output,age.election(input));
	}
}
