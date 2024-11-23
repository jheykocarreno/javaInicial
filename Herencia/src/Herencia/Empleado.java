package Herencia;

public class Empleado extends Persona{
	
	int num_legajo;
	String cargo;
	Double sueldo;
	
	//Construtor vacio
	public Empleado() {
		
	}

	//constructor con los parametros
	public Empleado(int num_legajo, String cargo, Double sueldo) {
		super();
		this.num_legajo = num_legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;					
	}

	//getters y setters
	public int getNum_legajo() {
		return num_legajo;
	}

	public void setNum_legajo(int num_legajo) {
		this.num_legajo = num_legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

}
