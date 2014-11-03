/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ public class ProtokollModel extends MosaikModelBasis
/*    */   implements MosaikModelIF
/*    */ {
/*    */   public ProtokollModel(int zeilen, int spalten)
/*    */   {
/* 17 */     super(zeilen, spalten);
/*    */   }
/*    */ 
/*    */   public void action(int zeile, int spalte)
/*    */   {
/* 24 */     invert(zeile, spalte);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.ProtokollModel
 * JD-Core Version:    0.6.2
 */