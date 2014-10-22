package de.marco;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();
		// b zeigt dann auf die selbe instace wie s
		Singleton b = Singleton.getInstance();
	}

}
