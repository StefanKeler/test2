package zadatak4do5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaIIterator {
	
	public static void main(String args[]){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		lista.remove(1);
		lista.add(2,5);
		
		System.out.println("treci element liste je: " + lista.get(2));
		
		Iterator i = lista.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
