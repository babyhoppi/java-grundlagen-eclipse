public class GroessteZahl{
 
  public static void main(String[] args) {
    int a = 6;
    int b = 3;
    int c = 2;
    String ausgabeSumme = "Die Summe der Zahlen ist: ";
    String ausgabeGrossteZahl = "Die groesste Zahl ist: ";
    String ausgabeMittelwert = "Die Mittelwert der Zahlen ist: ";
    double mittelwert = 0;
    int summe = 0;
    
    summe = (a + b + c);
    mittelwert = (a + b + c)/3.0;
    
    System.out.println("Zahl a ist: " + a);
    System.out.println("Zahl b ist: " + b);
    System.out.println("Zahl c ist: " + c); 
    System.out.println(ausgabeSumme + summe);
    System.out.println(ausgabeMittelwert + mittelwert);
    
    if ( a > b) { 
      if ( a > c) { System.out.println(ausgabeGrossteZahl + a);}
      else { System.out.println(ausgabeGrossteZahl + c);}
    }    
    else {                            
      if( b > c) { System.out.println(ausgabeGrossteZahl + b);}      
      else { System.out.println(ausgabeGrossteZahl + c);}     
    }
   }

	

}
