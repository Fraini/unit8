/**
 * 
 */
package unit8pru;

/**
 * @author Fraini Sánchez
 *
 */
public class Profesor extends Persona {
	
	private int salario;
	
	Profesor(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}


	public boolean esProfesor(){
		return false;
	}

}
