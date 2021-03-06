package unq.tp3;

import java.util.ArrayList;

public class Multioperador {
	//Atributos
	private ArrayList<Integer> lista;
	//Constructor
	public Multioperador() {
		this.setLista(new ArrayList<Integer>());
	}
	//Gets y sets
	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}

	public ArrayList<Integer> getLista() {
		return lista;
	}
	//Metodos
	public void agregarNumero(Integer numero) {
		this.lista.add(numero);
	}
	
	public Integer sumar() {
		int resultado = 0;
		for (int numero : lista) {
			resultado += numero;
		}
		return resultado;
	}
	public Integer restar() {
		int resultado = 0;
		for (int numero : lista) {
			resultado -= numero;
		}
		return resultado;
		
	}
	public Integer multiplicar () {
		int resultado = 1;
		for (int numero : lista) {
			resultado = resultado * numero;
		}
		return resultado;
	}

}
