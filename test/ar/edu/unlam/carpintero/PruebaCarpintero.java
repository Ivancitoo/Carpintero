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
		Puerta puerta = new Puerta ( "contrase�a1",  "contrase�a2",  "contrase�a3");
		assertNotNull(puerta);
	}
	
	@Test
	public void verificarCrearUsuarioYPuerta() {
		String nombreUsuario = "Ivan";
		String contrase�a1 = "clave1";
		String contrase�a2 = "clave2";
		String contrase�a3 = "clave3";
	Carpintero ivan = new Carpintero("Ivan", "clave1", "clave2", "clave3");
	assertNotNull(ivan);
	}
	
	@Test
	public void verificarQueLaPrimerContrase�aEsCorrecta() {
		String contrase�aEsperada1 = "clave1";
		
		String nombreUsuario = "Ivan";
		String contrase�a1 = "clave1";
		String contrase�a2 = "clave2";
		String contrase�a3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contrase�a1, contrase�a2, contrase�a3);

		
		assertEquals(contrase�aEsperada1, contrase�a1);	
	}
	
	@Test
	public void verificarQueLaSegundaContrase�aEsCorrecta() {
		String contrase�aEsperada2 = "clave2";
		
		String nombreUsuario = "Ivan";
		String contrase�a1 = "clave1";
		String contrase�a2 = "clave2";
		String contrase�a3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contrase�a1, contrase�a2, contrase�a3);

		
		assertEquals(contrase�aEsperada2, contrase�a2);	
	}
	
	@Test
	public void verificarQueLaTercerContrase�aEsCorrecta() {
		String contrase�aEsperada3 = "clave3";
		
		String nombreUsuario = "Ivan";
		String contrase�a1 = "clave1";
		String contrase�a2 = "clave2";
		String contrase�a3 = "clave3";
	Carpintero ivan = new Carpintero(nombreUsuario, contrase�a1, contrase�a2, contrase�a3);

		
		assertEquals(contrase�aEsperada3, contrase�a3);	
	}
	@Test
	public void verificarQueLaPuertaSeAbrio() {
		
	}

}
