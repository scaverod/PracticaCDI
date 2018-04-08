package modelo;

public class Cuenta {

	private Gasto gasto;
	private String usuario;
	private String pwd;
	private Servicios servicios;
	private Idioma idioma;

	public enum Idioma {
		Ingles, Rumano, Castellano
	}

	public Cuenta(Gasto gasto, String usuario, String pwd, Servicios servicios, Idioma idioma) {
		super();
		this.gasto = gasto;
		this.usuario = usuario;
		this.pwd = pwd;
		this.servicios = servicios;
		this.idioma = idioma;
	}

	public Cuenta(String usuario, String pwd) {
		this.gasto = new Gasto();
		this.usuario = this.pwd = pwd;
		this.servicios = new Servicios();
	}

	public Servicios getServicios() {
		return servicios;
	}

	public void setServicios(Servicios servicios) {
		this.servicios = servicios;
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

}
