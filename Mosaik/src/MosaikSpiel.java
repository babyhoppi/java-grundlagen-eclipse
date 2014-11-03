/*     */ package de.mro_ha.sgdjava.mosaik;
/*     */ 
/*     */ import java.applet.Applet;
/*     */ import java.awt.Color;
/*     */ import java.awt.Image;
/*     */ import java.awt.image.FilteredImageSource;
/*     */ import java.awt.image.ImageFilter;
/*     */ import java.awt.image.ReplicateScaleFilter;
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ public class MosaikSpiel extends Applet
/*     */   implements MosaikKonfigActionIF
/*     */ {
/*  15 */   private final Color farbeRueckseite = new Color(230, 30, 50);
/*  16 */   private final Color farbeVorderseite = new Color(50, 210, 30);
/*  17 */   private String bildName = "mosaik_01.jpg";
/*  18 */   private int rasterDefault = 5;
/*  19 */   private boolean mitBildDefault = true;
/*  20 */   private boolean zeigeProtokollDefault = true;
/*  21 */   private final String fensterTitel = "Protokoll";
/*  22 */   private final int minBreite = 500;
/*  23 */   private final int minHoehe = 600;
/*     */   private Image bild;
/*     */   private VorschauBild vorschaubild;
/*     */   private MosaikKonfigModel mosaikKonfigModel;
/*     */   private BildMosaik bm;
/*     */   private FarbMosaik fm;
/*     */   private MosaikStatistik mosaikStatistik;
/*     */   private SteuerPanel steuerPanel;
/*     */   private MosaikEventHandler mosaikEventHandler;
/*     */   private MosaikProtokollFenster mosaikProtokollFenster;
/*     */ 
/*     */   public void init()
/*     */   {
/*  42 */     readParameter();
/*     */ 
/*  45 */     int breite = getWidth() > 500 ? getWidth() : 500;
/*  46 */     int hoehe = getHeight() > 600 ? getHeight() : 600;
/*  47 */     resize(breite, hoehe);
/*     */ 
/*  50 */     this.mosaikKonfigModel = new MosaikKonfigModel(this.rasterDefault, this.mitBildDefault, this.zeigeProtokollDefault, this.bildName, 
/*  51 */       this.farbeRueckseite, this.farbeVorderseite);
/*     */ 
/*  54 */     this.mosaikEventHandler = new MosaikEventHandler(this.mosaikKonfigModel);
/*     */ 
/*  57 */     this.bild = getImage(getDocumentBase(), this.bildName);
/*  58 */     this.bild = ImageHandler.ladeBild(this.bild, this);
/*  59 */     int raster = this.mosaikKonfigModel.getRaster();
/*  60 */     raster = raster == 0 ? this.rasterDefault : raster;
/*  61 */     int bildBreite = getWidth() / raster * raster;
/*  62 */     int bildHoehe = getHeight() / raster * raster;
/*  63 */     int bildGroesse = bildBreite < bildHoehe ? bildBreite : bildHoehe;
/*  64 */     ImageFilter skaliereFilter = new ReplicateScaleFilter(bildGroesse, bildGroesse);
/*  65 */     this.bild = createImage(new FilteredImageSource(this.bild.getSource(), skaliereFilter));
/*     */ 
/*  68 */     this.vorschaubild = new VorschauBild(this.bild);
/*  69 */     this.vorschaubild.setBounds(1, 1, getWidth(), getWidth());
/*  70 */     add(this.vorschaubild);
/*  71 */     this.mosaikEventHandler.addKonfigModel(this.vorschaubild);
/*     */ 
/*  74 */     this.mosaikStatistik = new MosaikStatistik();
/*  75 */     this.mosaikEventHandler.addModel(this.mosaikStatistik);
/*  76 */     this.mosaikEventHandler.addKonfigModel(this.mosaikStatistik);
/*     */ 
/*  79 */     this.mosaikProtokollFenster = new MosaikProtokollFenster(this.mosaikEventHandler, this.mosaikStatistik);
/*  80 */     this.mosaikProtokollFenster.setBounds(getWidth() + 15, 20, getWidth() / 2, getWidth() / 2);
/*  81 */     this.mosaikProtokollFenster.setVisible(false);
/*  82 */     this.mosaikProtokollFenster.setTitle("Protokoll");
/*  83 */     this.mosaikEventHandler.addKonfigModel(this.mosaikProtokollFenster);
/*     */ 
/*  86 */     this.steuerPanel = new SteuerPanel(this.mosaikEventHandler, 
/*  87 */       this.mitBildDefault, this.zeigeProtokollDefault, this.rasterDefault);
/*  88 */     this.mosaikEventHandler.addKonfigModel(this.steuerPanel);
/*  89 */     add(this.steuerPanel);
/*     */ 
/*  92 */     this.mosaikEventHandler.addKonfigModel(this);
/*     */   }
/*     */ 
/*     */   private void readParameter()
/*     */   {
/*  99 */     String sValue = getParameter("raster");
/* 100 */     if (sValue != null) {
/*     */       try {
/* 102 */         int raster = Integer.parseInt(sValue.trim());
/* 103 */         if (raster > 0) this.rasterDefault = raster; 
/*     */       }
/* 105 */       catch (NumberFormatException nfe) { System.out.println("Raster kein Integer:" + sValue); }
/*     */ 
/*     */     }
/*     */ 
/* 109 */     sValue = getParameter("bildname");
/* 110 */     if ((sValue != null) && (!sValue.equals(""))) {
/* 111 */       this.bildName = sValue;
/*     */     }
/*     */ 
/* 114 */     sValue = getParameter("mitbild");
/* 115 */     if (sValue != null) {
/* 116 */       if (sValue.equals("true")) {
/* 117 */         this.mitBildDefault = true;
/*     */       }
/* 119 */       if (sValue.equals("false")) {
/* 120 */         this.mitBildDefault = false;
/*     */       }
/*     */     }
/*     */ 
/* 124 */     sValue = getParameter("protokoll");
/* 125 */     if (sValue != null) {
/* 126 */       if (sValue.equals("true")) {
/* 127 */         this.zeigeProtokollDefault = true;
/*     */       }
/* 129 */       if (sValue.equals("false"))
/* 130 */         this.zeigeProtokollDefault = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void konfigAction(String actionCode, MosaikKonfigIF konfig)
/*     */   {
/* 139 */     if (actionCode == "starteSpiel") {
/* 140 */       startGame(konfig.getRaster(), konfig.isMitBild(), konfig.isZeigeProtokoll());
/*     */     }
/* 142 */     if (actionCode == "resetSpiel")
/* 143 */       resetGame();
/*     */   }
/*     */ 
/*     */   private void startGame(int raster, boolean modus, boolean protokoll)
/*     */   {
/* 149 */     showStatus("Neues Spiel, neues Glück: ");
/*     */ 
/* 151 */     remove(this.vorschaubild);
/* 152 */     remove(this.steuerPanel);
/*     */ 
/* 154 */     if (this.bm != null) {
/* 155 */       this.mosaikEventHandler.removeMosaikModel(this.bm.getMosaikModel(), "bm");
/* 156 */       this.bm = null;
/*     */     }
/*     */ 
/* 159 */     if (this.fm != null) {
/* 160 */       this.mosaikEventHandler.removeMosaikModel(this.fm.getMosaikModel(), "fm");
/* 161 */       this.fm = null;
/*     */     }
/*     */ 
/* 164 */     if (modus) {
/* 165 */       this.bm = new BildMosaik(raster, getWidth(), this.farbeRueckseite, this.bild, this.mosaikEventHandler);
/* 166 */       add(this.bm);
/*     */     } else {
/* 168 */       this.fm = new FarbMosaik(raster, getWidth(), this.farbeRueckseite, this.farbeVorderseite, this.mosaikEventHandler);
/* 169 */       add(this.fm);
/*     */     }
/*     */ 
/* 172 */     add(this.steuerPanel);
/* 173 */     validate();
/*     */   }
/*     */ 
/*     */   private void resetGame() {
/* 177 */     showStatus("Anzahl Züge: " + this.mosaikStatistik.getAnzahlVersuche());
/* 178 */     remove(this.steuerPanel);
/* 179 */     if (this.bm != null) {
/* 180 */       this.mosaikEventHandler.removeMosaikModel(this.bm.getMosaikModel(), "bm");
/* 181 */       remove(this.bm);
/* 182 */       this.bm = null;
/*     */     }
/* 184 */     if (this.fm != null) {
/* 185 */       this.mosaikEventHandler.removeMosaikModel(this.fm.getMosaikModel(), "fm");
/* 186 */       remove(this.fm);
/* 187 */       this.fm = null;
/*     */     }
/* 189 */     add(this.vorschaubild);
/* 190 */     add(this.steuerPanel);
/* 191 */     validate();
/*     */   }
/*     */ }

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikSpiel
 * JD-Core Version:    0.6.2
 */