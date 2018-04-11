package modelo;

public abstract class Texto {
	// Comunes
	private String btnAceptar;
	private String btnCerrar;

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

	// Panel Emergente Informacion
	private String btnAdquirir;
	private String txtInformacion;
	private String lblCoste;

	// Panel Emergente Televisión
	private String panelServiciosEmergenteTelevisionTxt;
	// Panel Emergente Wifi
	private String panelServiciosEmergenteWifiTxt;
	private String panelServiciosEmergenteWifiActivadoTxt;
	private String panelServiciosEmergenteWifiPwdTxt;

	// Panel Emergente Taxi
	private String panelServiciosEmergenteTaxiTxt;

	// Panel Usuario
	private String lblCuentaHabitacion;
	// TODO: pendiente de que se haga primero el panel usuario

	// Panel confirmacion
	private String lblConfirmacion;

	protected void placeHolderParaQueMePongaGettersYSettersAbajoEquisde() {
	}

	public void setBtnAceptar(String btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public void setBtnCerrar(String btnCerrar) {
		this.btnCerrar = btnCerrar;
	}

	public void setLoginIniciaSesion(String loginIniciaSesion) {
		this.loginIniciaSesion = loginIniciaSesion;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public void setLoginUsuarioToolTip(String loginUsuarioToolTip) {
		this.loginUsuarioToolTip = loginUsuarioToolTip;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public void setLoginPasswordToolTip(String loginPasswordToolTip) {
		this.loginPasswordToolTip = loginPasswordToolTip;
	}

	public void setLoginBtnAceptar(String loginBtnAceptar) {
		this.loginBtnAceptar = loginBtnAceptar;
	}

	public void setLoginErrorMensaje(String loginErrorMensaje) {
		this.loginErrorMensaje = loginErrorMensaje;
	}

	public void setLoginErrorTitulo(String loginErrorTitulo) {
		this.loginErrorTitulo = loginErrorTitulo;
	}

	public void setMenuPrincipalBtnHabitacion(String menuPrincipalBtnHabitacion) {
		this.menuPrincipalBtnHabitacion = menuPrincipalBtnHabitacion;
	}

	public void setMenuPrincipalBtnSpa(String menuPrincipalBtnSpa) {
		this.menuPrincipalBtnSpa = menuPrincipalBtnSpa;
	}

	public void setMenuPrincipalBtnServicios(String menuPrincipalBtnServicios) {
		this.menuPrincipalBtnServicios = menuPrincipalBtnServicios;
	}

	public void setMenuPrincipalBtnCuenta(String menuPrincipalBtnCuenta) {
		this.menuPrincipalBtnCuenta = menuPrincipalBtnCuenta;
	}

	public void setPanelServiciosBtnMinibar(String panelServiciosBtnMinibar) {
		this.panelServiciosBtnMinibar = panelServiciosBtnMinibar;
	}

	public void setPanelServiciosBtnCambioToalla(String panelServiciosBtnCambioToalla) {
		this.panelServiciosBtnCambioToalla = panelServiciosBtnCambioToalla;
	}

	public void setPanelServiciosBtnTelefono(String panelServiciosBtnTelefono) {
		this.panelServiciosBtnTelefono = panelServiciosBtnTelefono;
	}

	public void setPanelServiciosBtnHorarioLimpieza(String panelServiciosBtnHorarioLimpieza) {
		this.panelServiciosBtnHorarioLimpieza = panelServiciosBtnHorarioLimpieza;
	}

	public void setPanelServiciosBtnBotones(String panelServiciosBtnBotones) {
		this.panelServiciosBtnBotones = panelServiciosBtnBotones;
	}

	public void setPanelServiciosBtnCambioAlmohada(String panelServiciosBtnCambioAlmohada) {
		this.panelServiciosBtnCambioAlmohada = panelServiciosBtnCambioAlmohada;
	}

	public void setPanelServiciosBtnCambiarSabanas(String panelServiciosBtnCambiarSabanas) {
		this.panelServiciosBtnCambiarSabanas = panelServiciosBtnCambiarSabanas;
	}

	public void setPanelServiciosBtnComidaHab(String panelServiciosBtnComidaHab) {
		this.panelServiciosBtnComidaHab = panelServiciosBtnComidaHab;
	}

	public void setPanelServiciosBtnPedirTaxi(String panelServiciosBtnPedirTaxi) {
		this.panelServiciosBtnPedirTaxi = panelServiciosBtnPedirTaxi;
	}

	public void setPanelServiciosBtnTelevision(String panelServiciosBtnTelevision) {
		this.panelServiciosBtnTelevision = panelServiciosBtnTelevision;
	}

	public void setPanelServiciosBtnWifi(String panelServiciosBtnWifi) {
		this.panelServiciosBtnWifi = panelServiciosBtnWifi;
	}

	public void setPanelServiciosBtnInformacion(String panelServiciosBtnInformacion) {
		this.panelServiciosBtnInformacion = panelServiciosBtnInformacion;
	}

	public void setCerrar(String cerrar) {
		this.cerrar = cerrar;
	}

	public void setBtnAdquirir(String btnAdquirir) {
		this.btnAdquirir = btnAdquirir;
	}

	public void setTxtInformacion(String txtInformacion) {
		this.txtInformacion = txtInformacion;
	}

	public void setLblCoste(String lblCoste) {
		this.lblCoste = lblCoste;
	}

	public void setPanelServiciosEmergenteTelevisionTxt(String panelServiciosEmergenteTelevisionTxt) {
		this.panelServiciosEmergenteTelevisionTxt = panelServiciosEmergenteTelevisionTxt;
	}

	public void setPanelServiciosEmergenteWifiTxt(String panelServiciosEmergenteWifiTxt) {
		this.panelServiciosEmergenteWifiTxt = panelServiciosEmergenteWifiTxt;
	}

	public void setLblConfirmacion(String lblConfirmacion) {
		this.lblConfirmacion = lblConfirmacion;
	}

	public String getBtnAceptar() {
		return btnAceptar;
	}

	public String getBtnCerrar() {
		return btnCerrar;
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

	public String getCerrar() {
		return cerrar;
	}

	public String getBtnAdquirir() {
		return btnAdquirir;
	}

	public String getTxtInformacion() {
		return txtInformacion;
	}

	public String getLblCoste() {
		return lblCoste;
	}

	public String getPanelServiciosEmergenteTelevisionTxt() {
		return panelServiciosEmergenteTelevisionTxt;
	}

	public String getPanelServiciosEmergenteWifiTxt() {
		return panelServiciosEmergenteWifiTxt;
	}

	public String getLblConfirmacion() {
		return lblConfirmacion;
	}

	public String getPanelServiciosEmergenteWifiActivadoTxt() {
		return panelServiciosEmergenteWifiActivadoTxt;
	}

	public void setPanelServiciosEmergenteWifiActivadoTxt(String panelServiciosEmergenteWifiActivadoTxt) {
		this.panelServiciosEmergenteWifiActivadoTxt = panelServiciosEmergenteWifiActivadoTxt;
	}

	public String getPanelServiciosEmergenteWifiPwdTxt() {
		return panelServiciosEmergenteWifiPwdTxt;
	}

	public void setPanelServiciosEmergenteWifiPwdTxt(String panelServiciosEmergenteWifiPwdTxt) {
		this.panelServiciosEmergenteWifiPwdTxt = panelServiciosEmergenteWifiPwdTxt;
	}

	public String getPanelServiciosEmergenteTaxiTxt() {
		return panelServiciosEmergenteTaxiTxt;
	}

	public void setPanelServiciosEmergenteTaxiTxt(String panelServiciosEmergenteTaxiTxt) {
		this.panelServiciosEmergenteTaxiTxt = panelServiciosEmergenteTaxiTxt;
	}

	public String getLblCuentaHabitacion() {
		return lblCuentaHabitacion;
	}

	public void setLblCuentaHabitacion(String lblCuentaHabitacion) {
		this.lblCuentaHabitacion = lblCuentaHabitacion;
	}
}
