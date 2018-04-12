package idiomas;

public class TextoEng extends Texto {
	public TextoEng() {
		// Comunes
		setBtnAceptar("Confirm");
		setBtnCerrar("Close");

		// Panel Login
		setLoginIniciaSesion("Login to use the app");
		setLoginUsuario("User");
		setLoginUsuarioToolTip("Type your username (your room number)");
		setLoginPassword("Password");
		setLoginPasswordToolTip("Type the password for your username");
		setLoginBtnAceptar("Accept");
		setLoginErrorMensaje("All fields must be filled");
		setLoginErrorTitulo("Empty field(s)");

		// Menu principal
		setMenuPrincipalBtnHabitacion("Room");
		setMenuPrincipalBtnSpa("Spa");
		setMenuPrincipalBtnServicios("Services");
		setMenuPrincipalBtnCuenta("Account");

		// TODO: panel habitacion
		// TODO: panel spa

		// Panel Servicios
		setPanelServiciosBtnMinibar("Replenish minibar");
		setPanelServiciosBtnCambioToalla("Change towels");
		setPanelServiciosBtnTelefono("Call");
		setPanelServiciosBtnHorarioLimpieza("Set cleaning time");
		setPanelServiciosBtnBotones("Call bellboy");
		setPanelServiciosBtnCambioAlmohada("Change pillow");
		setPanelServiciosBtnCambiarSabanas("Change bed sheets");
		setPanelServiciosBtnComidaHab("Order food");
		setPanelServiciosBtnPedirTaxi("Request taxi");
		setPanelServiciosBtnTelevision("Buy channels");
		setPanelServiciosBtnWifi("Enable WiFi");
		setPanelServiciosBtnInformacion("Ask info");
		setCerrar("Close");
		
		// Panel Emergen Informacion
		setBtnAdquirir("Acquire");
		setTxtInformacion(
				"Our hotels have a totally personalized service. With just pressing the button, we will call the room phone from the hotel reception.\nAvailable 24 hours a day");
		setLblCoste("Cost:");

		// Panel Emergen Television
		setPanelServiciosEmergenteTelevisionTxt(
				"Our hotels have a variety of exclusive channels for our most demanding clients.");
		// Panel Emergen Wifi
		setPanelServiciosEmergenteWifiTxt(
				"Everyone wants to be able to connect to the internet at any time, that's why, we have Wifi in all the rooms of the hotel of high quality.\r\n"
						+ "Once you activate the service, it will be available during your entire stay.");

		setPanelServiciosEmergenteWifiActivadoTxt(
				"You have purchased the WiFi service. We hope you can enjoy the best quality of our internet connection.\n\nTo start using WiFi, enter the key in your devices.");
		setPanelServiciosEmergenteWifiPwdTxt("WiFi password:");

		// Panel Emergen Txi
		setPanelServiciosEmergenteTaxiTxt(
				"Do not waste your time calling a vehicle for your travel. We do it for you.\n\nList of associated companies:");

		// TODO: panel usuario
		setLblCuentaHabitacion("Room");
		setLblElegirIdioma("Choose Language");
		setLblCastellano("Spanish");
		setLblIngles("English");
		setLblRumano("Romanian");
		setLblGasto("Spending");
		setBtnMsDetalles("More details...");
		setLblGastoTotal("Total cost:");
		setLblPersonalizar("Personalize");
		setLblModoNocturno("Night mode");
		setLblInvertirColores("Reverse colors");
		setLblSalidaTexto("Text out by voice");
		setLblAumentarTexto("Increase text");

		// Panel Confirmacion
		setLblConfirmacion("Are you sure you want to proceed?");

	}
}