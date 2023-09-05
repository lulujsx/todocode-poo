package ejercicio_integrador;

public class Squirtle extends Pokemon implements IAgua {
	
	public Squirtle() {
		
	}
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Squirtle " + "uso placaje");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("Squirtle " + "uso araniazo");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("Squirtle " + "uso mordisco");
	}
	@Override
	public void atacarHidrobomba() {
		System.out.println("Squirtle " + "uso hidrobomba");
		
	}
	@Override
	public void atacarPistolaAgua() {
		System.out.println("Squirtle " + "uso pistola agua");
		
	}
	@Override
	public void atacarBurbuja() {
		System.out.println("Squirtle " + "uso ataque burbuja");
		
	}
	@Override
	public void atacarHidropulso() {
		System.out.println("Squirtle " + "uso Hidropulso");
		
	}
	
	
}
