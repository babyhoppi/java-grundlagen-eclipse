/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Image;
/*    */ import java.awt.MediaTracker;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class ImageHandler
/*    */ {
/*    */   public static Image ladeBild(Image image, Component comp)
/*    */   {
/* 13 */     MediaTracker track = new MediaTracker(comp);
/*    */     try {
/* 15 */       track.addImage(image, 0);
/* 16 */       track.waitForAll();
/* 17 */       return image;
/*    */     } catch (InterruptedException exc) {
/* 19 */       System.out.println("Laden fehlgeschlagen: " + exc.getMessage());
/* 20 */       return null;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.ImageHandler
 * JD-Core Version:    0.6.2
 */