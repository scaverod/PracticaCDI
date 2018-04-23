/*

The following notices can be found in each source file of the 
original project.

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

public class TextoRo extends Texto {
	public TextoRo() {
		// Comunes
		setBtnAceptar("Acceptă");
		setBtnCerrar("Închid");
		setBtnCancelar("Anulează");

		// Panel Login
		setLoginIniciaSesion("Logați-vă pentru a utiliza aplicația");
		setLoginUsuario("Cont");
		setLoginUsuarioToolTip("Introduceți contul dumneavoastră (numărul de la cameră)");
		setLoginPassword("Parolă");
		setLoginPasswordToolTip("Introduceți parola utilizatorului folosit mai sus");
		setLoginBtnAceptar("Acceptă");
		setLoginErrorMensaje("Trebuie să introduceți toate datele");
		setLoginErrorTitulo("Date incomplecte");
		setLoginInfoTitulo("Cum să intrați în aplicație");
		setLoginInfoMensaje("Cont: 101\nParolă: cdi");

		// Menu principal
		setMenuPrincipalBtnHabitacion("Cameră");
		setMenuPrincipalBtnSpa("Spa");
		setMenuPrincipalBtnServicios("Servicii");
		setMenuPrincipalBtnCuenta("Cont");

		// Panel Habitacion Emergente Alarma
		setLblLunes("Luni");
		setLblMartes("Marți");
		setLblMiercoles("Miercuri");
		setLblJueves("Joi");
		setLblViernes("Vineri");
		setLblSabado("Sâmbată");
		setLblDomingo("Duminică");
		setTxtrParaEmpezarA("Pentru a folosi sistemul nostru de alarmă adăugați o alarmă pulsând butonul inferior pe dreapta.");

		// Panel Habitacion Emergente Calefaccion
		setLblTituloTemperatura("Control de temperatură");
		setLblControlManual("Control manual");
		setBtnActivar("Activați");
		setBtnDesactivar("Dezactivați");
		setLblProgramacionAutomatica("Programare automată");
		setLblInicio("Pornire");

		// Panel Habitacion Emergente Jacuzzi
		setLblControlJacuzzi("Control de Jacuzzi");
		setLblBurbujas("Jet");
		setLblTemperatura("Temperatură");
		setLblAgua("Apă");
		setLblLlenar("Umple");
		setLblVaciar("Golește");

		// Panel Habitacion Emergente Ayuda
		setTxtTip1("Pentru a interacționa cu elementele din cameră apăsați pe acele evidențiate cu galben.");
		setTxtTip2("Pentru a interacționa cu toate elementele în același timp (de exemplu cu toate luminile) apăsați butoanele din partea inferioară din stânga.");
		setTxtTip3("Pentru a programa o alarmă, selecționați butonul cu ceas din partea inferioară din stânga.");

		// Panel Habitacion Emergente Ventana
		setLblControlVentana("Control fereastră");
		setLblVentana("Fereastră");
		setLblPersianas("Jaluzea");
		setBtnAbrir("Deschid");

		// TODO: panel spa
		setLblTratamiento("Tratament");
		setLblSeleccionTratamiento("Selecționați tratamentul dorit");
		setLblDuracion("Durată");
		setLblLugar("Loc");
		setLblEmpleado("Angajat");
		setBtnFecha("Dată");
		setBtnHora("Oră");
		setLblPlazas("Locuri libere:");
		setLblSpa("SPA");
		setLblSeleccionServicio("Selecționați serviciul dorit");
		setLblNumeroPersonas("Număr de bilete");
		setStrPersonas("persoane");
		setStrPersona("persoană");

		// TODO: panel spa EMERGENTE
		setLblTxtSpaTitulo("Selecționați ora și ziua");

		// Panel Servicios
		setPanelServiciosBtnMinibar("Reumple minibar");
		setPanelServiciosBtnCambioToalla("Schimbare prosoape");
		setPanelServiciosBtnTelefono("Efectuare apel");
		setPanelServiciosBtnHorarioLimpieza("Oră curățenie");
		setPanelServiciosBtnBotones("Chemare valet");
		setPanelServiciosBtnCambioAlmohada("Schimbare perină");
		setPanelServiciosBtnCambiarSabanas("Schimbare haine pat");
		setPanelServiciosBtnComidaHab("Cerere mâncare");
		setPanelServiciosBtnPedirTaxi("Cerere taxi");
		setPanelServiciosBtnTelevision("Cumparare canale");
		setPanelServiciosBtnWifi("Activare WiFi");
		setPanelServiciosBtnInformacion("Solicitare informație");

		// Panel Emergen Informacion
		setBtnAdquirir("Cumpărați");
		setTxtInformacion("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, vă vom suna pe telefonul camerei de la recepția hotelului. Disponibil 24h.");
		setLblCoste("Preț:");

		// Panel Emergen Television
		setPanelServiciosEmergenteTelevisionTxt("Hotelele noastre sunt dotate de canale exclusive pentru cei mai exigenți clienți ai noștri.");

		// Panel Emergen Wifi
		setPanelServiciosEmergenteWifiTxt(
				"Toată lumea vrea să aibă posibilitatea de a se conecta la internet în orice moment, de aceea avem WiFi de calitate în toate camerele din hotel. \r\n"
						+ "Odată ce activați acest serviciu îl veți avea disponibil pe tot parcursul șederii. ");
		setPanelServiciosEmergenteWifiActivadoTxt("Ați cumpărat serviciul WiFi. Speram să vă bucurați de cea mai bună conexiune la internet de care dispunem.\n\nPentru a începe să folosiți acest serviciu introduceți parola în dispozitivele voastre.");
		setPanelServiciosEmergenteWifiPwdTxt("Parolă WiFi:");

		// Panel Emergen Taxi
		setPanelServiciosEmergenteTaxiTxt("Nu pierde timpul tău sunând la un taxi. Noi o facem in locul tău.\n\nListă de firme de care dispunem:");

		// Panel Emergen Botones
		setPanelServiciosEmergenteBotonesTxt("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, un valet va veni la camera dumneavoastră pentru a vă ajuta la orice aveți nevoie.\r\nDisponibil 24h.");

		// Panel Emergen Almohada
		setPanelServiciosEmergentealmohadaLatex("Latex");
		setPanelServiciosEmergentealmohadaVisco("Viscoelastică");
		setPanelServiciosEmergentealmohadaGel("Gel");
		setPanelServiciosEmergentealmohadaPluma("Pene");
		setPanelServiciosEmergentealmohadaTxt("Vrem să vă odihniți cât mai mult in sejurul dumneavoastră. Selecționați tipul de perină ce doriți și în câteva minute un valet o va aduce la camera dumneavoastră.");
		
		// Panel Emergente Comida
		setPanelServiciosEmergenteComidaTxt("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, un valet vă va aduce mâncarea din restaurantul nostru exclusiv direct la camera dumneavoastră pentru a vă putea bucura de cea mai buna mâncare cu cea mai buna comoditate. Serviciu disponibil de la 7:00 la 00:00.");

		// Panel Emergente Toallas
		setPanelServiciosEmergenteToallasTxt("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, serviciul nostru de curățenie vă va aduce un nou set de prosoape curate. Serviciu disponibil 24h.");

		// Panel Emergente Minibar
		setPanelServiciosEmergenteMinibarTxt("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, un valet va umple din nou minubarul dumneavoastră pentru a vă bucura de cele mai bune băuturi, aperitive si gustări ce putem la dispoziția dumneavoastră.");

		// Panel Emergente Sabanas
		setPanelServiciosEmergenteSabanasTxt("Hotelele noastre sunt dotate de o atenție personalizată. Cu doar apăsarea butonului, serviciul nostru de curățenie vă va aduce un nou set de haine de pat. Serviciu disponibil 24h.");
		
		// Panel Emergente Limpieza
		setPanelServiciosEmergenteLimpiezaTxt("Selecționați ora cea mai convenabilă pentru a vă curăța camera.");
		setPanelServiciosEmergenteLimpiezaTxtUnaVezHaya("Info: Odată ce ați cumpărat acest serviciu puteți schimba ora din nou fară cost suplimentar.");
		setPanelServiciosEmergenteLimpiezaBtnCambiar("Schimbați");

		// Panel Emergente Telefono
		setPanelServiciosEmergenteTelefonoTxt("Selecționați continentul la care vreți să sunați și confirmați apelul. \r\nDupa acea puteți folosi telefonul camerei pentru a efectua apelul dorit.");
		setPanelServiciosEmergenteTelefonobtnConfirmarLLamada("Selecționați continent");

		// Panel usuario
		setLblCuentaHabitacion("Cameră");
		setLblElegirIdioma("Alege limba");
		setLblCastellano("Spaniolă");
		setLblIngles("Engleză");
		setLblRumano("Română");
		setLblGasto("Cheltuieli");
		setBtnMsDetalles("Detalii...");
		setLblGastoTotal("Cheltuieli totale:");
		setLblPersonalizar("Personalizare");
		setLblModoNocturno("Mod noapte");
		setLblInvertirColores("Culori inversate");
		setLblSalidaTexto("Citire text prin voce");
		setLblAumentarTexto("Mărire text");
		setLblListaDeGastos("Listă de cheltuieli");

		// Panel Confirmacion
		setLblConfirmacion("¿Confirmați această operație?");

		// Panel Emergente Detalles (provisional)
		setStrNingunServicio("Nu ați cumpărat nici un serviciu");
		setFacial("Masaj facial");
		setThai("Masaj Thai");
		setSueco("Masaj suedez");
		setTermal("Circuit termic");
		setTurco("Baie turcă");
		setToallas("Schimbare prosoape");
		setSabanas("Schimbare haine pat");
		setViscoelastica("Cumpărare perină viscoelastică");
		setLatex("Cumpărare perină latex");
		setPluma("Cumpărare perină pene");
		setGel("Cumpărare perină gel");
		setMiniBar("Reumple minibar");
		setEuropa("Apel Europa");
		setAsia("Apel Asia");
		setAmerica("Apel America");
		setAfrica("Apel Africa");
		setBotones("Apel la valet");
		setComida("Cerere mâncare");
		setHoraLimpieza("Selecție oră curățenie");
		setWiFi("Activare WiFi");
		setNetflix("Cumpărare Netflix");
		setMovistar("Cumpărare Movistar");
		setBBC("Cumpărare BBC");
		setBein("Cumpărare Bein");
		setInfo("Solicitare informație");

		// Panel Acerca De
		setPanelAcercaDelblTitulo("Despre...");
		setPanelAcercaDeTxtInfo("Închiderea sesiunii nu a fost implementată. În locul acestea putem \"Despre\".\r\n\r\nMulțumiri autorilor de Flaticon, în special la Freepik, pentru majoritatea pozelor folosite în aplicația noastră. În continuare vom pune creditele așa cum ni se indică:\r\nIcons made by Freepik from https://www.flaticon.com/\r\nwww.flaticon.com is licensed by Creative Commons BY 3.0 CC 3.0 BY");
	}
}
