


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;


public class SwingFrameLek4 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtfStatus;
	private JMenuItem jmiClose;
	private JMenuItem jmiSaveAs;
	private AbstractAction actNewFile, actOpenFile, actOpenWeb, actSaveFile, actAbout, actHelp;
	private JMenuItem jmiOpenFile;
	private JMenuItem jmiOpenWeb;
	private JMenuItem jmiSave;
	private JMenuItem jmiHelp;
	private JToolBar JToolBar;
	private String iconSize="16";
	private final String TTT_NEW="Erstelle eine neue Datei";
	private final String TTT_OPEN="Öffnet den Verzeichnisbaum";
	private final String TTT_WEB="Öffnet das Internet";
	private final String TTT_SAVE="Speichert die Datei sofort";
	private final String TTT_HELP="Hier erhalten Sie Hilfe";
	private final String TTT_ABOUT="Über das Programm";
	private KeyStroke keyStroke;
	
	
	public SwingFrameLek4(String name){
		putValue(Action.NAME, name);
	}
	
	private void putValue(String name, String name2) {
		// TODO Auto-generated method stub
		
	}

	public SwingFrameLek4(String name, Icon icon){
		this(name);
		putValue(Action.SMALL_ICON, icon);
	}
	
	private void putValue(String smallIcon, Icon icon) {
		// TODO Auto-generated method stub
	}

	public SwingFrameLek4(){
		super("Swing-Frame mit Menü");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		
		//hier alsbald: Zusammenbau der Menüs
		createMenu();
		
		// Statusleiste erstellen
		jtfStatus = new JTextField();
		jtfStatus.setBackground(Color.BLACK);
		jtfStatus.setForeground(Color.WHITE);
		jtfStatus.setEditable(false);
		
		
	
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(BorderLayout.SOUTH, jtfStatus);
		contentPane.add(BorderLayout.CENTER, panel);
		
		

		JToolBar toolBar = new JToolBar();
		toolBar.setLayout(new BorderLayout());
		toolBar.add(actNewFile);
		contentPane.add(BorderLayout.NORTH,this.getToolBar());
		
		
		this.setVisible(true);
	
	}
	
	private JToolBar getToolBar(){
		JToolBar toolBar = new JToolBar();
		toolBar.add(actNewFile);
		toolBar.add(actOpenFile);
		toolBar.add(actOpenWeb);
		toolBar.add(actSaveFile);
		toolBar.addSeparator();
		toolBar.add(actHelp);
		toolBar.add(actAbout);
		return toolBar;
	}
	
	private void createMenu() {
		// Menü-Konstruktion - zuerst die MenuBar:
		JMenuBar menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		
		
		
		// Datei-Menü
		JMenu menuFile=new JMenu("Datei");
		actNewFile = new AbstractAction("Neu...",new ImageIcon("icons/New"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"Datei - Neu...\" gewählt");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK);
		actNewFile.putValue(Action.SHORT_DESCRIPTION, TTT_NEW); //ToolTipTextIcon
		//Shortcut im Action-Objekt erzeugen
		actNewFile.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Action-Objekt hinzufügen und gleich JMenuItem initialisieren
		JMenuItem jmiNew = menuFile.add(actNewFile);
		jmiNew.setToolTipText("Erstelle eine neue Datei");	//ToolTipText als Hinweis

		// Untermenü "Öffnen"
		JMenu menuOpen=new JMenu("Öffnen");
		actOpenFile = new AbstractAction("Dateisystem...",new ImageIcon("icons/Open"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"Datei - Öffnen - "+"Web...\" gewählt.");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_MASK);
		//Shortcut im Action-Objekt erzeugen
		actOpenFile.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Tooltip im Action-Objekt speichern
		actOpenFile.putValue(Action.SHORT_DESCRIPTION, TTT_OPEN);
		//Action-Objekt hinzufügen und gleich JMenuItem initialisieren
		jmiOpenFile= menuOpen.add(actOpenFile);
		
		//ALT und mit Tooltip im Action-Objekt entfällt das
		//jmiOpenFile.setToolTipText("Öffnet den Verzeichnisbaum");	//ToolTipText als Hinweis
		
		// Untermenü "WEB"
		actOpenWeb = new AbstractAction("Web...",new ImageIcon("icons/WebComponent"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"Datei - Öffnen - "+"Web...\" gewählt.");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK);
		//Shortcut im Action-Objekt erzeugen
		actOpenWeb.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Tooltip im Action-Objekt speichern
		actOpenWeb.putValue(Action.SHORT_DESCRIPTION, TTT_WEB);
		//Action-Objekt hinzufügen und gleich JMenuItem initialisieren
		jmiOpenWeb= menuOpen.add(actOpenWeb);
		//ALT und mit Tooltip im Action-Objekt entfällt das
		//jmiOpenWeb.setToolTipText("Öffnet das Internet");	//ToolTipText als Hinweis
		
		//Untermenü ins Dateimenü
		menuFile.add(menuOpen);
		
		//schließen
		jmiClose = new JMenuItem("Schließen");
		jmiClose.addActionListener(this);
		menuFile.add(jmiClose);
		jmiClose.setToolTipText("Wollen Sie wirklich schon Feierabend machen?");	//ToolTipText als Hinweis
		
		
		// Trennlinie einfügen
		menuFile.addSeparator();
		
		actSaveFile= new AbstractAction("Speichern",new ImageIcon("icons/Save"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"Datei - Speichern\" gewählt.");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK);
		//Shortcut im Action-Objekt erzeugen
		actSaveFile.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Tooltip im Action-Objekt speichern
		actSaveFile.putValue(Action.SHORT_DESCRIPTION, TTT_SAVE);
		//Action-Objekt hinzufügen und gleich JMenuItem initialisieren
		jmiSave=new JMenuItem(actSaveFile);
		menuFile.add(jmiSave);
		//ALT und mit Tooltip im Action-Objekt entfällt das
		//jmiSave.setToolTipText("Speichert die Datei sofort");	//ToolTipText als Hinweis
		jmiSaveAs = new JMenuItem ("Speichern als...");
		menuFile.add(jmiSaveAs);
		jmiSaveAs.setToolTipText("Speichert die Datei unter...");	//ToolTipText als Hinweis
		jmiSaveAs.addActionListener(this);
		menuBar.add(menuFile);
		
		// Hilfsmenü
		JMenu menuHelp=new JMenu("?");
		actHelp= new AbstractAction("Hilfe",new ImageIcon("icons/Help"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"? - Hilfe\" gewählt.");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_F1,0);
		//Shortcut im Action-Objekt erzeugen
		actHelp.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Tooltip im Action-Objekt speichern
		actHelp.putValue(Action.SHORT_DESCRIPTION, TTT_HELP);
		jmiHelp=menuHelp.add(actHelp);
		//ALT und mit Tooltip im Action-Objekt entfällt das
		//jmiHelp.setToolTipText("Hier erhalten Sie Hilfe");	//ToolTipText als Hinweis
		menuHelp.addSeparator();
		actAbout= new AbstractAction("Info",new ImageIcon("icons/About"+iconSize+".gif")) {
			public void actionPerformed(ActionEvent ae) {
				jtfStatus.setText("\"? - Info\" gewählt.");
			}
		};
		//KeyStroke erzeugen
		keyStroke = keyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK);
		//Shortcut im Action-Objekt erzeugen
		actAbout.putValue(Action.ACCELERATOR_KEY, keyStroke);
		//Tooltip im Action-Objekt speichern
		actAbout.putValue(Action.SHORT_DESCRIPTION, TTT_ABOUT);
		JMenuItem jmiAbout=menuHelp.add(actAbout);
		//ALT und mit Tooltip im Action-Objekt entfällt das
		//jmiAbout.setToolTipText("Über das Programm");	//ToolTipText als Hinweis
		menuBar.add(menuHelp);
		
		// Menüwahl mit der Tastatur
		menuFile.setMnemonic('d');
		jmiNew.setMnemonic('n');
		menuOpen.setMnemonic('f');
		jmiOpenFile.setMnemonic('e');
		jmiOpenWeb.setMnemonic('w');
		jmiClose.setMnemonic('s');
		jmiSave.setMnemonic('p');
		jmiSaveAs.setMnemonic('a');
			
	}
	
	
	public static void main(String[] args){
		new SwingFrameLek4();
	}
	public void actionPerformed(ActionEvent ae) {
		;
		if(ae.getSource().equals(jmiClose)) System.exit(0);
		if(ae.getSource().equals(jmiSaveAs)) jtfStatus.setText("\"Datei - Speichern "+"als...\" gewählt");
	}




	
	

}
