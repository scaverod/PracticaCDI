package modelo;

public class Texto {
	public static String español = "ESP";
	public static String english = "ENG";
	public static String romana = "RO";
	
	String idioma;
	String[] mensajes;
	
	public Texto(String idioma) {
		this.idioma = idioma;
	}
}