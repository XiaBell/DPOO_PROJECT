package entities;

import java.util.ArrayList;

import logic.Comprador;

public class Fotografia extends Pieza{

	private String formato;
	private String resolucion;
	
	
	public Fotografia(String titulo, int anio, String creacion, ArrayList<String> autores, int valor_fijo, boolean bloqueado, Comprador propietario, String tipo_pieza, String formato, String resolucion) {
		super(titulo, anio, creacion, autores, valor_fijo, bloqueado, propietario, tipo_pieza);
		this.formato = formato;
		this.resolucion = resolucion;
	}
	
	
}
