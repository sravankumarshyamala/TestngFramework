package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.StockLogin;
import library.Supplier;

public class StockAcc extends StockLogin

{
	@Parameters({"suppliername","add","city","country","contactperson","phone","email","mobile","Note"})
	@Test
	public void stocksupplier(String suppliername,String add,String city,String country,String contactperson,String phone,String email,String mobile,String Note) throws InterruptedException
	{
		Supplier s= new Supplier();
		s.stocksupp(suppliername, add, city, country, contactperson, phone, email, mobile, Note);
	}
	

}
