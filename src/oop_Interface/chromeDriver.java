package oop_Interface;



public class chromeDriver implements webdriverInterface{
	
	public chromeDriver(String browser) {
		this.browser = browser;
	}
	
	public chromeDriver() {
		
	}

	chromeDriver driver= new chromeDriver();
	driver.indelement()
	String browser;
	String url;
	
	
	    
      
	
	 public void launchBrowser(String browser) {
     System.out.println("Launching Browser"+" "+ browser);
      }
	
	public void gettitle(String title) {
		System.out.println("Title is"+" " +title);
		}

	public void geturl(String url) {
		System.out.println("link name  is " + " "+ url );
	}
	
	
	
	public void getname(String name) {
		System.out.println("name is "+" " + name );
	}
	public void getlastname(String Lastname) {
		System.out.println("Lastname is "+" " +Lastname );
	}

	@Override
	public void launchDriver() {
		
		
	}

	@Override
	public void quitDriver() {
		
		
	}
}
