package HolaMundo;

//Clase1 https://www.youtube.com/watch?v=q9gZ9fjKIC0&list=PLQxX2eiEaqbwNP20GMMCjRslRq2lOLWlg&index=5
public class Alumno {
	int id;
	String nombre;
	String apellido;
//Clase1	
	
	//Clase3 https://www.youtube.com/watch?v=fdfXkiuVHp4&list=PLQxX2eiEaqbwNP20GMMCjRslRq2lOLWlg&index=4
	//constructores
	public Alumno(int id, String nombre, String apellido) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Alumno() {
		//constructor vacio
	}
	//Clase3
	
	//Clase4 https://www.youtube.com/watch?v=ZHK0t5gocjA&list=PLQxX2eiEaqbwNP20GMMCjRslRq2lOLWlg&index=5
	//Getters and Setters
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

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Clase2 https://www.youtube.com/watch?v=pXX3c8BloY0&list=PLQxX2eiEaqbwNP20GMMCjRslRq2lOLWlg&index=3
	//Creamos metodo
	public void mostrarNombre() {
		System.out.println("Hola soy un alumno");
	}

	public void saberAprobado (double calificacion) {
		if (calificacion>= 6) {
			System.out.println("Estoy aprobado");
		}else {
			System.out.println("Estoy desaprobado");
		}
	}
	//Clase2
}
