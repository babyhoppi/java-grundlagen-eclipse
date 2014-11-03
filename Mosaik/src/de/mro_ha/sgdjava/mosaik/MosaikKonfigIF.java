package de.mro_ha.sgdjava.mosaik;

import java.awt.Color;

public abstract interface MosaikKonfigIF
{
  public abstract void setRaster(int paramInt);

  public abstract void setRaster(String paramString);

  public abstract void setMitBild(boolean paramBoolean);

  public abstract void setZeigeProtokoll(boolean paramBoolean);

  public abstract int getRaster();

  public abstract boolean isMitBild();

  public abstract boolean isZeigeProtokoll();

  public abstract Color getFarbeRueckseite();

  public abstract void setFarbeRueckseite(Color paramColor);

  public abstract Color getFarbeVorderseite();

  public abstract void setFarbeVorderseite(Color paramColor);
}

/* Location:           C:\Users\M46923\Desktop\JSF Übungen und Dokumente\Java\Jav04N\Lektion4\Mosaik5\
 * Qualified Name:     de.mro_ha.sgdjava.mosaik.MosaikKonfigIF
 * JD-Core Version:    0.6.2
 */