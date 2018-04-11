package idiomas;

public class TextoManager {
	public static final String español = "ESP";
	public static final String english = "ENG";
	public static final String romana = "RO";
	
	String idioma;
	
	Texto t;
	
	public TextoManager(String idioma) {
		this.idioma = idioma;
		
		switch (idioma) {
			case español:
				t = new TextoEsp();
				break;
			case romana:
				t = new TextoRo();
				break;
			default:
				t = new TextoEng();
				break;
		}
	}
	
	public void getIdiomas() {
		
	}
	
	public Texto getTexto() {
		return t;
	}
}