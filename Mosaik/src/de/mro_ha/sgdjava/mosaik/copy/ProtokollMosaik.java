/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Color;
/*    */ 
/*    */ public class ProtokollMosaik extends AbstractFarbMosaik
/*    */ {
/*    */   public ProtokollMosaik(int raster, int breite, Color farbeRueckseite, Color farbeVorderseite, MosaikEventHandler mosaikEventHandler)
/*    */   {
/* 17 */     super(raster, breite, farbeRueckseite, farbeVorderseite, mosaikEventHandler);
/*    */   }
/*    */ 
/*    */   MosaikModelIF createMosaikModel(int raster)
/*    */   {
/* 23 */     return new ProtokollModel(raster, raster);
/*    */   }
/*    */ 
/*    */   void kachelAnmelden(MosaikCanvas mc, MosaikEventHandler mosaikEventHandler)
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.ProtokollMosaik
 * JD-Core Version:    0.6.2
 */