package trabajo_practico_5_p1;

import java.util.ArrayList;

public class Pila {

	ArrayList<Elemento>elementos;

	public Pila() {
		this.elementos = new ArrayList<>();
	}
	
	public void push(Elemento e) {
		this.elementos.add(e);
	}
	
	public void pop() {
		this.elementos.remove(top());
	}
	
	public int top() {
		return this.elementos.size()-1;
	}
	
	public int size() {
		return this.elementos.size();
	}
	
	public ArrayList<Elemento>copy(){
		return new ArrayList<Elemento>(this.elementos);
	}
	
	public ArrayList<Elemento>reverse(){
		
		ArrayList<Elemento> elementosReverse = new ArrayList<>();
		
		for(int i=this.elementos.size()-1; i>=0; i--) {
			elementosReverse.add(this.elementos.get(i));
		}
		
		
		return elementosReverse;
	}
}
