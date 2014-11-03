/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class MosaikKonfigModel
/*    */   implements MosaikKonfigIF
/*    */ {
/*    */   private int raster;
/*    */   private boolean mitBild;
/*    */   private boolean zeigeProtokoll;
/*    */   private String bildName;
/*    */   private Color farbeRueckseite;
/*    */   private Color farbeVorderseite;
/*    */ 
/*    */   public MosaikKonfigModel(int raster, boolean mitBild, boolean zeigeProtokoll, String bildName, Color farbeRueckseite, Color farbeVorderseite)
/*    */   {
/* 26 */     this.raster = raster;
/* 27 */     this.mitBild = mitBild;
/* 28 */     this.zeigeProtokoll = zeigeProtokoll;
/* 29 */     this.bildName = bildName;
/* 30 */     this.farbeRueckseite = farbeRueckseite;
/* 31 */     this.farbeVorderseite = farbeVorderseite;
/*    */   }
/*    */ 
/*    */   public int getRaster() {
/* 35 */     return this.raster;
/*    */   }
/*    */   public void setRaster(int raster) {
/* 38 */     this.raster = raster;
/*    */   }
/*    */ 
/*    */   public void setRaster(String sRaster) {
/*    */     try {
/* 43 */       int raster = Integer.parseInt(sRaster.trim());
/* 44 */       if (raster > 0)
/* 45 */         this.raster = raster;
/*    */     }
/*    */     catch (NumberFormatException nfe) {
/* 48 */       System.out.println("Raster kein Integer:" + sRaster);
/*    */     }
/*    */   }
/*    */ 
/* 52 */   public boolean isMitBild() { return this.mitBild; }
/*    */ 
/*    */   public void setMitBild(boolean mitBild) {
/* 55 */     this.mitBild = mitBild;
/*    */   }
/*    */   public boolean isZeigeProtokoll() {
/* 58 */     return this.zeigeProtokoll;
/*    */   }
/*    */   public void setZeigeProtokoll(boolean zeigeProtokoll) {
/* 61 */     this.zeigeProtokoll = zeigeProtokoll;
/*    */   }
/*    */   public String getBildName() {
/* 64 */     return this.bildName;
/*    */   }
/*    */   public void setBildName(String bildName) {
/* 67 */     this.bildName = bildName;
/*    */   }
/*    */ 
/*    */   public Color getFarbeRueckseite() {
/* 71 */     return this.farbeRueckseite;
/*    */   }
/*    */ 
/*    */   public void setFarbeRueckseite(Color farbe) {
/* 75 */     this.farbeRueckseite = farbe;
/*    */   }
/*    */ 
/*    */   public Color getFarbeVorderseite() {
/* 79 */     return this.farbeVorderseite;
/*    */   }
/*    */ 
/*    */   public void setFarbeVorderseite(Color farbeVorderseite) {
/* 83 */     this.farbeVorderseite = farbeVorderseite;
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikKonfigModel
 * JD-Core Version:    0.6.2
 */