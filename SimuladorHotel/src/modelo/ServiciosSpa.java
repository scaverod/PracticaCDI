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
				new Spa("Circuito termal", new String[] { "30 min.", "60 min.", "90 min." }, 30, 0, new double[] { 22.50, 30, 37.99 }, 16, 21));
		spas.add(new Spa("Baño Turco", new String[] { "30 min.", "60 min." }, 10, 0, new double[] { 15, 25.99 }, 9, 13));
		spas.add(new Spa("Termas Romanas", new String[] { "30 min.", "60 min." }, 10, 0, new double[] { 15, 28.99 }, 9, 13));
		tratamientos.add(new Tratamiento("Masaje facial", new String[] { "15 min.", "30 min." }, new String[] { "Cabina", "Habitación" },
				new String[] { "Raquel Perez" }, 9, 13, new double[] { 15.99, 25.99 }));
		tratamientos.add(new Tratamiento("Masaje corporal", new String[] { "15 min.", "30 min." }, new String[] { "Cabina" , "Habitación" },
				new String[] { "Antonio Castro" }, 9, 13, new double[] { 20, 27.99 }));
		tratamientos.add(
				new Tratamiento("Masaje con chocolate", new String[] { "30 min.","60 min." }, new String[] { "Cabina", "Habitación" },
						new String[] { "Irina Boboia", "Maria Roca" }, 18, 20, new double[] { 30, 47.99 }));

	}
	
	public String [] getNombresTratamientos (){
		String [] aux = new String [3];
		for(int i = 0; i< 3; i++) {
			aux[i] = tratamientos.get(i).getNombre();
		}
		return aux;
	}

}
