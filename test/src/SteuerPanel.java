import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
/**
 * Die Komponente dieser Klasse stellen die Steuerkonsole
 * bereit. Zum Starten des Spiels, der Rastereinstellung
 * und einen Button zum Neustarten.
 */
public class SteuerPanel extends Panel implements ActionListener
{
    //Die GUI-Elemente
    Label labRaster;        //welches Raster (Breite wie Höhe)
    TextField tfRaster;
    Checkbox checkBild;     //mit (true) oder ohen Bild spielen
    Button bStart;          //Spiel mit den Einstellungen starten
    Button bReset;          //Umschalten auf Startansicht
 
    private int raster;     //Raster des Spiels
    private boolean mitBild;    //Bild- /Farbvariante
    private SteuerIF container;     //Wird vom Applet implementiert
    private MosaikFrame frame;
 
    /**
     * Stellt das Aussehen der Steuerkonsole zusammen
     * mit Schriftart, und Layout
     * Den Buttons wird ein Text und der ActionListener
     * übergeben.
     */
    public SteuerPanel(SteuerIF container)
    {
        this.container=container;
        setLayout(new FlowLayout());
        setFont(new Font("Dialog", Font.BOLD,12));
        labRaster = new Label("Felder je Zeile und Spalte:", Label.CENTER);
        raster=5;       //Default Einstellung
        tfRaster = new TextField(Integer.toString(raster));
        checkBild= new Checkbox("Mit Bild spielen?", true);
        bStart = new Button(" Start ");
        bStart.addActionListener(this);
        bReset = new Button(" Reset ");
        bReset.addActionListener(this);
        startKonfiguration();
 
    }
    /**
     * Initialisiert die Objekte für die Start- Konfiguration
     * die zuvor erstellt wurden
     * @see SteuerPanel#SteuerPanel
     */
    public void startKonfiguration()
    {
        remove(bReset);
        add(labRaster);
        add(tfRaster);
        add(checkBild);
        add(bStart);
        //Verwendung des gespeicherten raster-Wertes
        tfRaster.setText(Integer.toString(raster));
        //java.awt.TextComponent-Methode:
        tfRaster.selectAll();
        //java.awt.Component-Methode
        tfRaster.requestFocus();
    }
 
    /**
     * Die Reset-Konfiguration für das laufende Spiel
     * @see SteuerPanel#SteuerPanel
     */
    public void resetKonfiguration()
    {
 
        remove(labRaster);
        remove(tfRaster);
        remove(checkBild);
        remove(bStart);
        add(bReset);
    }
 
    /**
     * Das ActionEvent sorgt dafür das beim Mausklick
     * auf den Button das spiel gestartet bzw.
     * neu geladen wird.
     * Die Start und Reset funktion wurden in die
     * SteuerIF klasse ausgelagert
     * @see SteuerIF
     */
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()==bStart)
        {
            try
            {
                //Speicherung des raster-Wertes
                raster=Integer.parseInt(tfRaster.getText().trim());
            }
            catch(NumberFormatException nfe)
            {
                raster=5;       //default wert
            }
            mitBild=checkBild.getState();
            resetKonfiguration();
            container.startGame(raster, mitBild);
        }
 
        if (ae.getSource()==bReset)
        {
            startKonfiguration();
            container.resetGame();
 
        }
    }
}