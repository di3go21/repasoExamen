package Serializacion;

import java.io.Serializable;

public class MiObjeto implements Serializable {

	private String nombre;
	private String apellido;
	private transient int edad;
	private transient int dinero;

	public MiObjeto() {
		super();
	}

	public MiObjeto(String nombre, String apellido, int edad, int dinero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dinero = dinero;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "MiObjeto [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	

}
