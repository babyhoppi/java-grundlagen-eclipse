public class test {
 
    public static final int[] tageImMonat = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] tagNamen = {
        "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
 
    public static void main(String[] args) {
        System.out.println(wochenTag(23, 5, 1984));
    }
 
    public static String wochenTag(int tag, int monat, int jahr) {
 
        int wochentag = (jahr - 1900) * 365 + (jahr - 1900) / 4;
 
        if (jahr % 4 == 0 && monat <= 2) {
            wochentag--;
        }
 
        for(int i = 0; i < monat - 1; i++) {
            wochentag += tageImMonat[i];
        }
 
        wochentag = (tag + wochentag) % 7;
 
        return tagNamen[wochentag];
    }
}
