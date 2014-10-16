/**
 * 
 */
package de.marco.generics;

/**
 * @Author Marco Hoppe
 */
public class NochEineAndereBox <T extends Number>{
		private T content;
		
		public void untersuche(T parameter) {
					
			System.out.println("content: " + content.getClass().getSimpleName());
			System.out.println("parameter: " + parameter.getClass().getSimpleName());
			
		}
		
		public T get() {
			return content;
		}

		public void set(T t) {
			this.content = t;
		}

}
