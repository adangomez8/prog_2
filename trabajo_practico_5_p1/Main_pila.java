package trabajo_practico_5_p1;

public class Main_pila {

	public static void main(String[] args) {
		
		Elemento e1 = new Elemento("E1");
		Elemento e2 = new Elemento("E2");
		Elemento e3 = new Elemento("E3");
		Elemento e4 = new Elemento("E4");
		Elemento e5 = new Elemento("E5");
		
		Pila p1 = new Pila();
		
		p1.push(e1);
		p1.push(e2);
		p1.push(e3);
		p1.push(e4);
		p1.push(e5);
		
		System.out.println(p1.copy());
		
		p1.pop();
		
		System.out.println(p1.copy());
		System.out.println(p1.reverse());
		

	}

}
