package entities;

import java.util.ArrayList;

import logic.Cashier;
import logic.Comprador;
import logic.Empleado;
import logic.Operador;
import logic.admin;

public class Galeria {
	
	private static Inventario inventario;
	private static ArrayList<Subasta> subastas = new ArrayList<Subasta>();
	private static ArrayList<Pieza> piezas_exhibidas = new ArrayList<Pieza>();
	private static ArrayList<Pieza> piezas_bodegas = new ArrayList<Pieza>();
	private static admin administrador;
	private static ArrayList<Cashier> cajeros = new ArrayList<Cashier>();
	private static ArrayList<Operador> operadores = new ArrayList<Operador>();
	private static ArrayList<Comprador> compradores = new ArrayList<Comprador>();
	private static ArrayList<Comprador> propietarios = new ArrayList<Comprador>();
	
	
	
	public static ArrayList<Subasta> subastas(){
		return subastas;
	    }
	
	public static void setcajero(Cashier cajero) {
		
	   cajeros.add(cajero);
			
		}
		
    public static void setoperador(Operador operador) {
			
			operadores.add(operador);
		}

    public static void setcomprador(Comprador comprador) {
	
    	
    	compradores.add(comprador);
       }

    public static void setpropietario(Comprador propietario) {
	
    	propietarios.add(propietario);
	
       }

    public static void setadmin(admin admin) {
    	
    	administrador = admin;
      }	
    
    
		
	}

