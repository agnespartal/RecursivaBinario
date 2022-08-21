package view;

import Controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController bin = new BinarioController();
		
		int num = 4;
		String resultado = bin.converterBinario(num); 
		System.out.println(resultado);
	}

}
