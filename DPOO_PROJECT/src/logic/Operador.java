package logic;

import entities.Subasta;

public class Operador extends Usuario {
	
	private Subasta subasta;
	private String nombre;
	private String apellido;
	private int cedula;
	

	public Operador(String user, String pass, String rol, String actu, String nombre, String apellido, int cedula) {
		super(user, pass, rol, actu);
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;

	}

}
