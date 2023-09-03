package getters_y_setters;

public class Principal {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno(2,"Lulu","Bleu");
		alumno2.mostrarNombre();
		System.out.println(alumno2.toString());
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Lola");
		System.out.println(alumno3.getNombre());
	}

}
