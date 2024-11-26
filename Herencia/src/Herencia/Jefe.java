package Herencia;

public class Jefe extends Persona{
	
	int idJefe;
	String departamentoJefe;

	public Jefe() {

	}

	public Jefe(int idJefe, String departamentoJefe) {
		super();
		this.idJefe = idJefe;
		this.departamentoJefe = departamentoJefe;
	}
	
	public int getidJefe() {
		return idJefe;
	}
	
	public void setidJefe (int idJefe) {
		this.idJefe = idJefe;
	}
	
	public String getdepartamentoJefe() {
		return departamentoJefe;
	}
	
	public void setdepartamentoJefe (String departamentoJefe) {
		this.departamentoJefe = departamentoJefe;
	}
	

}
