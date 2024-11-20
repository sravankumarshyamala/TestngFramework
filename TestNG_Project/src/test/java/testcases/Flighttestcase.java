package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.flightlogin;
import library.flightreg;

public class Flighttestcase extends flightlogin
{
	
	@Parameters({"name"})
	@Test
    public void flightregistration(String name)
    {
    	flightreg r= new flightreg();
    	r.freg(name);
    }

}
