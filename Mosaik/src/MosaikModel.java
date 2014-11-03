/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ public class MosaikModel extends MosaikModelBasis
/*    */   implements MosaikModelIF
/*    */ {
/*    */   public MosaikModel(int zeilen, int spalten)
/*    */   {
/* 11 */     super(zeilen, spalten);
/*    */   }
/*    */ 
/*    */   public void action(int zeile, int spalte)
/*    */   {
/* 21 */     for (int i = zeile - 1; i <= zeile + 1; i++)
/* 22 */       for (int j = spalte - 1; j <= spalte + 1; j++)
/* 23 */         if ((i >= 0) && (j >= 0) && (i < getZeilen()) && (j < getSpalten()) && ((i != zeile) || (j != spalte)))
/* 24 */           invert(i, j);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikModel
 * JD-Core Version:    0.6.2
 */