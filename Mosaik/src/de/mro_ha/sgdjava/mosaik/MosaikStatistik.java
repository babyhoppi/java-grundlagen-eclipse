/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ import java.awt.Point;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class MosaikStatistik
/*    */   implements StatistikModelIF, MosaikKonfigActionIF
/*    */ {
/* 16 */   private LinkedList listeVersuche = new LinkedList();
/*    */ 
/*    */   public void action(int zeile, int spalte)
/*    */   {
/* 22 */     this.listeVersuche.add(new Point(zeile, spalte));
/*    */   }
/*    */ 
/*    */   public void konfigAction(String actionCode, MosaikKonfigIF konfig)
/*    */   {
/* 29 */     if (actionCode == "starteSpiel")
/* 30 */       reset();
/*    */   }
/*    */ 
/*    */   public KachelIF getObj(int zeile, int spalte)
/*    */   {
/* 35 */     return null;
/*    */   }
/*    */ 
/*    */   public void putObj(int zeile, int spalte, KachelIF mObj)
/*    */   {
/*    */   }
/*    */ 
/*    */   public int getAnzahlVersuche()
/*    */   {
/* 45 */     return this.listeVersuche.size();
/*    */   }
/*    */ 
/*    */   public String getStatistikInfo()
/*    */   {
/* 52 */     Object[] versuche = this.listeVersuche.toArray();
/* 53 */     String s = "Züge gesamt: " + getAnzahlVersuche();
/* 54 */     for (int i = 0; i < versuche.length; i++) {
/* 55 */       s = s + "\nZeile\\Spalte: " + (
/* 56 */         1 + (int)((Point)versuche[i]).getX()) + "\\" + (
/* 57 */         1 + (int)((Point)versuche[i]).getY());
/*    */     }
/* 59 */     return s;
/*    */   }
/*    */ 
/*    */   private int reset()
/*    */   {
/* 64 */     int i = getAnzahlVersuche();
/* 65 */     this.listeVersuche.clear();
/* 66 */     return i;
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikStatistik
 * JD-Core Version:    0.6.2
 */