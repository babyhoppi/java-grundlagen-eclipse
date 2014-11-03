/*    */ package de.mro_ha.sgdjava.mosaik;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ 
/*    */ public class BildCanvas extends Canvas
/*    */   implements KachelIF
/*    */ {
/*    */   private boolean bVorderseite;
/*    */   private int zeile;
/*    */   private int spalte;
/*    */   private Color farbeRueckseite;
/*    */   private Image bild;
/*    */   private Graphics bufGraphics;
/*    */   private Image bufImage;
/*    */ 
/*    */   public void update(Graphics g)
/*    */   {
/* 22 */     paint(g);
/*    */   }
/*    */ 
/*    */   public boolean isVorderseite() {
/* 26 */     return this.bVorderseite;
/*    */   }
/*    */ 
/*    */   public int getZeile() {
/* 30 */     return this.zeile;
/*    */   }
/*    */ 
/*    */   public int getSpalte() {
/* 34 */     return this.spalte;
/*    */   }
/*    */ 
/*    */   public void switchSeite()
/*    */   {
/* 41 */     this.bVorderseite = (!this.bVorderseite);
/* 42 */     repaint();
/*    */   }
/*    */ 
/*    */   public BildCanvas(Color farbeRueckseite, Image img, int zeile, int spalte)
/*    */   {
/* 55 */     this.farbeRueckseite = farbeRueckseite;
/* 56 */     this.bild = img;
/* 57 */     this.zeile = zeile;
/* 58 */     this.spalte = spalte;
/*    */   }
/*    */ 
/*    */   private void createBufferImage() {
/* 62 */     int breite = getWidth();
/* 63 */     this.bufImage = createImage(breite, breite);
/* 64 */     this.bufGraphics = this.bufImage.getGraphics();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 72 */     if (this.bufGraphics == null) {
/* 73 */       createBufferImage();
/*    */     }
/* 75 */     if (this.bVorderseite) {
/* 76 */       this.bufGraphics.drawImage(this.bild, 0, 0, getWidth(), getHeight(), this);
/*    */     } else {
/* 78 */       this.bufGraphics.setColor(this.farbeRueckseite);
/* 79 */       this.bufGraphics.fillRect(0, 0, getWidth(), getHeight());
/*    */     }
/* 81 */     g.drawImage(this.bufImage, 0, 0, this);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.BildCanvas
 * JD-Core Version:    0.6.2
 */