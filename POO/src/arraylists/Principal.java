package arraylists;

import java.util.List;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona> ();
		lista.add(new Persona(1,"Lulu",26));
		lista.add(new Persona(2,"PequeTopu",20));
		lista.add(new Persona(3,"GonzaFarias",21));
		lista.add(new Persona(4,"Rory",7));
		
		//recorrer por indice
		for(int i = 0; i<lista.size();i++) {
			System.out.println("prueba: " + lista.get(i).getNombre());
		}
	}
}
