package br.com.glandata;

public class Casting1 {
	
	public static void main(String[] args) {
		
		//Reserva 4 bytes - aceita até o número 2.147.483.647
		int numeroInteiro = 1024;
		
		//Reserva 8 bytes - aceita até o número 9.223.....
		long numeroLongo = numeroInteiro;
		
		System.out.println(numeroLongo);
	}

}
