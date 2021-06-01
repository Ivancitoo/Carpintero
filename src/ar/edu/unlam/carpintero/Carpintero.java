package ar.edu.unlam.carpintero;

public class Carpintero {

	private String nombreCarpintero;
	private Puerta puerta;
	
	public Carpintero(String nombreCarpintero) {
	this.nombreCarpintero = nombreCarpintero;
	}

	public Carpintero(String nombreCarpintero, String contraseña1, String contraseña2, String contraseña3) {
		this.nombreCarpintero = nombreCarpintero;
		this.puerta = new Puerta(contraseña1, contraseña2, contraseña3, null);
	}


	public String getNombreCarpintero() {
		return nombreCarpintero;
	}

	public void setNombreCarpintero(String nombreCarpintero) {
		this.nombreCarpintero = nombreCarpintero;
	}

	
}
