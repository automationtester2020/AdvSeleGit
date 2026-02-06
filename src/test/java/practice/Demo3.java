package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void add()
	{
		Reporter.log("add",true);
	}

@Test
	public void div()
	{
		Reporter.log("div",true);
	}

@Test
	public void sub()
	{
		Reporter.log("sub",true);
	}
}
