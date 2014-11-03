public class selection{

  static int[] zahlen={3,9,5,2,3};  

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