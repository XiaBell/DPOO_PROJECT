package entities;

import java.util.ArrayList;

import logic.Comprador;

public class Escultura extends Pieza{
	
	private Double altura;
	private Double ancho;
	private Double profundidad;
	private ArrayList<String> materiales;
	private Double peso;
	private boolean electricidad;
	private String detalles;
	

	
	public Escultura(String titulo,
			int anio,
			String creacion,
			ArrayList<String> autores,
			int valor_fijo, boolean bloqueado,
			Comprador propietario,
			String tipo_pieza,
			Double altura,
			Double ancho,
			Double profundidad,
			ArrayList<String> materiales,
			Double peso,
			boolean electricidad,
			String detalles) {
		
		super(titulo, anio, creacion, autores, valor_fijo, bloqueado, propietario, tipo_pieza);
		this.altura = altura;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.materiales = materiales;
		this.peso = peso;
		this.electricidad = electricidad;
		this.detalles = detalles;
	}

}
