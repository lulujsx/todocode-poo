package herencia;

public class Principal {
	public static void main(String[] args) {
		Persona vector[] = new Persona[5];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		vector[3] = new Jefe();
		
		Persona perso = new Persona();
		Empleado emple = new Empleado();
		
		perso = emple;
//		emple = perso; la asignacion de una clase padre a un hijo funciona pero no en el caso contrario
	}
}
