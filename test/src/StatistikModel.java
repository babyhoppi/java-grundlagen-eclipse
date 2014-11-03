import java.awt.Point;
import java.util.*;
 
public class StatistikModel implements ModelIF
{
    private Point point;
 
    private String returnString;
    private List list = new Vector();
    private List list1 = new Vector();
    public StatistikModel()
    {
 
    }
    public void action(int zeile, int spalte)
    {
        list.add(new Point(zeile, spalte));
        returnString ="Zeile: " +zeile+ "/ Spalte: " +spalte+ "\n";
        list1.add(returnString);
    }
 
    public String getStatistikInfo()
    {
            String versuchString;
            versuchString = "Anzahl Versuche: "+ "\n" +list1;
 
            return versuchString;
    }
 
    public void putObj(int zeile, int spalte, MosaikIF mObj)
    {
        // in diesem Model kein Implementierungsbedarf
    }