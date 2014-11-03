public class Faku 
{
	
public static void main (String[] args) {
		
	int x = 1313;
	int y = 152;
	
	int aufrufe = 0;
	
	f(x,y, aufrufe);
}

public static int f(int x, int y, int a){
	System.out.println(a);	
  	if (y == 0){
  		System.out.println (x);
    	return x;    
	} else {
  		return f(x-1,y-1,++a);
	}
  }
}
