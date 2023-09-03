package herencia;

public class Consultor extends Persona {
	String nombre_consultora;
	int num_consultor;
	
	public Consultor() {
//		super();
	}
	public Consultor(String nombre_consultora,int num_consultor,int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.nombre_consultora = nombre_consultora;
		this.num_consultor = num_consultor;
	}
	public String getNombreConsultora() {
		return nombre_consultora;
	}
	public void setNombreConsultora(String nombre_consultora) {
		this.nombre_consultora = nombre_consultora;
	}
	public int getNumConsultor() {
		return num_consultor;
	}
	public void setNumConsultor(int num_consultor) {
		this.num_consultor = num_consultor;
	}
}
