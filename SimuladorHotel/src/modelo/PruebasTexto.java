package modelo;

import idiomas.TextoManager;

public class PruebasTexto {

	public static void main(String[] args) {
		TextoManager t = new TextoManager(TextoManager.español);
		t.getIdiomas();
	}

}