package pio.daw.sfb.ProyMaven;

public class PwServiceSFBTest {

	public static void main(String[] args) {
		PwServiceSFB servicio = new PwServiceSFB();
		String password = "top5password";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno Sergio Fernández");
		System.out.println("La contraseña encriptada es: "+passwordEncriptada);
		
		
		//Verificación
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es válida: "+esValida);
	}

}
