package Herencia;

public class HerenciaMain {

	public static void main(String[] args) {

		/* comentamos clase de herencia para testar polimorfirmos
		Empleado emple = new Empleado();
		emple.setApellido("Valencia");
		System.out.println("Apellido de emple: " + emple.getApellido());
		
		Consultor consul = new Consultor();
		consul.setNombre("Juan Pablo");
		System.out.println("Nombre de consul: " + consul.getNombre());
		*/
		
		//Polimorfismo
		Persona vector[]= new Persona [3];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		vector[3] = new Jefe();
		
		Persona perso = new Persona();
		Consultor consul = new Consultor();
		
		perso = consul;
		}
}
