package modelo;

import java.util.ArrayList;

public class ServiciosSpa {

	private ArrayList<Spa> spas;
	private ArrayList<Tratamiento> tratamientos;

	public ServiciosSpa() {
		this.spas = new ArrayList<>();
		this.tratamientos = new ArrayList<>();
		this.inicializar();
	}

	public ArrayList<Spa> getSpas() {
		return spas;
	}

	public void setSpas(ArrayList<Spa> spas) {
		this.spas = spas;
	}

	public ArrayList<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}

	public void inicializar() {
		spas.add(
				new Spa("Circuito termal", new int[] { 30, 60, 90 }, 30, 0, new double[] { 22.50, 30, 37.99 }, 16, 21));
		spas.add(new Spa("Baño Turco", new int[] { 30, 60 }, 10, 0, new double[] { 15, 25.99 }, 9, 13));
		spas.add(new Spa("Termas Romanas", new int[] { 30, 60 }, 10, 0, new double[] { 15, 28.99 }, 9, 13));
		tratamientos.add(new Tratamiento("Masaje facial", new int[] { 15, 30 }, new String[] { "Cabina, Habitación" },
				new String[] { "Raquel Perez" }, 9, 13, new double[] { 15, 25.99 }));
		tratamientos.add(new Tratamiento("Masaje corporal", new int[] { 15, 30 }, new String[] { "Cabina, Habitación" },
				new String[] { "Antonio Castro" }, 9, 13, new double[] { 20, 27.99 }));
		tratamientos.add(
				new Tratamiento("Masaje con chocolate", new int[] { 30, 60 }, new String[] { "Cabina, Habitación" },
						new String[] { "Irina Boboia", "Maria Roca" }, 18, 20, new double[] { 30, 47.99 }));

	}

}
