package HolaMundo;

public class HolaMundoC {
	public static void main(String[] args) {
		
		//clase3
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(3, "Luis", "Marca");
		//clase3
		//clase4
		System.out.println("la ID del alumno 2: " + alu2.getId());
		System.out.println("la ID del alumno 1: " + alu1.getId());
		
		alu1.setId(1);
		System.out.println("la ID del alumno 1: " + alu1.getId());
		
		alu2.setId(2);
		System.out.println("la ID del alumno 2: " + alu2.getId());
		//clase4
	}
}
