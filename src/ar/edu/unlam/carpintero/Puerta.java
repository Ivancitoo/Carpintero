package ar.edu.unlam.carpintero;

public class Puerta {
	private String contrase�a1;
	private String contrase�a2;
	private String contrase�a3;
	private Boolean estaAbierta;
	
	public Puerta(String contrase�a1, String contrase�a2, String contrase�a3, Boolean estaAbierta) {
	
		this.contrase�a1 = contrase�a1;
		this.contrase�a2 = contrase�a2;
		this.contrase�a3 = contrase�a3;
		this.setEstaAbierta(false);
	}

	public String getContrase�a1() {
		return contrase�a1;
	}

	public void setContrase�a1(String contrase�a1) {
		this.contrase�a1 = contrase�a1;
	}

	public String getContrase�a2() {
		return contrase�a2;
	}

	public void setContrase�a2(String contrase�a2) {
		this.contrase�a2 = contrase�a2;
	}

	public String getContrase�a3() {
		return contrase�a3;
	}

	public void setContrase�a3(String contrase�a3) {
		this.contrase�a3 = contrase�a3;
	}

	public Boolean getEstaAbierta() {
		return estaAbierta;
	}

	public Boolean setEstaAbierta(Boolean estaAbierta) {
		if(this.contrase�a1 == contrase�a1 && this.contrase�a2 == contrase�a2 && this.contrase�a3 == contrase�a3) {
			return true;
		}
		return false;
		
	}
	
	
}
