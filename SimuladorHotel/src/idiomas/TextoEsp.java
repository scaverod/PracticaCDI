package idiomas;

public class TextoEsp extends Texto {
	public TextoEsp() {
		// Comunes
		setBtnAceptar("Aceptar");
		setBtnCerrar("Cerrar");

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
		setCerrar("Cerrar");
		// Panel Emergen Informacion
		setBtnAdquirir("Adquirir");
		setTxtInformacion(
				"Nuestros hoteles cuentan con una atención totalmente personalizada. Con solo pulsar el botón, le llamaremos al teléfono de la habitación desde la recepción del hotel.\nDisponible las 24 horas al día");

		setLblCoste("Coste:");
		// Panel Emergen Television
		setPanelServiciosEmergenteTelevisionTxt(
				"Nuestros hoteles cuentan con una variedad de canales exclusivos para nuestros clientes más exigentes.");
		// Panel Emergen Wifi
		setPanelServiciosEmergenteWifiTxt(
				"Todo el mundo quiere tener la posibilidad de conectarse a internet en cualquier momento, por eso, nosotros contamos con Wifi en todas las habitaciones del hotel de alta calidad. \r\n"
						+ "Una vez usted active el servicio, éste estará disponible durante toda su estancia. ");
		setPanelServiciosEmergenteWifiActivadoTxt(
				"Has adquirido el servicio de WiFi. Esperamos que pueda disfrutar de la mejor calidad de nuestra conexion a internet.\n\nPara comenzar a usar el WiFi introduzca la clave en sus dispositivos.");
		setPanelServiciosEmergenteWifiPwdTxt("Clave del WiFi:");
		// Panel Emergen Taxi
		setPanelServiciosEmergenteTaxiTxt(
				"No pierdas tu tiempo llamando a un vehículo para tu traslado. Nosotros lo hacemos por tí.\n\nLista de empresas asociadas:");
		// TODO: panel usuario

		setLblCuentaHabitacion("Habitación");
		// Panel Confirmacion
		setLblConfirmacion("¿Desea confirmar su compra?");

	}
}