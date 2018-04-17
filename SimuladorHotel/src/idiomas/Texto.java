package idiomas;

public abstract class Texto {
	// Comunes
	private String btnAceptar;
	private String btnCerrar;
	private String btnCancelar;

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

	// Panel Emergente Informacion
	private String btnAdquirir;
	private String txtInformacion;
	private String lblCoste;

	// Panel Emergente TelevisiÃ³n
	private String panelServiciosEmergenteTelevisionTxt;
	// Panel Emergente Wifi
	private String panelServiciosEmergenteWifiTxt;
	private String panelServiciosEmergenteWifiActivadoTxt;
	private String panelServiciosEmergenteWifiPwdTxt;

	// Panel Emergente Wifi
	private String panelServiciosEmergenteBotonesTxt;

	// Panel Emergente Almohada
	private String panelServiciosEmergentealmohadaLatex;
	private String panelServiciosEmergentealmohadaVisco;
	private String panelServiciosEmergentealmohadaGel;
	private String panelServiciosEmergentealmohadaPluma;
	private String panelServiciosEmergentealmohadaTxt;

	// Panel Emergente Taxi
	private String panelServiciosEmergenteTaxiTxt;
	
	//Panel Emergente Comida
	private String panelServiciosEmergenteComidaTxt;

	//Panel Emergente Toallas
	private String panelServiciosEmergenteToallasTxt;
	//Panel Emergente Minibar
	private String panelServiciosEmergenteMinibarTxt;
	
	// Panel Usuario
	private String lblCuentaHabitacion;
	private String lblElegirIdioma;
	private String lblCastellano;
	private String lblIngles;
	private String lblRumano;
	// Voy por aquí
	private String lblGasto;
	private String btnMsDetalles;
	private String lblGastoTotal;
	private String lblPersonalizar;
	private String lblModoNocturno;
	private String lblInvertirColores;
	private String lblSalidaTexto;
	private String lblAumentarTexto;

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

	public String getLblElegirIdioma() {
		return lblElegirIdioma;
	}

	public void setLblElegirIdioma(String lblElegirIdioma) {
		this.lblElegirIdioma = lblElegirIdioma;
	}

	public String getLblCastellano() {
		return lblCastellano;
	}

	public void setLblCastellano(String lblCastellano) {
		this.lblCastellano = lblCastellano;
	}

	public String getLblIngles() {
		return lblIngles;
	}

	public void setLblIngles(String lblIngles) {
		this.lblIngles = lblIngles;
	}

	public String getLblRumano() {
		return lblRumano;
	}

	public void setLblRumano(String lblRumano) {
		this.lblRumano = lblRumano;
	}

	public String getLblGasto() {
		return lblGasto;
	}

	public void setLblGasto(String lblGasto) {
		this.lblGasto = lblGasto;
	}

	public String getBtnMsDetalles() {
		return btnMsDetalles;
	}

	public void setBtnMsDetalles(String btnMsDetalles) {
		this.btnMsDetalles = btnMsDetalles;
	}

	public String getLblGastoTotal() {
		return lblGastoTotal;
	}

	public void setLblGastoTotal(String lblGastoTotal) {
		this.lblGastoTotal = lblGastoTotal;
	}

	public String getLblPersonalizar() {
		return lblPersonalizar;
	}

	public void setLblPersonalizar(String lblPersonalizar) {
		this.lblPersonalizar = lblPersonalizar;
	}

	public String getLblModoNocturno() {
		return lblModoNocturno;
	}

	public void setLblModoNocturno(String lblModoNocturno) {
		this.lblModoNocturno = lblModoNocturno;
	}

	public String getLblInvertirColores() {
		return lblInvertirColores;
	}

	public void setLblInvertirColores(String lblInvertirColores) {
		this.lblInvertirColores = lblInvertirColores;
	}

	public String getLblSalidaTexto() {
		return lblSalidaTexto;
	}

	public void setLblSalidaTexto(String lblSalidaTexto) {
		this.lblSalidaTexto = lblSalidaTexto;
	}

	public String getLblAumentarTexto() {
		return lblAumentarTexto;
	}

	public void setLblAumentarTexto(String lblAumentarTexto) {
		this.lblAumentarTexto = lblAumentarTexto;
	}

	public String getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(String btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public String getPanelServiciosEmergenteBotonesTxt() {
		return panelServiciosEmergenteBotonesTxt;
	}

	public void setPanelServiciosEmergenteBotonesTxt(String panelServiciosEmergenteBotonesTxt) {
		this.panelServiciosEmergenteBotonesTxt = panelServiciosEmergenteBotonesTxt;
	}

	public String getPanelServiciosEmergentealmohadaLatex() {
		return panelServiciosEmergentealmohadaLatex;
	}

	public void setPanelServiciosEmergentealmohadaLatex(String panelServiciosEmergentealmohadaLatex) {
		this.panelServiciosEmergentealmohadaLatex = panelServiciosEmergentealmohadaLatex;
	}

	public String getPanelServiciosEmergentealmohadaVisco() {
		return panelServiciosEmergentealmohadaVisco;
	}

	public void setPanelServiciosEmergentealmohadaVisco(String panelServiciosEmergentealmohadaVisco) {
		this.panelServiciosEmergentealmohadaVisco = panelServiciosEmergentealmohadaVisco;
	}

	public String getPanelServiciosEmergentealmohadaPluma() {
		return panelServiciosEmergentealmohadaPluma;
	}

	public void setPanelServiciosEmergentealmohadaPluma(String panelServiciosEmergentealmohadaPluma) {
		this.panelServiciosEmergentealmohadaPluma = panelServiciosEmergentealmohadaPluma;
	}

	public String getPanelServiciosEmergentealmohadaTxt() {
		return panelServiciosEmergentealmohadaTxt;
	}

	public void setPanelServiciosEmergentealmohadaTxt(String panelServiciosEmergentealmohadaTxt) {
		this.panelServiciosEmergentealmohadaTxt = panelServiciosEmergentealmohadaTxt;
	}

	public String getPanelServiciosEmergentealmohadaGel() {
		return panelServiciosEmergentealmohadaGel;
	}

	public void setPanelServiciosEmergentealmohadaGel(String panelServiciosEmergentealmohadaGel) {
		this.panelServiciosEmergentealmohadaGel = panelServiciosEmergentealmohadaGel;
	}

	public String getPanelServiciosEmergenteComidaTxt() {
		return panelServiciosEmergenteComidaTxt;
	}

	public void setPanelServiciosEmergenteComidaTxt(String panelServiciosEmergenteComidaTxt) {
		this.panelServiciosEmergenteComidaTxt = panelServiciosEmergenteComidaTxt;
	}

	public String getPanelServiciosEmergenteToallasTxt() {
		return panelServiciosEmergenteToallasTxt;
	}

	public void setPanelServiciosEmergenteToallasTxt(String panelServiciosEmergenteToallasTxt) {
		this.panelServiciosEmergenteToallasTxt = panelServiciosEmergenteToallasTxt;
	}

	public String getPanelServiciosEmergenteMinibarTxt() {
		return panelServiciosEmergenteMinibarTxt;
	}

	public void setPanelServiciosEmergenteMinibarTxt(String panelServiciosEmergenteMinibarTxt) {
		this.panelServiciosEmergenteMinibarTxt = panelServiciosEmergenteMinibarTxt;
	}
}
