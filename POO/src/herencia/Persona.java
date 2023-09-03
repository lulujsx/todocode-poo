package herencia;

public class Persona {
	int id;
	String dni;
	String nombre;
	String apellido;
	String domicilio;
	String telefono;
	
	public Persona() {
		
	}
	
	public Persona(int id,String dni,String nombre,String apellido,String domicilio,String telefono) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
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
	
	public void setNombre(String nombr) {
		this.nombre = nombr;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apell) {
		this.apellido = apell;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void setDomicilio(String dom) {
		this.domicilio = dom;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String tel) {
		this.telefono = tel;
	}
}
