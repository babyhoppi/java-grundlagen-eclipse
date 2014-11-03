/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.GridLayout;
/*    */ import java.awt.Panel;
/*    */ 
/*    */ abstract class AbstractFarbMosaik extends Panel
/*    */ {
/*    */   protected MosaikModelIF mosaikModel;
/*    */ 
/*    */   public AbstractFarbMosaik(int raster, int breite, Color farbeRueckseite, Color farbeVorderseite, MosaikEventHandler mosaikEventHandler)
/*    */   {
/* 31 */     this.mosaikModel = createMosaikModel(raster);
/* 32 */     mosaikEventHandler.addModel(this.mosaikModel);
/* 33 */     setLayout(new GridLayout(raster, raster, 1, 1));
/* 34 */     int canvasBreite = breite / raster;
/*    */ 
/* 36 */     for (int i = 0; i < raster; i++)
/* 37 */       for (int j = 0; j < raster; j++) {
/* 38 */         MosaikCanvas mc = new MosaikCanvas(farbeRueckseite, farbeVorderseite, i, j);
/* 39 */         mc.addMouseListener(mosaikEventHandler);
/* 40 */         kachelAnmelden(mc, mosaikEventHandler);
/* 41 */         this.mosaikModel.putObj(i, j, mc);
/* 42 */         mc.setSize(canvasBreite, canvasBreite);
/* 43 */         add(mc);
/*    */       }
/*    */   }
/*    */ 
/*    */   abstract MosaikModelIF createMosaikModel(int paramInt);
/*    */ 
/*    */   abstract void kachelAnmelden(MosaikCanvas paramMosaikCanvas, MosaikEventHandler paramMosaikEventHandler);
/*    */ 
/*    */   public MosaikModelIF getMosaikModel()
/*    */   {
/* 58 */     return this.mosaikModel;
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.AbstractFarbMosaik
 * JD-Core Version:    0.6.2
 */