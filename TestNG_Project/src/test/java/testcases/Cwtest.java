package testcases;

import org.testng.annotations.Test;

import library.CwLogin;
import library.Cwp;

public class Cwtest extends CwLogin

{
	@Test
	public void cw() throws InterruptedException
	{
		Cwp cd=new Cwp();
		cd.purchase();
	}

}
