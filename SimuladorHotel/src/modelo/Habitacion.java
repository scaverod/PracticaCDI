package modelo;

import java.util.ArrayList;

public class Habitacion {

	//TODO
	private Temperatura temperatura;
	// Si True -> Puerta abierta
	private boolean puertaAbierta;
	private Jacuzzi jacuzzi;
	// Si True -> Encedida
	private boolean[] luces;

	// Dependiendo del valor sabremos el estado de la persiana y la posición en la
	// que se encuentra
	private int[] persianas;
	// Dependiendo del valor sabremos el estado de la ventana y la posición en la
	// que se encuentra
	private int[] ventanas;

}
