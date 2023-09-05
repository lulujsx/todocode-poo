package ejercicio_integrador;

public class Charmander extends Pokemon implements IFuego {
	
	public Charmander() {
		
	}
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Charmander " + "uso placaje");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("Charmander " + "uso araniazo");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("Charmander " + "uso mordisco");
	}
	@Override
	public void atacarPunioFuego() {
		System.out.println("Charmander " + "uso punio fuego");
		
	}
	@Override
	public void atacarAscuas() {
		System.out.println("Charmander " + "uso ascuas");
		
	}
	@Override
	public void atacarLanzallamas() {
		System.out.println("Charmander " + "uso lanzallamas");
		
	}
}
