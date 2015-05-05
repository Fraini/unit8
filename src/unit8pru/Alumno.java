/**
 * 
 */
package unit8;

/**
 * @author Fraini Sánchez
 *
 */
public class Alumno extends Persona{

	Alumno(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}
	
	public boolean esProfesor(){
		return false;
	}

}
