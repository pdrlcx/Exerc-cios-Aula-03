package br.com.generation.exerciciosAula03;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		//solicitar ao usuario o valor
		//descobrir par = valor % valor = 0
		//descobrir o impar = se nao for par � impar
		//o seistema s� l�r� 10 numeros
		//mostrar pro usuario numeros pares e impares

public class Exercicio2La�osRepeti��oFOR {

	public static void main(String[] args) {
		
		int x, contImpar = 0, contPar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		//x1 esta contando quantas vezes
		for(int limitador = 0; limitador < 10; limitador++) {
		
			System.out.print("Insira o valor: ");
			x = leia.nextInt();
			
			if(x % 2 == 0) {
				System.out.println("Esse n�mero � par: " + x);
				contPar++;
			}
			
			else{
				System.out.println("Esse n�mero � impar: " + x);
				contImpar++;
			}
			
		}
		System.out.println("\nForam repetidos " + contPar + " vezes o n�mero par!");
		System.out.println("\nForam repetidos " + contImpar + " vezes o n�mero impar!");
		
			leia.close();
	}

}
