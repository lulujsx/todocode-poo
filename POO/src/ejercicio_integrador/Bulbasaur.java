package ejercicio_integrador;

public class Bulbasaur extends Pokemon implements IPlanta {
	
	public Bulbasaur() {
		
	}
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Bulbasaur " + "uso placaje");
	}
	@Override
	public void atacarAraniazo() {
		System.out.println("Bulbasaur " + "uso araniazo");
	}
	@Override
	public void atacarMordisco() {
		System.out.println("Bulbasaur " + "uso mordisco");
	}
	@Override
	public void atacarParalizar() {
		System.out.println("Bulbasaur " + "uso paralizar");
		
	}
	@Override
	public void atacarDrenaje() {
		System.out.println("Bulbasaur " + "uso drenaje");		
	}
	@Override
	public void atacarHojaAfilada() {
		System.out.println("Bulbasaur " + "uso hoja afilada");
		
	}
	@Override
	public void atacarLatigoCepa() {
		System.out.println("Bulbasaur " + "uso latigo cepa");
	}
	
}
