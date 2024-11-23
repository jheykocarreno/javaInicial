package Herencia;

public class HerenciaMain {

	public static void main(String[] args) {
		Empleado emple = new Empleado();
		emple.setApellido("Valencia");
		System.out.println("Apellido de emple: " + emple.getApellido());
		
		Consultor consul = new Consultor();
		consul.setNombre("Juan Pablo");
		System.out.println("Nombre de consul: " + consul.getNombre());
	}

}
