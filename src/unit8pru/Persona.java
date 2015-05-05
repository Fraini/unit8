/**
 * 
 */
package unit8;

import java.util.ArrayList;

/**
 * @author Fraini Sánchez
 *
 */
public abstract class Persona {
	protected String nombre;
	protected String dni;
	protected ArrayList<Asignatura> asignaturas;
	
	Persona(String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
		this.asignaturas = new ArrayList<Asignatura>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni= dni;
	}
	
	public boolean esProfesor(){
		return false;
	}
	
	public void mostrarListadoAsignaturasNota(){
		
	}
	
	public void ordenarPorAsignaturas(){
		
	}
	
	public void ordenarPorNotas(){
		
	}
	
	
	public void anyadirAsignatura(Asignatura a){
		asignaturas.add(a);
	}
	
	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	
	
	
	
}
