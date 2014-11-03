/*     */ package de.mro_ha.sgdjava.mosaik;
/*     */ 
/*     */ import java.awt.Button;
/*     */ import java.awt.Checkbox;
/*     */ import java.awt.TextField;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Hashtable;
/*     */ 
/*     */ public class MosaikEventHandler
/*     */   implements MouseListener, ActionListener, FocusListener, ItemListener
/*     */ {
/*     */   private Hashtable modelTable;
/*     */   private Hashtable konfigTable;
/*     */   private MosaikKonfigIF konfig;
/*     */ 
/*     */   public MosaikEventHandler(MosaikKonfigIF konfig)
/*     */   {
/*  29 */     this.modelTable = new Hashtable();
/*  30 */     this.konfigTable = new Hashtable();
/*  31 */     this.konfig = konfig;
/*     */   }
/*     */ 
/*     */   public void itemStateChanged(ItemEvent ev)
/*     */   {
/*  39 */     if (((Checkbox)ev.getSource()).getName() == "mitBild") {
/*  40 */       this.konfig.setMitBild(((Checkbox)ev.getSource()).getState());
/*     */     }
/*  42 */     if (((Checkbox)ev.getSource()).getName() == "zeigeProtokoll")
/*  43 */       this.konfig.setZeigeProtokoll(((Checkbox)ev.getSource()).getState());
/*     */   }
/*     */ 
/*     */   public void focusGained(FocusEvent ev)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void focusLost(FocusEvent ev)
/*     */   {
/*  55 */     if (((TextField)ev.getSource()).getName() == "Raster")
/*  56 */       this.konfig.setRaster(((TextField)ev.getSource()).getText().trim());
/*     */   }
/*     */ 
/*     */   public void addModel(MosaikModelIF model)
/*     */   {
/*  66 */     this.modelTable.put(new Integer(model.hashCode()), model);
/*     */   }
/*     */ 
/*     */   public void removeMosaikModel(Object model, String s) {
/*  70 */     if ((model != null) && (this.modelTable.contains(model)))
/*  71 */       this.modelTable.remove(new Integer(model.hashCode()));
/*     */     else
/*  73 */       System.out.println("RemoveMosaikModel: Kein Modell zum Verwerfen gefunden:" + s);
/*     */   }
/*     */ 
/*     */   public void addKonfigModel(MosaikKonfigActionIF model)
/*     */   {
/*  82 */     this.konfigTable.put(new Integer(model.hashCode()), model);
/*     */   }
/*     */ 
/*     */   public void actionPerformed(ActionEvent ae)
/*     */   {
/*  90 */     String actionCode = ((Button)ae.getSource()).getName();
/*  91 */     for (Enumeration e = this.konfigTable.elements(); e.hasMoreElements(); )
/*  92 */       ((MosaikKonfigActionIF)e.nextElement()).konfigAction(actionCode, this.konfig);
/*     */   }
/*     */ 
/*     */   public void mouseClicked(MouseEvent ev)
/*     */   {
/* 101 */     int zeile = ((KachelIF)ev.getSource()).getZeile();
/* 102 */     int spalte = ((KachelIF)ev.getSource()).getSpalte();
/* 103 */     for (Enumeration e = this.modelTable.elements(); e.hasMoreElements(); )
/* 104 */       ((MosaikModelIF)e.nextElement()).action(zeile, spalte);
/*     */   }
/*     */ 
/*     */   public void mouseEntered(MouseEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void mouseExited(MouseEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void mousePressed(MouseEvent e)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void mouseReleased(MouseEvent e)
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikEventHandler
 * JD-Core Version:    0.6.2
 */