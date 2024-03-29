package sistema;

import condiciones.CondicionG;

import java.util.ArrayList;

public class Grupo implements UnidadGanadera {

	//
	private String nombre;
	private ArrayList<UnidadGanadera> unidades;

	public Grupo() {
		this.nombre = ""; //Esta el setter pero no el getter
		this.unidades = new ArrayList<UnidadGanadera>();

	}

	public void setNombre(String x) {
		nombre = x;
	}

	// METODOS ARRAYLIST
	public void additem(UnidadGanadera x) {
		unidades.add(x);
	}

	public void removeitem(int x) {
		unidades.remove(x);
	}

	// PESO TOTAL DE HACIENDA
	public double getPeso() {
		double peso = 0;
		for (UnidadGanadera x : unidades) {
			peso += x.getPeso();
		}

		return peso;
	}

	// PROMEDIO PESO HACIENDA
	public double getPromedioPeso() {

		return getPeso() / getCantidad();

	}

	// PROMEDIO EDAD HACIENDA
	public double getPromedioEdad() {

		return getEdad() / getCantidad();
	}

	// CANTIDAD DE HACIENDA
	public int getCantidad() {

		int cantidad = 0;

		for (UnidadGanadera x : unidades) {

			cantidad += x.getCantidad();

		}

		return cantidad;
	}

	// DEVUELVE LA SUMA DE EDAD DEL GANADO
	public int getEdad() {
		int edad = 0;

		for (UnidadGanadera x : unidades) {

			edad += x.getEdad();
		}
		return edad;
	}

	// APTO PARA SER VENDIDO

	public boolean isVendible(CondicionG g) {

		return g.cumple(this);
	}

	// VENTA EN CAMION

	public boolean llenarCamion(Camion c) {

		for (int i = 0; i < unidades.size(); i++) {

			if (unidades.get(i).llenarCamion(c)) {
				unidades.remove(i);
				i--;
			}

		}
		return false;

	}

	/*
	 * @Override public String getRaza() {
	 * 
	 * String aux= unidades.get(0).getRaza();
	 * 
	 * for (UnidadGanadera x : unidades) {
	 * 
	 * if (!(x.getRaza().equals(aux))) {
	 * 
	 * }
	 * 
	 * } }
	 */

}
