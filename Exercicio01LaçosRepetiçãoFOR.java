package br.com.generation.exerciciosAula03;

//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

public class Exercicio01La�osRepeti��oFOR {

	public static void main(String[] args) {
		
		for(int x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.println(x);
			}
		}

	}

}
