package br.com.glandata;

public class Casting2 {
	
	public static void main(String[] args) {
		
		long numeroLong = 1024;
		//FAZER CAST - MULTAÇÃO, DESDE QUE NÃO ESTOURE O LIMITE
		int numeroInteiro = (int) numeroLong;
		
		System.out.println(numeroInteiro);
	}

}
