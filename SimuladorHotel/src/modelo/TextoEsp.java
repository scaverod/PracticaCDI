package modelo;

public class TextoEsp extends Texto {
	public TextoEsp() {
		// Panel Login
		setLoginIniciaSesion("Inicie sesión para usar la aplicación");
		setLoginUsuario("Usuario");
		setLoginUsuarioToolTip("Introduzca su usuario (número de habitación)");
		setLoginPassword("Contraseña");
		setLoginPasswordToolTip("Introduzca la contraseña asociada al usuario introducido más arriba");
		setLoginBtnAceptar("Aceptar");
		setLoginErrorMensaje("Ningún campo puede estar vacío");
		setLoginErrorTitulo("Campo(s) vacíos");
		
		// Menu principal
		setMenuPrincipalBtnHabitacion("Habitación");
		setMenuPrincipalBtnSpa("Spa");
		setMenuPrincipalBtnServicios("Servicios");
		setMenuPrincipalBtnCuenta("Cuenta");
		
		// TODO: panel habitacion
		// TODO: panel spa
		
		// Panel Servicios
		setPanelServiciosBtnMinibar("Reponer minibar");
		setPanelServiciosBtnCambioToalla("Cambiar toallas");
		setPanelServiciosBtnTelefono("Realizar llamada");
		setPanelServiciosBtnHorarioLimpieza("Hora limpieza");
		setPanelServiciosBtnBotones("Llamar al botones");
		setPanelServiciosBtnCambioAlmohada("Cambiar almohada");
		setPanelServiciosBtnCambiarSabanas("Cambiar sabanas");
		setPanelServiciosBtnComidaHab("Pedir comida");
		setPanelServiciosBtnPedirTaxi("Pedir taxi");
		setPanelServiciosBtnTelevision("Adquirir canales");
		setPanelServiciosBtnWifi("Activar WiFi");
		setPanelServiciosBtnInformacion("Solicitar información");
		
		//Panel Emergen Informacion
		setBtnAdquirir("Adquirir");
		
		// TODO: panel usuario
	}
}