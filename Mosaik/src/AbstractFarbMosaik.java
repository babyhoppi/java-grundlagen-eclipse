 package de.mro_ha.sgdjava.mosaik;
 
 import java.awt.Color;
 import java.awt.GridLayout;
 import java.awt.Panel;
 
 abstract class AbstractFarbMosaik extends Panel
 {
   protected MosaikModelIF mosaikModel;
 
   public AbstractFarbMosaik(int raster, int breite, Color farbeRueckseite, Color farbeVorderseite, MosaikEventHandler mosaikEventHandler)
   {
     this.mosaikModel = createMosaikModel(raster);
     mosaikEventHandler.addModel(this.mosaikModel);
     setLayout(new GridLayout(raster, raster, 1, 1));
     int canvasBreite = breite / raster;
 
     for (int i = 0; i < raster; i++)
       for (int j = 0; j < raster; j++) {
         MosaikCanvas mc = new MosaikCanvas(farbeRueckseite, farbeVorderseite, i, j);
         mc.addMouseListener(mosaikEventHandler);
         kachelAnmelden(mc, mosaikEventHandler);
        this.mosaikModel.putObj(i, j, mc);
        mc.setSize(canvasBreite, canvasBreite);
       add(mc);
       }
   }
 
   abstract MosaikModelIF createMosaikModel(int paramInt);
 
   abstract void kachelAnmelden(MosaikCanvas paramMosaikCanvas, MosaikEventHandler paramMosaikEventHandler);
 
   public MosaikModelIF getMosaikModel()
   {
     return this.mosaikModel;
 }
}

