package modelo;

public class Personalizacion {

	private boolean modoNocturno;
	private boolean invertiColores;
	private boolean textoVoz;
	private boolean aumentoTexto;

	public Personalizacion(boolean modoNocturno, boolean invertiColores, boolean textoVoz, boolean aumentoTexto) {
		this.modoNocturno = modoNocturno;
		this.invertiColores = invertiColores;
		this.textoVoz = textoVoz;
		this.aumentoTexto = aumentoTexto;
	}

	public boolean isModoNocturno() {
		return modoNocturno;
	}

	public void setModoNocturno(boolean modoNocturno) {
		this.modoNocturno = modoNocturno;
	}

	public boolean isInvertiColores() {
		return invertiColores;
	}

	public void setInvertiColores(boolean invertiColores) {
		this.invertiColores = invertiColores;
	}

	public boolean isTextoVoz() {
		return textoVoz;
	}

	public void setTextoVoz(boolean textoVoz) {
		this.textoVoz = textoVoz;
	}

	public boolean isAumentoTexto() {
		return aumentoTexto;
	}

	public void setAumentoTexto(boolean aumentoTexto) {
		this.aumentoTexto = aumentoTexto;
	}

}
