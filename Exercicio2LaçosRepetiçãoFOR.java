package br.com.generation.exerciciosAula03;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		//solicitar ao usuario o valor
		//descobrir par = valor % valor = 0
		//descobrir o impar = se nao for par é impar
		//o seistema só lêrá 10 numeros
		//mostrar pro usuario numeros pares e impares

public class Exercicio2LaçosRepetiçãoFOR {

	public static void main(String[] args) {
		
		int x, contImpar = 0, contPar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		//x1 esta contando quantas vezes
		for(int limitador = 0; limitador < 10; limitador++) {
		
			System.out.print("Insira o valor: ");
			x = leia.nextInt();
			
			if(x % 2 == 0) {
				System.out.println("Esse número é par: " + x);
				contPar++;
			}
			
			else{
				System.out.println("Esse número é impar: " + x);
				contImpar++;
			}
			
		}
		System.out.println("\nForam repetidos " + contPar + " vezes o número par!");
		System.out.println("\nForam repetidos " + contImpar + " vezes o número impar!");
		
			leia.close();
	}

}
