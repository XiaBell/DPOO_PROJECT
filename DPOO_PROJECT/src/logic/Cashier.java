package logic;

public class Cashier extends Usuario{
	
	private String nombre;
	private String apellido;
	private int cedula;

	public Cashier(String user, String pass, String rol, String actu, String nombre, String apellido, int cedula) {
		super(user, pass, rol, actu);
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	public String[] getcredentials() {
		
		String[] credentials = {Username, Password};
		
	}
}
