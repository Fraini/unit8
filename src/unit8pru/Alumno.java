/**
 * 
 */
package unit8pru;

/**
 * @author Fraini S�nchez
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
