public class privat{

		 public static void main(String[] args){ 
 
   private static String[] sortiere(String[] sarr) {
        for (int i = 0; i < sarr.length - 1; i++) {
            for (int j = 0; j < sarr.length - 1; j++) {
                if (größerAls(sarr[j], sarr[j + 1])) {
                    tausche(sarr, j, j + 1);
                }
            }
        }
    }
 
    private static boolean größerAls(String s1, String s2) {
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) > s2.charAt(i);
            }
        }
        return s1.length() > s2.length();
    }
 
    private static String[] tausche(String[] sarr, int i, int j) {
        String tmp = sarr[i];
        sarr[i] = sarr[j];
        sarr[j] = tmp;
    }
 
    private static void kombiniere(String[] vornamen, String[] nachnamen) {
        if (vornamen.length != nachnamen.length) {
            int i = 0 / 0;
        }
        for (int i = 0; i < vornamen.length * vornamen.length; i++) {
            System.out.println(vornamen[i / vornamen.length] + " " + nachnamen[i % vornamen.length]);
        }
    }
 
    public static void main(String[] args) {
        String[] vornamen = {"Jo", "Al", "Ma"};
        String[] nachnamen = {"Ans", "Blu", "Bla"};
 
        sortiere(vornamen);
        sortiere(nachnamen);
 
        System.out.println("vornamen = " + Arrays.toString(vornamen));
        System.out.println("nachnamen = " + Arrays.toString(nachnamen));
 
        kombiniere(vornamen, nachnamen);
    }

