package ar.edu.unlam.carpintero;

public class Carpintero {

	private String nombreCarpintero;
	private Puerta puerta;
	
	public Carpintero(String nombreCarpintero) {
	this.nombreCarpintero = nombreCarpintero;
	}

	public Carpintero(String nombreCarpintero, String contrase�a1, String contrase�a2, String contrase�a3) {
		this.nombreCarpintero = nombreCarpintero;
		this.puerta = new Puerta(contrase�a1, contrase�a2, contrase�a3, null);
	}


	public String getNombreCarpintero() {
		return nombreCarpintero;
	}

	public void setNombreCarpintero(String nombreCarpintero) {
		this.nombreCarpintero = nombreCarpintero;
	}

	
}
