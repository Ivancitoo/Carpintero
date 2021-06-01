package ar.edu.unlam.carpintero;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCarpintero {

	@Test
	public void verificarQueSePuedaCrearCarpintero() {
		Carpintero ivan = new Carpintero ("Ivan");
		assertNotNull(ivan);
		
		String valorEsperado= "Ivan";
		String valorObtenido = ivan.getNombreCarpintero();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void verificarQueSePuedaCrearLaPuerta() {
		Puerta puerta = new Puerta ( "contraseña1",  "contraseña2",  "contraseña3");
		assertNotNull(puerta);
	}
	
	@Test
	public void verificarCrearUsuarioYPuerta() {
		String nombreUsuario = "Ivan";
		String contraseña1 = "clave1";
		String contraseña2 = "clave2";
		String contraseña3 = "clave3";
	Carpintero ivan = new Carpintero("Ivan", "clave1", "clave2", "clave3");
	assertNotNull(ivan);
	}
	
	@Test
	public void verificarQueLaPrimerContraseñaEsCorrecta() {
		String contraseñaEsperada1 = "clave1";
		
		String nombreUsuario = "Ivan";
		String contraseña1 = "clave1";
		String contraseña2 = "clave2";
		String contraseña3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contraseña1, contraseña2, contraseña3);

		
		assertEquals(contraseñaEsperada1, contraseña1);	
	}
	
	@Test
	public void verificarQueLaSegundaContraseñaEsCorrecta() {
		String contraseñaEsperada2 = "clave2";
		
		String nombreUsuario = "Ivan";
		String contraseña1 = "clave1";
		String contraseña2 = "clave2";
		String contraseña3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contraseña1, contraseña2, contraseña3);

		
		assertEquals(contraseñaEsperada2, contraseña2);	
	}
	
	@Test
	public void verificarQueLaTercerContraseñaEsCorrecta() {
		String contraseñaEsperada3 = "clave3";
		
		String nombreUsuario = "Ivan";
		String contraseña1 = "clave1";
		String contraseña2 = "clave2";
		String contraseña3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contraseña1, contraseña2, contraseña3);

		
		assertEquals(contraseñaEsperada3, contraseña3);	
	}
	@Test
	public void verificarQueLaPuertaSeAbrio() {
		
	}

}
