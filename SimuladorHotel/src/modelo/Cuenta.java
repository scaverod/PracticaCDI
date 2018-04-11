package modelo;

public class Cuenta {

	private Gasto gasto;
	private String usuario;
	private String pwd;
	private Idioma idioma;
	private Personalizacion personalizacion;

	public enum Idioma {
		Ingles, Rumano, Castellano
	}

	public Cuenta(Gasto gasto, String usuario, String pwd, Idioma idioma, Personalizacion personalizacion) {
		super();
		this.gasto = gasto;
		this.usuario = usuario;
		this.pwd = pwd;
		this.idioma = idioma;
		this.setPersonalizacion(personalizacion);
	}

	public Cuenta(String usuario, String pwd) {
		this.gasto = new Gasto();
		this.usuario =  usuario;
		this.pwd = pwd;
		this.setPersonalizacion(new Personalizacion(false, false, false, false));

	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Personalizacion getPersonalizacion() {
		return personalizacion;
	}

	public void setPersonalizacion(Personalizacion personalizacion) {
		this.personalizacion = personalizacion;
	}

}
