/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ 
/*    */ public class VorschauBild extends Canvas
/*    */   implements MosaikKonfigActionIF
/*    */ {
/*    */   private Image bild;
/*    */ 
/*    */   VorschauBild(Image bild)
/*    */   {
/* 14 */     this.bild = bild;
/*    */   }
/*    */ 
/*    */   public void konfigAction(String actionCode, MosaikKonfigIF konfig)
/*    */   {
/* 21 */     if (actionCode == "starteSpiel") {
/* 22 */       setVisible(false);
/*    */     }
/* 24 */     if (actionCode == "resetSpiel")
/* 25 */       setVisible(true);
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 31 */     g.drawImage(this.bild, 0, 0, this);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.VorschauBild
 * JD-Core Version:    0.6.2
 */