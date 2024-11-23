package Herencia;

public class Persona {

	//Parametros de la clase
	int id;
	String dni;
	String nombre;
	String apellido;
	String direccion;
	String telefono;
	
	//Construtor vacio
	public Persona() {
	}
	
	//Construtor con todos sus parametros
	public Persona(int id, String dni, String nombre, String apellido, String direccion, String telefono) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;		
	}
	
	//declaremos getters y setters de todos sus parametros
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
