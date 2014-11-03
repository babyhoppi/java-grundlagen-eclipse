/**
 * Die Interface Klasse stellt die beiden
 * Methoden zum Starten und Neustarten des
 * Mosaikspiels zur Verfügung.
 */
public interface SteuerIF
{
    void startGame(int raster, boolean modus);
    void resetGame();
 
}