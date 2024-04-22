package entities;

import java.util.ArrayList;

import logic.Comprador;

public class Video extends Pieza{
	
	public int duracion;
	public String formato;
	public String genero;
	
	
	public Video(String titulo, int anio, String creacion, ArrayList<String> autores, int valor_fijo, boolean bloqueado, Comprador propietario, String tipo_pieza, int duracion, String formato, String genero) {
		
		super(titulo, anio, creacion, autores, valor_fijo, bloqueado, propietario, tipo_pieza);
		this.duracion = duracion;
		this.formato = formato;
		this.genero = genero;
	}

	

}
