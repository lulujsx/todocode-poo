package getters_y_setters;

public class Alumno {
	int id;
	String nombre;
	String apellido;
	
	public Alumno(){
		
	}
	
	public Alumno(int id, String nombre, String apellido){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void mostrarNombre() {
		System.out.println("Hola, soy " + nombre);
	}
	
	@Override
	public String toString() {
		return "Soy " + nombre;
	}
}
