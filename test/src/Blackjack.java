import Prog1Tools.IOTools;

/** Ein einfaches Blackjack-Spiel */
public class Blackjack {

  /** Diese Klasse repraesentiert den Kartenschlitten */
  public static class Schlitten {
    public int[] karten; // Karten im Schlitten
    public int pos; // Position im Schlitten
  }

  /** Berechnet aus der Kartennummer den Namen der Karte */
  public static String name(int n) {
    String[] farben={"Kreuz","Pik","Herz","Karo"};
    String[] werte={
      "Zwei","Drei","Vier","Fuenf","Sechs","Sieben",
      "Acht","Neun","Zehn","Bube","Dame","Koenig",
      "As"
    };
    return farben[n/13]+" "+werte[n%13];
  }

  /** Liefert aus der Kartennummer den Wert */
  public static int wert(int n) {
    int w=n%13;
    if (w<=8) // zwischen zwei und zehn
      return w+2;
    else
      if (w==12) // As
        return 11;
      else // sonstige Bildkarte
        return 10;
  }

  /** Mische ein Feld von ganzen Zahlen */
  public static void mischen(int[] feld) {
    for (int i=0;i<feld.length;i++) {
      int j=(int)(feld.length*Math.random());
      int dummy=feld[i];
      feld[i]=feld[j];
      feld[j]=dummy;
    }
  }
  
  /** Erzeugt einen Schlitten aus n Kartenspielen */
  public static int[] schlitten(int n) {
    // Initialisiere das Feld
    int[] schlitten=new int[n*52];
    for (int i=0;i<schlitten.length;i+=52)
      for (int j=0;j<52;j++)
        schlitten[i+j]=j;
    // Mische das Feld
    mischen(schlitten);
    // Gib das gemischte Feld zurueck
    return schlitten;
  }

  /** Ziehe eine Karte aus dem Schlitten */
  public static int karte(Schlitten schlitten) {
    if (schlitten.pos==schlitten.karten.length) { // Schlitten leer
      System.out.println("\nSchlitten wird neu gefuellt...\n");
      mischen(schlitten.karten);
      schlitten.pos=0;
    } // Andernfalls gib die aktuelle Karte zurueck
    return schlitten.karten[schlitten.pos++];
  }

  /** Gib eine Karte an die Person p aus */
  public static int ausgabe(String p,Schlitten s) {
    int karte=karte(s);
    System.out.println(p+" erhaelt "+name(karte)+
                       " (Wert="+wert(karte)+")");
    return wert(karte);
  }

  /** Hauptprogramm */
  public static void main(String[] args) {
    // Zuerst initialisiere den Schlitten
    int packs=
      IOTools.readInteger("Wie viele Paeckchen Karten "+
                          "sollen im Schlitten sein? ");
    Schlitten schlitten=new Schlitten();// Erzeuge die Instanz
    schlitten.karten=schlitten(packs);   // Erzeuge die Karten
    schlitten.pos=0;                   // Aktuelle Position =0
    // Weitere benoetigte Variablen
    boolean nochEinSpiel=true;
    // Jetzt beginnt das eigentliche Spiel
    while (nochEinSpiel) {
      // benoetigte Variablen
      int sblatt=0; // Wert des Blattes des Spielers
      int cblatt=0; // Wert des Blattes des Croupiers
      // Gib Karte an Spieler aus
      sblatt=ausgabe("Spieler",schlitten);
      // Gib Karte an Croupier aus
      cblatt=ausgabe("Croupier",schlitten);
      // Gib Karte an Spieler aus
      sblatt+=ausgabe("Spieler",schlitten);
      // Teste, ob der Spieler Blackjack hat
      if (sblatt==21) {
        System.out.println("\nBLACKJACK!\n");
        cblatt+=ausgabe("Croupier",schlitten);
        if (cblatt<21 || cblatt>22)
          System.out.println("Spieler gewinnt!\n");
        else
          System.out.println("EGALITE");
      }
      else { // keinen Black Jack
        // der Spieler darf neue Karten ordern
        while(true) {
          System.out.println(); // Leerzeile
          // Schaue, ob der Spieler bereits fertig ist
          if (sblatt==21) {
            System.out.println("Spieler hat 21 Punkte.");
            break;
          }
          if (sblatt>21) {
            System.out.println("Spieler liegt ueber 21 Punkte.");
            break;
          }
          // Lies den Benutzerwunsch ein
          IOTools.flush();
          char antwort=' ';
          while (antwort!='J' && antwort!='N')
            antwort=
              IOTools.readChar("Noch eine Karte (J/N) ?");
          // Ist der Benutzer zufrieden ?
          if (antwort=='N') {
            System.out.println("Spieler sagt: danke");
            break;
          }
          // Andernfalls erhaelt er noch eine Karte
          System.out.println("Spieler sagt: bleiben");
          sblatt+=ausgabe("Spieler",schlitten);
        }
        // der Croupier muss nachziehen
        if (sblatt<=21) { // Spieler hat nicht ueberboten
          System.out.println("\nCroupier ist am Zug:");
          while (cblatt<=16)
            cblatt+=ausgabe("Croupier",schlitten);
        }
        // Jetzt wird Bilanz gezogen
        System.out.println();
        System.out.println("Spieler hat "+sblatt+" Punkte.");
        System.out.println("Croupier hat "+cblatt+" Punkte.");
        if (sblatt>21 || (cblatt<=21 && cblatt>sblatt))
          System.out.println("Spieler verliert.");
        else if (cblatt>21 || cblatt<sblatt)
          System.out.println("Spieler gewinnt.");
        else
          System.out.println("EGALITE");
        System.out.println();
      }
      // Will der Benutzer noch ein Spiel?
      char antwort=' ';
      while (antwort!='J' && antwort!='N')
        antwort=
          IOTools.readChar("Noch ein Spiel (J/N) ?");
      nochEinSpiel=(antwort=='J');
      System.out.println();
    }
  }
}
