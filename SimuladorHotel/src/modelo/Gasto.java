package modelo;

import java.util.ArrayList;

import tiposVariable.StringDouble;

public class Gasto {

	private double gastoTotal;
	private ArrayList<StringDouble> gastos;

	public Gasto() {

		this.gastoTotal = 0;
		this.gastos = new ArrayList<StringDouble>();
	}

	public double getGastoTotal() {
		return gastoTotal;
	}

	public void setGastoTotal(double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}

	public ArrayList<StringDouble> getGastos() {
		return gastos;
	}

	public void setGastos(ArrayList<StringDouble> gastos) {
		this.gastos = gastos;
	}

	public void addGasto(StringDouble servicio) {
		gastos.add(servicio);
		gastoTotal += servicio.getNumero();
	}

	public void listarGastos() {
		for (int x = 0; x < gastos.size(); x++) {
			System.out.println(gastos.get(x).getCadena() + " --> " + String.valueOf(gastos.get(x).getNumero()));
		}
		System.out.println("Gasto tolal: " + String.valueOf(gastoTotal));
	}
	
}
