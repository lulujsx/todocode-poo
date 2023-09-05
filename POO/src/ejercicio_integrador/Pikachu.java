package ejercicio_integrador;

public class Pikachu extends Pokemon implements IElectrico {
	
	public Pikachu() {
		
	}
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Pikachu " + "uso placaje");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("Pikachu " + "uso araniazo");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("Pikachu " + "uso mordisco");
	}
	@Override
	public void atacarImpactrueno() {
		System.out.println("Pikachu " + "uso impactrueno");
		
	}
	@Override
	public void atacarPunioTrueno() {
		System.out.println("Pikachu " + "uso punio trueno");
		
	}
	@Override
	public void atacarRayo() {
		System.out.println("Pikachu " + "uso rayo");
		
	}
	@Override
	public void atacarRayoCarga() {
		System.out.println("Pikachu " + "uso rayo carga");
		
	}
}
