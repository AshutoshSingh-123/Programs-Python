class example{
public static boolean isInt(double val)
	{
		return ((int)val==val);
	}
public static void main (String[]args){
long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		int tot = 0;
int lim = 100000;
		for(long a = 2; a <= lim; a+=3)
		{
			for(long b = 1; a+b <= lim; b++)
			{
				if(b!=a)
				{
					double c = ((a+1)*(a+1)*(8*a-1))/(27.0*b*b);
					if(isInt(c)&&a+b+c<=lim)
					{
						tot++;
						//end = System.currentTimeMillis();
						//System.out.println("a = " + a + " ; b = " + b + " ; c = " + c + " ; a + b + c = " + (a+b+c) + " ; tot = " + tot + " ; Time = " + ((double)(end-start)/1000.0) + " sec.");
					}
				}
			}
			if(a%1000==0)
			{
				end = System.currentTimeMillis();
				System.out.println("a = " + a + " ; tot = " + tot + " ; Time = " + ((double)(end-start)/1000.0) + " sec.");
			}
		}
 
		System.out.println(tot);
 
		end = System.currentTimeMillis();
 
		System.out.println("Elapsed time: " + (double)(end-start)/1000.0 + " sec.");
}
}