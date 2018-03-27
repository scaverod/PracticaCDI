package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Texto {
	public static String español = "ESP";
	public static String english = "ENG";
	public static String romana = "RO";
	
	String idioma;
	String[] mensajes;
	
	public Texto(String idioma) {
		this.idioma = idioma;
	}
	
	public void getIdiomas() {
		try {
			Stream s = Files.list(Paths.get("Z:\\PracticaCDI\\SimuladorHotel\\src\\iconos"));
			Object[] a = s.toArray();
			for (int i = 0 ; i < a.length ; i++)
				System.out.println(a[i].toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}