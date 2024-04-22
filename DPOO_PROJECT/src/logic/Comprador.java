package logic;
import java.util.ArrayList;

import entities.Pieza;

public class Comprador extends Usuario {
	
	private String nombre;
	private String apellido;
	private  int cedula;
	private  int contacto;
	private  int ingresos;
	private boolean propietario;
	private ArrayList<Pieza> piezas;
	
	
	public Comprador (String nombre, String apellido, int cedula, String usuario, String contrasena, int contacto, int ingresos, String rol, String UltimaActualizacion, boolean propietario) {
		
		super(usuario, contrasena, rol, UltimaActualizacion);
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.contacto = contacto;
		this.ingresos = ingresos;
		this.propietario = propietario;

	}
	
	public boolean ispropietario (Comprador comprador) {
		
		return this.propietario;
	}
	
	public ArrayList<Pieza> getpiezas(Comprador comprador){

		        this.propietario = true;
				return this.piezas;
	}
	
	public void addpieza(Comprador comprador, Pieza pieza){
		
		ArrayList<Pieza> piezas = getpiezas(comprador);
		piezas.add(pieza);
		this.piezas = piezas;
		
		}

	
}
