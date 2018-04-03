package modelo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Wifi {

	private boolean activado;
	private double precio;
	private String pwd;

	public Wifi(boolean activado, double precio, String pwd) {
		this.activado = activado;
		this.precio = precio;
		this.pwd = pwd;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * Método que devuelve un String que es una contraseña aleatoria generada a
	 * partir del array de symbols. La longitud de la contraseña viene determinado
	 * por la variable lenght.
	 * 
	 * @return contraseña aleatoria
	 */
	public static String generarPwd() {
		String[] symbols = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y" };
		int length = 10;
		Random random = null;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int indexRandom = random.nextInt(symbols.length);
			sb.append(symbols[indexRandom]);
		}
		String pwd = sb.toString();
		return pwd;
	}

}
