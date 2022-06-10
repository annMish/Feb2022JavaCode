package oop_Interface;

public class TestDriver {

	public static void main(String[] args) {
		
		chromeDriver driver= new chromeDriver();
		driver.getname("Anu");
		driver.getlastname("Mish");
		driver.geturl("www.amazon.com");	
		driver.gettitle("Amazon");
		
		
		webdriverInterface driver1=new chromeDriver();
		driver1.launchDriver("chrome");
		

	}

}
