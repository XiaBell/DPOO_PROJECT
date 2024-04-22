package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import logic.Comprador;

public abstract class Pieza {
	
	private String titulo;
	private int anio;
	private String lugar_creacion;
	private ArrayList<String> autores;
	private int valor_fijo;
	private boolean bloqueado;
	private Comprador propietario;
	private String tipo_pieza;
	private int codigo;
	private String tiempo_ingreso;
	
	public Pieza (String titulo, int anio, String creacion, ArrayList<String> autores, int valor_fijo, boolean bloqueado, Comprador propietario, String tipo_pieza){
		
		
		this.titulo = titulo;
		this.anio = anio;
		this.lugar_creacion = creacion;
		this.autores = autores;
		this.valor_fijo = valor_fijo;
		this.bloqueado = bloqueado;
		this.propietario = propietario;
		this.tipo_pieza = tipo_pieza;
		this.codigo = generar_codigo();
		this.tiempo_ingreso = tiempo_ingreso();
		
	}
	
	public String tiempo_ingreso() {
		
		String UltimaActualizacion = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a")
                .format(LocalDateTime.now());
		
		return UltimaActualizacion;
			
	}
	
	public int generar_codigo() {
		
		int codigoGenerado = Math.abs(titulo.hashCode() + anio + lugar_creacion.hashCode() +
                autores.hashCode() + valor_fijo + (bloqueado ? 1 : 0) + propietario.hashCode() +
                tipo_pieza.hashCode() + tiempo_ingreso.hashCode());
        return codigoGenerado;
	}
	
}
