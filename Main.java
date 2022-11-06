package caixaEletronico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int notaDeCem = 100;
		int notaDeCinquenta = 50;
		int notaDeVinte = 20;
		int notaDeDez = 10;
		int notaDeCinco = 5;
		int notaDeDois = 2;
		int notaDeUm = 1;

		System.out.println("Quanto deseja retirar?");
		Integer valor = sc.nextInt();

		if(valor >= notaDeCem) {
			notaDeCem = valor / 100;
			valor = valor % 100 ;
			if (notaDeCem != 0) 
				System.out.println(notaDeCem + " notas de R$ 100,00");
		}

		if(notaDeCinquenta >= notaDeCinquenta) {
			notaDeCinquenta = valor / 50;
			valor = valor % 50;
			if (notaDeCinquenta != 0)
				System.out.println(notaDeCinquenta + " notas de R$ 50,00");
		}

		if(notaDeVinte >= notaDeVinte) {
			notaDeVinte = valor / 20;
			valor = valor % 20;
			if (notaDeVinte != 0)
				System.out.println(notaDeVinte + " notas de R$ 20,00");
		}

		if(notaDeDez >= notaDeDez) {
			notaDeDez = valor / 10;
			valor = valor % 10;
			if (notaDeDez != 0)
				System.out.println(notaDeDez + " notas de R$ 10,00");
		}

		if(notaDeCinco >= notaDeCinco) {
			notaDeCinco = valor / 5;
			valor = valor % 5;
			if (notaDeCinco != 0)
				System.out.println(notaDeCinco + " notas de R$ 5,00");
		}

		if(notaDeDois >= notaDeDois) {
			notaDeDois = valor / 2;
			valor = valor % 2;
			if (notaDeDois != 0)
				System.out.println(notaDeDois + " notas de R$ 2,00");
		}

		if(notaDeUm >= notaDeUm)
		{
			notaDeUm = valor / 1;
			valor = valor % 1;
			if (notaDeUm != 0)
				System.out.println(notaDeUm + " notas de R$ 1,00");
		}
	}
}
