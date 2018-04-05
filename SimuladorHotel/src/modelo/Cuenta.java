package modelo;

public class Cuenta {

	private Gasto gasto;
	private String usuario;
	private String pwd;
	private Servicios servicios;
	
	

	public Cuenta(String usuario, String pwd) {
		this.gasto = new Gasto();
		this.usuario =
		this.pwd = pwd;
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

}
