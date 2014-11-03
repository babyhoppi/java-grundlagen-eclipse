public class Quersumme {
public static void main(String args[]) {
long zahl;
long quersumme;
zahl= 2432902008176640000L;
quersumme = 0;
while ( zahl > 0 ) {
quersumme = quersumme + (zahl % 10);
zahl = zahl / 10;
System.out.println(zahl);
}
System.out.println(quersumme);
}
}