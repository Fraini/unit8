/**
 * 
 */
package unit8pru;

/**
 * @author Fraini Sánchez
 *
 */
public class Asignatura {
	private String nombre;
	private String DNI; //no sale en el diagrama!
	private double nota; //en el diagrama no le hace getter y setter, yo se lo pongo
	
	Asignatura(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void SetDni(String Dni){
		this.DNI = Dni;
	}
	
	public String getDni(){
		return this.DNI;
	}
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
