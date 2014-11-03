public class Namensortierung{
	
	String str1 = new String("Hallo");
	String str2 = new String("Hallo");
		if (str1 == str2) {
  System.out.println("str1 entspricht str2");
	}
	else {
  		System.out.println("str1 ist anders als str2");
	}



  static S[] zahlen={3,9,5,2,3};  

		 public static void main(String[] vArgs){
			selection s = new selection(); 
			System.out.println(s.toString());       
			zahlen=s.sort(zahlen);                
			System.out.println(s.toString()); 
		}


		public int[] sort(int[] z){
		   for(int i=0;i<z.length-1;i++){
		      int min=i;
		      for (int j=i+1;j<z.length;j++){
		       			if(z[j]<z[min]){
		       				min=j;
						}
					}
		
				int temp=z[min];
				z[min]=z[i];
				z[i]=temp;
			}
			return z;
		}
  
		public String toString(){
		String s="";
		for(int i=0;i<zahlen.length;i++){
		s=s+zahlen[i]+",";  
		}
		s=s+"\n";          
		return s;          
		}
}