/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Color;
/*    */ 
/*    */ public class FarbMosaik extends AbstractFarbMosaik
/*    */ {
/*    */   public FarbMosaik(int raster, int breite, Color farbeRueckseite, Color farbeVorderseite, MosaikEventHandler mosaikEventHandler)
/*    */   {
/* 16 */     super(raster, breite, farbeRueckseite, farbeVorderseite, mosaikEventHandler);
/*    */   }
/*    */ 
/*    */   MosaikModelIF createMosaikModel(int raster)
/*    */   {
/* 21 */     return new MosaikModel(raster, raster);
/*    */   }
/*    */ 
/*    */   void kachelAnmelden(MosaikCanvas mc, MosaikEventHandler mosaikEventHandler)
/*    */   {
/* 28 */     mc.addMouseListener(mosaikEventHandler);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.FarbMosaik
 * JD-Core Version:    0.6.2
 */