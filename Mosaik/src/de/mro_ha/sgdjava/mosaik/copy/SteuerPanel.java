/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Button;
/*    */ import java.awt.Checkbox;
/*    */ import java.awt.FlowLayout;
/*    */ import java.awt.Font;
/*    */ import java.awt.Label;
/*    */ import java.awt.Panel;
/*    */ import java.awt.TextField;
/*    */ 
/*    */ public class SteuerPanel extends Panel
/*    */   implements MosaikKonfigActionIF
/*    */ {
/*    */   private Label labRaster;
/*    */   private TextField tfRaster;
/*    */   private Checkbox checkBild;
/*    */   private Checkbox checkProtokoll;
/*    */   private Button bStart;
/*    */   private Button bReset;
/*    */ 
/*    */   public void konfigAction(String actionCode, MosaikKonfigIF konfig)
/*    */   {
/* 26 */     if (actionCode == "starteSpiel") {
/* 27 */       resetKonfiguration();
/*    */     }
/* 29 */     if (actionCode == "resetSpiel")
/* 30 */       startKonfiguration();
/*    */   }
/*    */ 
/*    */   public SteuerPanel(MosaikEventHandler eventHandler, boolean mitBild, boolean zeigeProtokoll, int raster)
/*    */   {
/* 42 */     setLayout(new FlowLayout());
/* 43 */     setFont(new Font("Dialog", 1, 12));
/*    */ 
/* 45 */     this.labRaster = new Label("Mosaikgroesse:", 0);
/* 46 */     this.tfRaster = new TextField(Integer.toString(raster));
/* 47 */     this.tfRaster.setName("Raster");
/* 48 */     this.tfRaster.addFocusListener(eventHandler);
/*    */ 
/* 51 */     this.checkBild = new Checkbox("Mit Bild spielen?", true);
/* 52 */     this.checkBild.setState(mitBild);
/* 53 */     this.checkBild.setName("mitBild");
/* 54 */     this.checkBild.addItemListener(eventHandler);
/*    */ 
/* 57 */     this.checkProtokoll = new Checkbox("Protokollfenster?", true);
/* 58 */     this.checkProtokoll.setState(zeigeProtokoll);
/* 59 */     this.checkProtokoll.setName("zeigeProtokoll");
/* 60 */     this.checkProtokoll.addItemListener(eventHandler);
/*    */ 
/* 63 */     this.bStart = new Button();
/* 64 */     this.bStart.setLabel(" Start ");
/* 65 */     this.bStart.setName("starteSpiel");
/* 66 */     this.bStart.addActionListener(eventHandler);
/*    */ 
/* 69 */     this.bReset = new Button(" Reset ");
/* 70 */     this.bReset.setName("resetSpiel");
/* 71 */     this.bReset.addActionListener(eventHandler);
/*    */ 
/* 74 */     startKonfiguration();
/*    */   }
/*    */ 
/*    */   private void startKonfiguration() {
/* 78 */     remove(this.bReset);
/* 79 */     add(this.labRaster);
/* 80 */     add(this.tfRaster);
/* 81 */     add(this.bStart);
/* 82 */     add(this.checkBild);
/* 83 */     add(this.checkProtokoll);
/* 84 */     this.tfRaster.selectAll();
/* 85 */     this.tfRaster.requestFocus();
/* 86 */     validate();
/*    */   }
/*    */ 
/*    */   private void resetKonfiguration() {
/* 90 */     remove(this.labRaster);
/* 91 */     remove(this.tfRaster);
/* 92 */     remove(this.bStart);
/* 93 */     remove(this.checkBild);
/* 94 */     remove(this.checkProtokoll);
/* 95 */     add(this.bReset);
/* 96 */     validate();
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.SteuerPanel
 * JD-Core Version:    0.6.2
 */