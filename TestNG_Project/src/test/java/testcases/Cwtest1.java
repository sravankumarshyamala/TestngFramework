package testcases;

import org.testng.annotations.Test;

import library.CwLogin;
import library.Cws;

public class Cwtest1 extends CwLogin

{
	@Test
	public void so() throws InterruptedException
	{
		Cws d=new Cws();
		d.sales();
	}

}
