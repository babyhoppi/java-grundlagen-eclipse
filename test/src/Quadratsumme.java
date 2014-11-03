public class Quadratsumme
{
	public static void main (String args[])
	{	

	int endwert = 10;
	int ergebnis = 0;
	
	for(int i=0; i<=endwert; i++)
	{
		ergebnis += (i*i);
	}
	System.out.print("Die Summe der Quadrate der Zahlen 0 bis " + endwert + " ist: " + ergebnis);
}
}

