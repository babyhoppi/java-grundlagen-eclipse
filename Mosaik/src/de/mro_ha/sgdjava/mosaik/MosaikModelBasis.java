/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ public class MosaikModelBasis
/*    */ {
/*    */   private KachelIF[][] mObjects;
/*    */   private int zeilen;
/*    */   private int spalten;
/*    */ 
/*    */   public MosaikModelBasis(int zeilen, int spalten)
/*    */   {
/* 13 */     this.zeilen = zeilen;
/* 14 */     this.spalten = spalten;
/* 15 */     this.mObjects = new KachelIF[zeilen][spalten];
/*    */   }
/*    */ 
/*    */   protected void invert(int zeile, int spalte)
/*    */   {
/* 24 */     this.mObjects[zeile][spalte].switchSeite();
/*    */   }
/*    */ 
/*    */   public int getZeilen() {
/* 28 */     return this.zeilen;
/*    */   }
/*    */ 
/*    */   public int getSpalten() {
/* 32 */     return this.spalten;
/*    */   }
/*    */ 
/*    */   public KachelIF[][] getmObjects() {
/* 36 */     return this.mObjects;
/*    */   }
/*    */ 
/*    */   public void putObj(int zeile, int spalte, KachelIF mObj)
/*    */   {
/* 43 */     this.mObjects[zeile][spalte] = mObj;
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikModelBasis
 * JD-Core Version:    0.6.2
 */