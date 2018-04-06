package modelo;

public class TextoEng extends Texto {
	public TextoEng() {
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
		
		// TODO: panel usuario
	}
}