package ar.edu.unlam.carpintero;

public class Puerta {
	private String contraseña1;
	private String contraseña2;
	private String contraseña3;
	private Boolean estaAbierta;
	
	public Puerta(String contraseña1, String contraseña2, String contraseña3, Boolean estaAbierta) {
	
		this.contraseña1 = contraseña1;
		this.contraseña2 = contraseña2;
		this.contraseña3 = contraseña3;
		this.setEstaAbierta(false);
	}

	public String getContraseña1() {
		return contraseña1;
	}

	public void setContraseña1(String contraseña1) {
		this.contraseña1 = contraseña1;
	}

	public String getContraseña2() {
		return contraseña2;
	}

	public void setContraseña2(String contraseña2) {
		this.contraseña2 = contraseña2;
	}

	public String getContraseña3() {
		return contraseña3;
	}

	public void setContraseña3(String contraseña3) {
		this.contraseña3 = contraseña3;
	}

	public Boolean getEstaAbierta() {
		return estaAbierta;
	}

	public Boolean setEstaAbierta(Boolean estaAbierta) {
		if(this.contraseña1 == contraseña1 && this.contraseña2 == contraseña2 && this.contraseña3 == contraseña3) {
			return true;
		}
		return false;
		
	}
	
	
}
