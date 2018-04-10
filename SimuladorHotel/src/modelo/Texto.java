package modelo;

public abstract class Texto {
	// Panel login
	private String loginIniciaSesion;
	private String loginUsuario;
	private String loginUsuarioToolTip;
	private String loginPassword;
	private String loginPasswordToolTip;
	private String loginBtnAceptar;
	private String loginErrorMensaje;
	private String loginErrorTitulo;
	
	// Menu principal
	private String menuPrincipalBtnHabitacion;
	private String menuPrincipalBtnSpa;
	private String menuPrincipalBtnServicios;
	private String menuPrincipalBtnCuenta;
	
	// Panel Habitacion
	// TODO: pendiente de que se haga primero el panel habitacion
	
	// Panel Spa
	// TODO: pendiente de que se haga aprimero el panel spa
	
	// Panel Servicios
	private String panelServiciosBtnMinibar;
	private String panelServiciosBtnCambioToalla;
	private String panelServiciosBtnTelefono;
	private String panelServiciosBtnHorarioLimpieza;
	private String panelServiciosBtnBotones;
	private String panelServiciosBtnCambioAlmohada;
	private String panelServiciosBtnCambiarSabanas;
	private String panelServiciosBtnComidaHab;
	private String panelServiciosBtnPedirTaxi;
	private String panelServiciosBtnTelevision;
	private String panelServiciosBtnWifi;
	private String panelServiciosBtnInformacion;
	private String cerrar;
	
	//Panel Emergente Informacion
	private String btnAdquirir;
	private String txtInformacion;
	private String lblCoste;
	private String panelServiciosEmergenteTelevisionTxt;
	private String panelServiciosEmergenteWifiTxt;
	
	// Panel Usuario
	// TODO: pendiente de que se haga primero el panel usuario
	
	protected void placeHolderParaQueMePongaGettersYSettersAbajoEquisde() {
	}

	public String getLoginIniciaSesion() {
		return loginIniciaSesion;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public String getLoginUsuarioToolTip() {
		return loginUsuarioToolTip;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public String getLoginPasswordToolTip() {
		return loginPasswordToolTip;
	}

	public String getLoginBtnAceptar() {
		return loginBtnAceptar;
	}

	public String getLoginErrorMensaje() {
		return loginErrorMensaje;
	}

	public String getLoginErrorTitulo() {
		return loginErrorTitulo;
	}

	public String getMenuPrincipalBtnHabitacion() {
		return menuPrincipalBtnHabitacion;
	}

	public String getMenuPrincipalBtnSpa() {
		return menuPrincipalBtnSpa;
	}

	public String getMenuPrincipalBtnServicios() {
		return menuPrincipalBtnServicios;
	}

	public String getMenuPrincipalBtnCuenta() {
		return menuPrincipalBtnCuenta;
	}

	public String getPanelServiciosBtnMinibar() {
		return panelServiciosBtnMinibar;
	}

	public String getPanelServiciosBtnCambioToalla() {
		return panelServiciosBtnCambioToalla;
	}

	public String getPanelServiciosBtnTelefono() {
		return panelServiciosBtnTelefono;
	}

	public String getPanelServiciosBtnHorarioLimpieza() {
		return panelServiciosBtnHorarioLimpieza;
	}

	public String getPanelServiciosBtnBotones() {
		return panelServiciosBtnBotones;
	}

	public String getPanelServiciosBtnCambioAlmohada() {
		return panelServiciosBtnCambioAlmohada;
	}

	protected void setLoginIniciaSesion(String loginIniciaSesion) {
		this.loginIniciaSesion = loginIniciaSesion;
	}

	protected void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	protected void setLoginUsuarioToolTip(String loginUsuarioToolTip) {
		this.loginUsuarioToolTip = loginUsuarioToolTip;
	}

	protected void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	protected void setLoginPasswordToolTip(String loginPasswordToolTip) {
		this.loginPasswordToolTip = loginPasswordToolTip;
	}

	protected void setLoginBtnAceptar(String loginBtnAceptar) {
		this.loginBtnAceptar = loginBtnAceptar;
	}

	protected void setLoginErrorMensaje(String loginErrorMensaje) {
		this.loginErrorMensaje = loginErrorMensaje;
	}

	protected void setLoginErrorTitulo(String loginErrorTitulo) {
		this.loginErrorTitulo = loginErrorTitulo;
	}

	protected void setMenuPrincipalBtnHabitacion(String menuPrincipalBtnHabitacion) {
		this.menuPrincipalBtnHabitacion = menuPrincipalBtnHabitacion;
	}

	protected void setMenuPrincipalBtnSpa(String menuPrincipalBtnSpa) {
		this.menuPrincipalBtnSpa = menuPrincipalBtnSpa;
	}

	protected void setMenuPrincipalBtnServicios(String menuPrincipalBtnServicios) {
		this.menuPrincipalBtnServicios = menuPrincipalBtnServicios;
	}

	protected void setMenuPrincipalBtnCuenta(String menuPrincipalBtnCuenta) {
		this.menuPrincipalBtnCuenta = menuPrincipalBtnCuenta;
	}

	protected void setPanelServiciosBtnMinibar(String panelServiciosBtnMinibar) {
		this.panelServiciosBtnMinibar = panelServiciosBtnMinibar;
	}

	protected void setPanelServiciosBtnCambioToalla(String panelServiciosBtnCambioToalla) {
		this.panelServiciosBtnCambioToalla = panelServiciosBtnCambioToalla;
	}

	protected void setPanelServiciosBtnTelefono(String panelServiciosBtnTelefono) {
		this.panelServiciosBtnTelefono = panelServiciosBtnTelefono;
	}

	protected void setPanelServiciosBtnHorarioLimpieza(String panelServiciosBtnHorarioLimpieza) {
		this.panelServiciosBtnHorarioLimpieza = panelServiciosBtnHorarioLimpieza;
	}

	protected void setPanelServiciosBtnBotones(String panelServiciosBtnBotones) {
		this.panelServiciosBtnBotones = panelServiciosBtnBotones;
	}

	protected void setPanelServiciosBtnCambioAlmohada(String panelServiciosBtnCambioAlmohada) {
		this.panelServiciosBtnCambioAlmohada = panelServiciosBtnCambioAlmohada;
	}

	protected void setPanelServiciosBtnCambiarSabanas(String panelServiciosBtnCambiarSabanas) {
		this.panelServiciosBtnCambiarSabanas = panelServiciosBtnCambiarSabanas;
	}

	protected void setPanelServiciosBtnComidaHab(String panelServiciosBtnComidaHab) {
		this.panelServiciosBtnComidaHab = panelServiciosBtnComidaHab;
	}

	protected void setPanelServiciosBtnPedirTaxi(String panelServiciosBtnPedirTaxi) {
		this.panelServiciosBtnPedirTaxi = panelServiciosBtnPedirTaxi;
	}

	protected void setPanelServiciosBtnTelevision(String panelServiciosBtnTelevision) {
		this.panelServiciosBtnTelevision = panelServiciosBtnTelevision;
	}

	protected void setPanelServiciosBtnWifi(String panelServiciosBtnWifi) {
		this.panelServiciosBtnWifi = panelServiciosBtnWifi;
	}

	protected void setPanelServiciosBtnInformacion(String panelServiciosBtnInformacion) {
		this.panelServiciosBtnInformacion = panelServiciosBtnInformacion;
	}

	public String getPanelServiciosBtnCambiarSabanas() {
		return panelServiciosBtnCambiarSabanas;
	}

	public String getPanelServiciosBtnComidaHab() {
		return panelServiciosBtnComidaHab;
	}

	public String getPanelServiciosBtnPedirTaxi() {
		return panelServiciosBtnPedirTaxi;
	}

	public String getPanelServiciosBtnTelevision() {
		return panelServiciosBtnTelevision;
	}

	public String getPanelServiciosBtnWifi() {
		return panelServiciosBtnWifi;
	}

	public String getPanelServiciosBtnInformacion() {
		return panelServiciosBtnInformacion;
	}

	public String getBtnAdquirir() {
		return btnAdquirir;
	}

	public void setBtnAdquirir(String btnAdquirir) {
		this.btnAdquirir = btnAdquirir;
	}

	public String getTxtInformacion() {
		return txtInformacion;
	}

	public void setTxtInformacion(String txtInformacion) {
		this.txtInformacion = txtInformacion;
	}

	public String getLblCoste() {
		return lblCoste;
	}

	public void setLblCoste(String lblCoste) {
		this.lblCoste = lblCoste;
	}

	public String getCerrar() {
		return cerrar;
	}

	public void setCerrar(String cerrar) {
		this.cerrar = cerrar;
	}

	public String getPanelServiciosEmergenteTelevisionTxt() {
		return panelServiciosEmergenteTelevisionTxt;
	}

	public void setPanelServiciosEmergenteTelevisionTxt(String panelServiciosEmergenteTelevisionTxt) {
		this.panelServiciosEmergenteTelevisionTxt = panelServiciosEmergenteTelevisionTxt;
	}

	public String getPanelServiciosEmergenteWifiTxt() {
		return panelServiciosEmergenteWifiTxt;
	}

	public void setPanelServiciosEmergenteWifiTxt(String panelServiciosEmergenteWifiTxt) {
		this.panelServiciosEmergenteWifiTxt = panelServiciosEmergenteWifiTxt;
	}
}