/*    */ package de.mro_ha.sgdjava.mosaik.copy;
/*    */ 
/*    */ import java.awt.Frame;
/*    */ import java.awt.TextArea;
/*    */ 
/*    */ public class MosaikProtokollFenster extends Frame
/*    */   implements MosaikKonfigActionIF
/*    */ {
/*    */   MosaikEventHandler mosaikEventHandler;
/*    */   ProtokollMosaik panelProtokoll;
/*    */   StatistikModelIF statistik;
/*    */   private TextArea taStatistik;
/*    */ 
/*    */   public MosaikProtokollFenster(MosaikEventHandler mosaikEventHandler, StatistikModelIF statistik)
/*    */   {
/* 22 */     this.mosaikEventHandler = mosaikEventHandler;
/* 23 */     this.statistik = statistik;
/*    */   }
/*    */ 
/*    */   public void konfigAction(String actionCode, MosaikKonfigIF konfig)
/*    */   {
/* 31 */     if (actionCode == "starteSpiel") {
/* 32 */       if (this.taStatistik != null) remove(this.taStatistik);
/* 33 */       setVisible(konfig.isZeigeProtokoll());
/* 34 */       if (this.panelProtokoll != null) {
/* 35 */         this.mosaikEventHandler.removeMosaikModel(this.panelProtokoll.getMosaikModel(), "prot");
/*    */       }
/* 37 */       if (konfig.isZeigeProtokoll()) {
/* 38 */         this.panelProtokoll = new ProtokollMosaik(konfig.getRaster(), getWidth(), 
/* 39 */           konfig.getFarbeRueckseite(), konfig.getFarbeVorderseite(), this.mosaikEventHandler);
/* 40 */         add(this.panelProtokoll);
/*    */       }
/*    */     }
/* 43 */     if (actionCode == "resetSpiel") {
/* 44 */       if (this.panelProtokoll != null) remove(this.panelProtokoll);
/*    */ 
/* 46 */       String s = "Dummyausgabe";
/* 47 */       if (this.statistik != null) s = this.statistik.getStatistikInfo();
/* 48 */       this.taStatistik = new TextArea(s);
/* 49 */       this.taStatistik.setBounds(0, 0, getWidth(), getHeight());
/* 50 */       add(this.taStatistik);
/*    */     }
/* 52 */     validate();
/*    */   }
/*    */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikProtokollFenster
 * JD-Core Version:    0.6.2
 */