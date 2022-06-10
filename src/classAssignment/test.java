package classAssignment;

public class test {

	public static void main(String[] args) {
		
		
		String[] plugin= new String[3];
		plugin[0]=" chropath";
		plugin[1]="firepath";
		plugin[2]="csspath";			
		System.out.println(plugin[1]);
				
								
				
		Browser br= new Browser("chrome",3.11,plugin);
		br.getName();
		System.out.println(" the browser name is "+" " + br.getName() );
		System.out.println(br.getName()+" "+ br.getVersion()+" "+ br.getPlugin()[0]);
		
		
		br.setName("firefox");
		br.setVersion(12.66);
	
		plugin[0]=" firepath";
		plugin[1]="firepath1";
		plugin[2]="firepath2";		
		br.setPlugin(plugin);
		System.out.println(br.getPlugin()[1]);
		
		br.setPlugin(plugin);
		
		System.out.println(br.getName()+" "+br.getVersion());
		System.out.println(br.getPlugin());
		for (String element : br.getPlugin()) {
			System.out.println(element);
		}
		
		
		
	}

}
 