package pio.daw.sfb.ProyMaven;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceSFB {
		
	private BasicPasswordEncryptor passwordEncryptor;
	public PwServiceSFB() {
		this.passwordEncryptor = new BasicPasswordEncryptor();
	}
	
	public String encriptarContrasena (String contrasena) {
		return passwordEncryptor.encryptPassword(contrasena);
	}
	
	public boolean verificarContrasena (String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
	}
}
