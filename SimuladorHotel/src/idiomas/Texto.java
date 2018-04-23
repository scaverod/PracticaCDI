/*

The following notices can be found in each source file.

Copyright (C) 2018 EquipoSPA:
	David Herrero Pascual	- GitHub: Deividhp13
	Antonio Castro Blanco	- GitHub: Castrum38
	Radu Dumitru Boboia		- GitHub: rdboboia
	Sergio Cavero Díaz		- GitHub: scaverod

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

You can contact us at our GitHub written above.

To see the full license, check:
https://github.com/scaverod/PracticaCDI/blob/master/LICENSE

*/

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
	private String loginInfoTitulo;
	private String loginInfoMensaje;

	// Menu principal
	private String menuPrincipalBtnHabitacion;
	private String menuPrincipalBtnSpa;
	private String menuPrincipalBtnServicios;
	private String menuPrincipalBtnCuenta;

	// Panel Habitacion
	// Panel Habitacion Emergente Alarma
	private String lblLunes;
	private String lblMartes;
	private String lblMiercoles;
	private String lblJueves;
	private String lblViernes;
	private String lblSabado;
	private String lblDomingo;
	private String txtrParaEmpezarA;
	// Panel Habitación Emergente Calefaccion
	private String lblTituloTemperatura;
	private String lblControlManual;
	private String btnActivar;
	private String btnDesactivar;
	private String lblInicio;
	private String lblProgramacionAutomatica;
	// Panel Habitacion Emergente Jacuzzi
	private String lblControlJacuzzi;
	private String lblBurbujas;
	private String lblTemperatura;
	private String lblAgua;
	private String lblLlenar;
	private String lblVaciar;
	// Panel Habitacion Emergente Ayuda
	private String txtTip1;
	private String txtTip2;
	private String txtTip3;
	// Panel Habitacion Emergente Ventana
	private String lblControlVentana;
	private String lblVentana;
	private String lblPersianas;
	private String btnAbrir;

	// TODO: pendiente de que se haga primero el panel habitacion

	// Panel Spa
	private String lblTratamiento;
	private String lblSeleccionTratamiento;
	private String lblDuracion;
	private String lblLugar;
	private String lblEmpleado;
	private String btnFecha;
	private String btnHora;
	private String lblPlazas;
	private String lblSpa;
	private String lblSeleccionServicio;
	private String lblNumeroPersonas;
	private String strPersonas;
	private String strPersona;
	// Panel Spa EMERGENTE
	private String lblTxtSpaTitulo;
	

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

	// Panel Emergente Televisión
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

	// Panel Emergente Comida
	private String panelServiciosEmergenteComidaTxt;

	// Panel Emergente Toallas
	private String panelServiciosEmergenteToallasTxt;

	// Panel Emergente Minibar
	private String panelServiciosEmergenteMinibarTxt;

	// Panel Emergente Sabanas
	private String panelServiciosEmergenteSabanasTxt;

	// Panel Emergente Limpieza
	private String panelServiciosEmergenteLimpiezaTxt;
	private String panelServiciosEmergenteLimpiezaTxtUnaVezHaya;
	private String panelServiciosEmergenteLimpiezaBtnCambiar;
	
	// Panel Emergente Telefono
	private String panelServiciosEmergenteTelefonoTxt;
	private String panelServiciosEmergenteTelefonobtnConfirmarLLamada;

	// Panel Usuario
	private String lblCuentaHabitacion;
	private String lblElegirIdioma;
	private String lblCastellano;
	private String lblIngles;
	private String lblRumano;
	private String lblGasto;
	private String btnMsDetalles;
	private String lblGastoTotal;
	private String lblPersonalizar;
	private String lblModoNocturno;
	private String lblInvertirColores;
	private String lblSalidaTexto;
	private String lblAumentarTexto;
	private String lblListaDeGastos;

	// Panel confirmacion
	private String lblConfirmacion;

	// Panel Cuenta Emergente Detalles
	private String strNingunServicio;

	// Panel lista de gastos. (Provisional hasta que comprenda)
	private String Facial;
	private String Thai;
	private String Sueco;
	private String Termal;
	private String Turco;
	private String Toallas;
	private String Sabanas;
	private String Viscoelastica;
	private String Latex;
	private String Pluma;
	private String Gel;
	private String MiniBar;
	private String Europa;
	private String Asia;
	private String America;
	private String Africa;
	private String Botones;
	private String Comida;
	private String HoraLimpieza;
	private String WiFi;
	private String Netflix;
	private String Movistar;
	private String BBC;
	private String Bein;
	private String Info;

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

	public String getLblListaDeGastos() {
		return lblListaDeGastos;
	}

	public void setLblListaDeGastos(String lblListaDeGastos) {
		this.lblListaDeGastos = lblListaDeGastos;
	}

	public String getPanelServiciosEmergenteSabanasTxt() {
		return panelServiciosEmergenteSabanasTxt;
	}

	public void setPanelServiciosEmergenteSabanasTxt(String panelServiciosEmergenteSabanasTxt) {
		this.panelServiciosEmergenteSabanasTxt = panelServiciosEmergenteSabanasTxt;
	}

	public String getLblTratamiento() {
		return lblTratamiento;
	}

	public void setLblTratamiento(String lblTratamiento) {
		this.lblTratamiento = lblTratamiento;
	}

	public String getLblSeleccionTratamiento() {
		return lblSeleccionTratamiento;
	}

	public void setLblSeleccionTratamiento(String lblSeleccionTratamiento) {
		this.lblSeleccionTratamiento = lblSeleccionTratamiento;
	}

	public String getLblDuracion() {
		return lblDuracion;
	}

	public void setLblDuracion(String lblDuracion) {
		this.lblDuracion = lblDuracion;
	}

	public String getLblLugar() {
		return lblLugar;
	}

	public void setLblLugar(String lblLugar) {
		this.lblLugar = lblLugar;
	}

	public String getLblEmpleado() {
		return lblEmpleado;
	}

	public void setLblEmpleado(String lblEmpleado) {
		this.lblEmpleado = lblEmpleado;
	}

	public String getLblPlazas() {
		return lblPlazas;
	}

	public void setLblPlazas(String lblPlazas) {
		this.lblPlazas = lblPlazas;
	}

	public String getBtnFecha() {
		return btnFecha;
	}

	public void setBtnFecha(String btnFecha) {
		this.btnFecha = btnFecha;
	}

	public String getBtnHora() {
		return btnHora;
	}

	public void setBtnHora(String btnHora) {
		this.btnHora = btnHora;
	}

	public String getLblSpa() {
		return lblSpa;
	}

	public void setLblSpa(String lblSpa) {
		this.lblSpa = lblSpa;
	}

	public String getLblSeleccionServicio() {
		return lblSeleccionServicio;
	}

	public void setLblSeleccionServicio(String lblSeleccionServicio) {
		this.lblSeleccionServicio = lblSeleccionServicio;
	}

	public String getLblNumeroPersonas() {
		return lblNumeroPersonas;
	}

	public void setLblNumeroPersonas(String lblNumeroPersonas) {
		this.lblNumeroPersonas = lblNumeroPersonas;
	}

	public String getStrPersonas() {
		return strPersonas;
	}

	public void setStrPersonas(String strPersonas) {
		this.strPersonas = strPersonas;
	}

	public String getStrPersona() {
		return strPersona;
	}

	public void setStrPersona(String strPersona) {
		this.strPersona = strPersona;
	}

	public String getStrNingunServicio() {
		return strNingunServicio;
	}

	public void setStrNingunServicio(String strNingunServicio) {
		this.strNingunServicio = strNingunServicio;
	}

	public String getFacial() {
		return Facial;
	}

	public void setFacial(String facial) {
		Facial = facial;
	}

	public String getThai() {
		return Thai;
	}

	public void setThai(String thai) {
		Thai = thai;
	}

	public String getSueco() {
		return Sueco;
	}

	public void setSueco(String sueco) {
		Sueco = sueco;
	}

	public String getTermal() {
		return Termal;
	}

	public void setTermal(String termal) {
		Termal = termal;
	}

	public String getTurco() {
		return Turco;
	}

	public void setTurco(String turco) {
		Turco = turco;
	}

	public String getToallas() {
		return Toallas;
	}

	public void setToallas(String toallas) {
		Toallas = toallas;
	}

	public String getSabanas() {
		return Sabanas;
	}

	public void setSabanas(String sabanas) {
		Sabanas = sabanas;
	}

	public String getViscoelastica() {
		return Viscoelastica;
	}

	public void setViscoelastica(String viscoelastica) {
		Viscoelastica = viscoelastica;
	}

	public String getLatex() {
		return Latex;
	}

	public void setLatex(String latex) {
		Latex = latex;
	}

	public String getPluma() {
		return Pluma;
	}

	public void setPluma(String pluma) {
		Pluma = pluma;
	}

	public String getGel() {
		return Gel;
	}

	public void setGel(String gel) {
		Gel = gel;
	}

	public String getMiniBar() {
		return MiniBar;
	}

	public void setMiniBar(String miniBar) {
		MiniBar = miniBar;
	}

	public String getEuropa() {
		return Europa;
	}

	public void setEuropa(String europa) {
		Europa = europa;
	}

	public String getAsia() {
		return Asia;
	}

	public void setAsia(String asia) {
		Asia = asia;
	}

	public String getAmerica() {
		return America;
	}

	public void setAmerica(String america) {
		America = america;
	}

	public String getAfrica() {
		return Africa;
	}

	public void setAfrica(String africa) {
		Africa = africa;
	}

	public String getBotones() {
		return Botones;
	}

	public void setBotones(String botones) {
		Botones = botones;
	}

	public String getComida() {
		return Comida;
	}

	public void setComida(String comida) {
		Comida = comida;
	}

	public String getHoraLimpieza() {
		return HoraLimpieza;
	}

	public void setHoraLimpieza(String horaLimpieza) {
		HoraLimpieza = horaLimpieza;
	}

	public String getWiFi() {
		return WiFi;
	}

	public void setWiFi(String wiFi) {
		WiFi = wiFi;
	}

	public String getNetflix() {
		return Netflix;
	}

	public void setNetflix(String netflix) {
		Netflix = netflix;
	}

	public String getMovistar() {
		return Movistar;
	}

	public void setMovistar(String movistar) {
		Movistar = movistar;
	}

	public String getBBC() {
		return BBC;
	}

	public void setBBC(String bBC) {
		BBC = bBC;
	}

	public String getBein() {
		return Bein;
	}

	public void setBein(String bein) {
		Bein = bein;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public String getLblLunes() {
		return lblLunes;
	}

	public void setLblLunes(String lblLunes) {
		this.lblLunes = lblLunes;
	}

	public String getLblMartes() {
		return lblMartes;
	}

	public void setLblMartes(String lblMartes) {
		this.lblMartes = lblMartes;
	}

	public String getLblMiercoles() {
		return lblMiercoles;
	}

	public void setLblMiercoles(String lblMiercoles) {
		this.lblMiercoles = lblMiercoles;
	}

	public String getLblJueves() {
		return lblJueves;
	}

	public void setLblJueves(String lblJueves) {
		this.lblJueves = lblJueves;
	}

	public String getLblViernes() {
		return lblViernes;
	}

	public void setLblViernes(String lblViernes) {
		this.lblViernes = lblViernes;
	}

	public String getLblSabado() {
		return lblSabado;
	}

	public void setLblSabado(String lblSabado) {
		this.lblSabado = lblSabado;
	}

	public String getLblDomingo() {
		return lblDomingo;
	}

	public void setLblDomingo(String lblDomingo) {
		this.lblDomingo = lblDomingo;
	}

	public String getTxtrParaEmpezarA() {
		return txtrParaEmpezarA;
	}

	public void setTxtrParaEmpezarA(String txtrParaEmpezarA) {
		this.txtrParaEmpezarA = txtrParaEmpezarA;
	}

	public String getLblTituloTemperatura() {
		return lblTituloTemperatura;
	}

	public void setLblTituloTemperatura(String lblTituloTemperatura) {
		this.lblTituloTemperatura = lblTituloTemperatura;
	}

	public String getLblControlManual() {
		return lblControlManual;
	}

	public void setLblControlManual(String lblControlManual) {
		this.lblControlManual = lblControlManual;
	}

	public String getBtnActivar() {
		return btnActivar;
	}

	public void setBtnActivar(String btnActivar) {
		this.btnActivar = btnActivar;
	}

	public String getLblInicio() {
		return lblInicio;
	}

	public void setLblInicio(String lblInicio) {
		this.lblInicio = lblInicio;
	}

	public String getBtnDesactivar() {
		return btnDesactivar;
	}

	public void setBtnDesactivar(String btnDesactivar) {
		this.btnDesactivar = btnDesactivar;
	}

	public String getLblProgramacionAutomatica() {
		return lblProgramacionAutomatica;
	}

	public void setLblProgramacionAutomatica(String lblProgramacionAutomatica) {
		this.lblProgramacionAutomatica = lblProgramacionAutomatica;
	}

	public String getLblControlJacuzzi() {
		return lblControlJacuzzi;
	}

	public void setLblControlJacuzzi(String lblControlJacuzzi) {
		this.lblControlJacuzzi = lblControlJacuzzi;
	}

	public String getLblBurbujas() {
		return lblBurbujas;
	}

	public void setLblBurbujas(String lblBurbujas) {
		this.lblBurbujas = lblBurbujas;
	}

	public String getLblTemperatura() {
		return lblTemperatura;
	}

	public void setLblTemperatura(String lblTemperatura) {
		this.lblTemperatura = lblTemperatura;
	}

	public String getLblAgua() {
		return lblAgua;
	}

	public void setLblAgua(String lblAgua) {
		this.lblAgua = lblAgua;
	}

	public String getLblLlenar() {
		return lblLlenar;
	}

	public void setLblLlenar(String lblLlenar) {
		this.lblLlenar = lblLlenar;
	}

	public String getLblVaciar() {
		return lblVaciar;
	}

	public void setLblVaciar(String lblVaciar) {
		this.lblVaciar = lblVaciar;
	}

	public String getLblControlVentana() {
		return lblControlVentana;
	}

	public void setLblControlVentana(String lblControlVentana) {
		this.lblControlVentana = lblControlVentana;
	}

	public String getLblVentana() {
		return lblVentana;
	}

	public void setLblVentana(String lblVentana) {
		this.lblVentana = lblVentana;
	}

	public String getLblPersianas() {
		return lblPersianas;
	}

	public void setLblPersianas(String lblPersianas) {
		this.lblPersianas = lblPersianas;
	}

	public String getBtnAbrir() {
		return btnAbrir;
	}

	public void setBtnAbrir(String btnAbrir) {
		this.btnAbrir = btnAbrir;
	}

	public String getLoginInfoTitulo() {
		return loginInfoTitulo;
	}

	public void setLoginInfoTitulo(String loginInfoTitulo) {
		this.loginInfoTitulo = loginInfoTitulo;
	}

	public String getLoginInfoMensaje() {
		return loginInfoMensaje;
	}

	public void setLoginInfoMensaje(String loginInfoMensaje) {
		this.loginInfoMensaje = loginInfoMensaje;
	}

	public String getPanelServiciosEmergenteLimpiezaTxtUnaVezHaya() {
		return panelServiciosEmergenteLimpiezaTxtUnaVezHaya;
	}

	public void setPanelServiciosEmergenteLimpiezaTxtUnaVezHaya(String panelServiciosEmergenteLimpiezaTxtUnaVezHaya) {
		this.panelServiciosEmergenteLimpiezaTxtUnaVezHaya = panelServiciosEmergenteLimpiezaTxtUnaVezHaya;
	}

	public String getPanelServiciosEmergenteLimpiezaTxt() {
		return panelServiciosEmergenteLimpiezaTxt;
	}

	public void setPanelServiciosEmergenteLimpiezaTxt(String panelServiciosEmergenteLimpiezaTxt) {
		this.panelServiciosEmergenteLimpiezaTxt = panelServiciosEmergenteLimpiezaTxt;

	}

	public String getTxtTip1() {
		return txtTip1;
	}

	public void setTxtTip1(String txtTip1) {
		this.txtTip1 = txtTip1;
	}

	public String getTxtTip2() {
		return txtTip2;
	}

	public void setTxtTip2(String txtTip2) {
		this.txtTip2 = txtTip2;
	}

	public String getTxtTip3() {
		return txtTip3;
	}

	public void setTxtTip3(String txtTip3) {
		this.txtTip3 = txtTip3;
	}

	public String getPanelServiciosEmergenteLimpiezaBtnCambiar() {
		return panelServiciosEmergenteLimpiezaBtnCambiar;
	}

	public void setPanelServiciosEmergenteLimpiezaBtnCambiar(String panelServiciosEmergenteLimpiezaBtnCambiar) {
		this.panelServiciosEmergenteLimpiezaBtnCambiar = panelServiciosEmergenteLimpiezaBtnCambiar;
	}

	public String getPanelServiciosEmergenteTelefonobtnConfirmarLLamada() {
		return panelServiciosEmergenteTelefonobtnConfirmarLLamada;
	}

	public void setPanelServiciosEmergenteTelefonobtnConfirmarLLamada(
			String panelServiciosEmergenteTelefonobtnConfirmarLLamada) {
		this.panelServiciosEmergenteTelefonobtnConfirmarLLamada = panelServiciosEmergenteTelefonobtnConfirmarLLamada;
	}

	public String getPanelServiciosEmergenteTelefonoTxt() {
		return panelServiciosEmergenteTelefonoTxt;
	}

	public void setPanelServiciosEmergenteTelefonoTxt(String panelServiciosEmergenteTelefonoTxt) {
		this.panelServiciosEmergenteTelefonoTxt = panelServiciosEmergenteTelefonoTxt;
	}

	public String getLblTxtSpaTitulo() {
		return lblTxtSpaTitulo;
	}

	public void setLblTxtSpaTitulo(String lblTxtSpaTitulo) {
		this.lblTxtSpaTitulo = lblTxtSpaTitulo;
	}

}
