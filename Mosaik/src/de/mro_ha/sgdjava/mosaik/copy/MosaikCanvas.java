/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Canvas;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ 
/*    */ public class MosaikCanvas extends Canvas
/*    */   implements KachelIF
/*    */ {
/*    */   private Color farbeRueckseite;
/*    */   private Color farbeVorderseite;
/*    */   private Graphics bufGraphics;
/*    */   private Image bufImage;
/* 35 */   private boolean bVorderseite = false;
/*    */   int zeile;
/*    */   int spalte;
/*    */ 
/*    */   public boolean isVorderseite()
/*    */   {
/* 22 */     return this.bVorderseite;
/*    */   }
/*    */ 
/*    */   public int getZeile() {
/* 26 */     return this.zeile;
/*    */   }
/*    */ 
/*    */   public int getSpalte() {
/* 30 */     return this.spalte;
/*    */   }
/*    */ 
/*    */   public MosaikCanvas(Color farbeRueckseite, Color farbeVorderseite, int zeile, int spalte)
/*    */   {
/* 50 */     this.farbeRueckseite = farbeRueckseite;
/* 51 */     this.farbeVorderseite = farbeVorderseite;
/* 52 */     this.zeile = zeile;
/* 53 */     this.spalte = spalte;
/*    */   }
/*    */ 
/*    */   public void init()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void switchSeite()
/*    */   {
/* 65 */     this.bVorderseite = (!this.bVorderseite);
/* 66 */     repaint();
/*    */   }
/*    */ 
/*    */   private void createBufferImage() {
/* 70 */     int breite = getWidth();
/* 71 */     this.bufImage = createImage(breite, breite);
/* 72 */     this.bufGraphics = this.bufImage.getGraphics();
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g)
/*    */   {
/* 80 */     if (this.bufGraphics == null) {
/* 81 */       createBufferImage();
/*    */     }
/* 83 */     Color farbe = this.bVorderseite ? this.farbeVorderseite : this.farbeRueckseite;
/* 84 */     this.bufGraphics.setColor(farbe);
/* 85 */     this.bufGraphics.fillRect(0, 0, getWidth(), getHeight());
/* 86 */     g.drawImage(this.bufImage, 0, 0, this);
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikCanvas
 * JD-Core Version:    0.6.2
 */