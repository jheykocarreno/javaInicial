package Herencia;

public class Consultor extends Persona{

	String nombreConsultora;
	int numConsultor;
	
	public Consultor() {
		
	}
	
	public Consultor(String nombreConsultora, int numConsultor) {
		super();
		this.nombreConsultora = nombreConsultora;
		this.numConsultor = numConsultor;
	}

	public String getNombreConsultora() {
		return nombreConsultora;
	}

	public void setNombreConsultora(String nombreConsultora) {
		this.nombreConsultora = nombreConsultora;
	}

	public int getNumConsultor() {
		return numConsultor;
	}

	public void setNumConsultor(int numConsultor) {
		this.numConsultor = numConsultor;
	}
		
}
