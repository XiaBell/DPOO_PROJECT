package entities;

import java.util.ArrayList;

import logic.Comprador;

public class Pintura extends Pieza{
	
	private Double alto;
	private Double ancho;
	private ArrayList<String> materiales;
	private Double peso;
	private String detalleinstalacion;
	
	
	
	public Pintura(String titulo, int anio, String creacion, ArrayList<String> autores, int valor_fijo, boolean bloqueado, Comprador propietario, String tipo_pieza, Double alto, Double ancho, ArrayList<String> materiales, Double peso, String detalles) {
		
		super(titulo, anio, creacion, autores, valor_fijo, bloqueado, propietario, tipo_pieza);
		this.alto = alto;
		this.ancho = ancho;
		this.materiales = materiales;
		this.peso = peso;
		this.detalleinstalacion = detalles;
	}
	


}
