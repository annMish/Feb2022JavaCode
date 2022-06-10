package javasessions;

public class IncrementalandDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Post increment:
		
		int a= 1;
		int b= a++;
		System.out.println(a);//2
		System.out.println(b);// 1
		
		int c =-98;
		int d =c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		int p=101;
		int q= p++;
		System.out.println(p);//102
		System.out.println(q);//101
		
		//pre increment: (both the values will be increased by 1)
		
		int h=1;
		int g=++h;
		System.out.println(h);//2
		System.out.println(g);//2
		
		int f=-1099;
		int s= ++f;
		System.out.println(f);//-1098
		System.out.println(s);//-1098
		
		//Post decreament
		
		int t= 2;
		int r= t--;
		System.out.println(t);//1
		System.out.println(r);//2
		
		
		int x= -99;
		int y= x--;
		System.out.println(x);//-100
		System.out.println(y);//-99
		
		
		//Pre decrement
		
		int v= 2;
		int n= --v;
		System.out.println(n);//1
		System.out.println(v);//1
		
		
		int m= 2;
		System.out.println(m++);//2
		System.out.println(m);//3
		
		int nm= -99;
		System.out.println(--nm);//-100
		System.out.println(nm);//-100
		
		int sum= 1;
		System.out.println(sum+++10);//11
		System.out.println(sum+10);// 12
		
		int total=1;
		//System.out.println(++total+10);//12
		System.out.println(++total+10+total++);//
		System.out.println(total);//3
		
		
		System.out.println(1>5);//
		System.out.println(5>1);//
				
				
		
		
		
	}

}
