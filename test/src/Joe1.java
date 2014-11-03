public class Joe1
{
   public static void main(String[] args)
   {
	int Jahr=2060;
	if (Jahr/4==0)	
					{
						System.out.println(Jahr + " ist Schaltjahr");
	 		 	  	}
	    	 	else if (Jahr/100==0)
	  				{
	  					System.out.println(Jahr + " ist kein Schaltjahr");
	  				}
	   			else if (Jahr/400==0)
	  				{
						System.out.println(Jahr + " ist Schaltjahr");
	  				}
	  			}
	  		}