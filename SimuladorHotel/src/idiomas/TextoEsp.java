package idiomas;

public class TextoEsp extends Texto {
	public TextoEsp() {
		// Comunes
		setBtnAceptar("Aceptar");
		setBtnCerrar("Cerrar");
		setBtnCancelar("Cancelar");

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

		// Panel Emergen Botones
		setPanelServiciosEmergenteBotonesTxt(
				"Nuestros hoteles cuentan con una atenci\u00F3n totalmente personalizada. Con solo pulsar el bot\u00F3n, un botones se acercar\u00E1 hasta su habitaci\u00F3n para ayudarle en lo que necesite.\r\nDisponible las 24 horas al d\u00EDa");
		
		//Panel Emergen Almofada
		setPanelServiciosEmergentealmohadaLatex("Látex");
		setPanelServiciosEmergentealmohadaVisco("Viscoelástica");
		setPanelServiciosEmergentealmohadaGel("Gel");
		setPanelServiciosEmergentealmohadaPluma("Pluma");
		setPanelServiciosEmergentealmohadaTxt("Queremos que descanse todo lo posible durante su estancia. Seleccione el tipo de almohada que desee y en unos minutos un botones se la subirá a la habitación");
		
		//Panel Emergente Comida
		setPanelServiciosEmergenteComidaTxt(
				"Nuestros hoteles cuentan con una atenci\u00F3n totalmente personalizada. Con solo pulsar el bot\u00F3n, un botones le llevará la comida desde nuestro exclusivo restaurante directamente a su habitación, para que pueda disfrutar de nuestra comida gourmet con total comodidad. Servicio disponible de 7:00 a 00:00");
		
		//Panel Emergente Toallas
		setPanelServiciosEmergenteToallasTxt(
				"Nuestros hoteles cuentan con una atenci\u00F3n totalmente personalizada. Con solo pulsar el bot\u00F3n, nuestro servicio de limpieza subirá a su habitación con un juego de toallas limpias. Servicio disponible las 24 horas del día");
		
		//Panel Emergente Minibar
		setPanelServiciosEmergenteMinibarTxt(
				"Nuestros hoteles cuentan con una atenci\u00F3n totalmente personalizada. Con solo pulsar el bot\u00F3n, un botones repondrá todos los artículos del minibar, para que siempre pueda disfrutar de las mejores bebidas y snacks que tenemos a su disposición");
		
		//Panel Emergente Sabanas
		setPanelServiciosEmergenteSabanasTxt(
				"Nuestros hoteles cuentan con una atenci\u00F3n totalmente personalizada. Con solo pulsar el bot\u00F3n, nuestro servicio de limpieza subirá a su habitación con un juego de sábanas limpias. Servicio disponible las 24 horas del día");
		
		// Panel usuario
		setLblCuentaHabitacion("Habitación");
		setLblElegirIdioma("Elegir idioma");
		setLblCastellano("Castellano");
		setLblIngles("Inglés");
		setLblRumano("Rumano");
		setLblGasto("Gasto");
		setBtnMsDetalles("Más detalles...");
		setLblGastoTotal("Gasto total:");
		setLblPersonalizar("Personalizar");
		setLblModoNocturno("Modo nocturno");
		setLblInvertirColores("Invertir colores");
		setLblSalidaTexto("Salida de texto por voz");
		setLblAumentarTexto("Aumentar texto");
		setLblListaDeGastos("Lista de Gastos");

		// Panel Confirmacion
		setLblConfirmacion("¿Desea confirmar la operación?");

	}
}