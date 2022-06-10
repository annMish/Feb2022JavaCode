package stringManipulation;

public class StringManipulate {
	
	public static void main(String[] args) {
		
		
		String s = ("hello hi this is my java code");


        System.out.println(s);
        System.out.println(s.length());
        System.out.println("highest index"+ " "+(s.length()-1) );
        System.out.println("lowest index"+ " "+ 0);
        
        
        System.out.println(s.charAt(1));//e
        System.out.println(s.charAt(28));//e
        //System.out.println(s.charAt(29));//IOB
        //System.out.println(s.charAt(-1));
        System.out.println(s.charAt((s.length()-2)));//d
        
        System.out.println(s.indexOf('h'));//0
        System.out.println(s.indexOf('i'));//7-1st occurance of i
        System.out.println(s.indexOf('y'));//18
        System.out.println(s.indexOf('i',s.indexOf('i')+1));//2nd occurance of i
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}
	
	
	

}
