import java.awt.Frame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
 
public class MosaikFrame extends Frame
{
 
    private ModelIF mf;
    private MosaikEventHandler eventHandler;
    private MosaikIF fm;
    private int zeile, spalte;
    private MosaikModel mosaikModel;
    
 
    public MosaikFrame(int raster, int breite, Color farbeRueckseite, Color farbeVorderseite)
    {
 
        setTitle("Protokollfenster");
        setSize(437,470);
        setLocation(440, 0);
 
        mf = new MosaikModel(raster, raster);
 
        //eventHandler = new MosaikEventHandler(mf);
        setLayout(new GridLayout(raster, raster,1,1));
        int canvasBreite=breite/raster;
 
        for (int i=0; i< raster; i++)
        {
            for (int j=0; j< raster; j++)
            {
                MosaikCanvas mc = new MosaikCanvas(i,j, farbeRueckseite, farbeVorderseite);
                mf.putObj(i,j, mc);
 
                mc.setSize(canvasBreite, canvasBreite);
 
                add(mc);
 
            }
        }
    }
 
}