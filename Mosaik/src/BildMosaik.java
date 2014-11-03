/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.GridLayout;
/*    */ import java.awt.Image;
/*    */ import java.awt.Panel;
/*    */ import java.awt.image.CropImageFilter;
/*    */ import java.awt.image.FilteredImageSource;
/*    */ import java.awt.image.ImageFilter;
/*    */ 
/*    */ public class BildMosaik extends Panel
/*    */ {
/*    */   private MosaikModelIF mosaikModel;
/*    */ 
/*    */   public BildMosaik(int raster, int breite, Color farbeRueckseite, Image img, MosaikEventHandler mosaikEventHandler)
/*    */   {
/* 23 */     this.mosaikModel = new MosaikModel(raster, raster);
/* 24 */     mosaikEventHandler.addModel(this.mosaikModel);
/*    */ 
/* 26 */     int canvasBreite = breite / raster;
/* 27 */     Image bild = ImageHandler.ladeBild(img, this);
/* 28 */     setLayout(new GridLayout(raster, raster, 1, 1));
/* 29 */     int teilbildBreite = bild.getWidth(this) / raster;
/*    */ 
/* 32 */     for (int i = 0; i < raster; i++)
/* 33 */       for (int j = 0; j < raster; j++)
/*    */       {
/* 35 */         ImageFilter schneideFilter = new CropImageFilter(j * teilbildBreite, i * teilbildBreite, teilbildBreite, teilbildBreite);
/* 36 */         Image teilBild = createImage(new FilteredImageSource(img.getSource(), schneideFilter));
/*    */ 
/* 38 */         BildCanvas mc = new BildCanvas(farbeRueckseite, teilBild, i, j);
/* 39 */         mc.addMouseListener(mosaikEventHandler);
/* 40 */         this.mosaikModel.putObj(i, j, mc);
/* 41 */         mc.setSize(canvasBreite, canvasBreite);
/* 42 */         add(mc);
/*    */       }
/*    */   }
/*    */ 
/*    */   public MosaikModelIF getMosaikModel()
/*    */   {
/* 53 */     return this.mosaikModel;
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.BildMosaik
 * JD-Core Version:    0.6.2
 */