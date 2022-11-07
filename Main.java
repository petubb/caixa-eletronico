package atividadeCaixaRafa;

import java.util.Iterator;
import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer valor;

		Integer notaUm = 1;
		Integer notaDois = 2;
		Integer notaCinco = 5;
		Integer notaDez = 10;
		Integer notaVinte = 20;
		Integer notaCinquenta = 50;
		Integer notaCem = 100;

		System.out.println("Insira o valor que deseja retirar");
		valor = sc.nextInt();

		if(valor >= notaCem) {
			notaCem = valor / notaCem;
			valor = valor % 100;
			if(notaCem == 1) {
				System.out.println(notaCem + " nota de R$ 100,00");
			}
			else if (notaCem != 0)
				System.out.println(notaCem + " notas de R$ 100,00");
		}

		if(valor >= notaCinquenta) {
			notaCinquenta = valor / notaCinquenta;
			valor = valor % 50;
			if(notaCinquenta == 1) {
				System.out.println(notaCinquenta + " nota de R$ 50,00");
			}
			else if(notaCinquenta != 0)
				System.out.println(notaCinquenta + " notas de R$ 50,00");
		}

		if(valor >= notaVinte) {
			notaVinte = valor / notaVinte;
			valor = valor % 20;
			if(notaVinte != 1) {
				System.out.println(notaCem + " nota de R$ 20,00");
			}
			else if(notaVinte != 0);
			System.out.println(notaVinte + " notas de R$ 20,00");
		}

		if(valor >= notaDez) {
			notaDez = valor / notaDez;
			valor = valor % 10;
			if(notaDez != 1) {
				System.out.println(notaDez + " nota de R$ 10,00");
			}
			else if(notaDez != 0);
			System.out.println(notaDez + " notas de R$ 10,00");
		}

		if(valor >= notaCinco) {
			notaCinco = valor / notaCinco;
			valor = valor % 5;
			if(notaCinco == 1) {
				System.out.println(notaCinco + " nota de R$ 5,00");
			}
			else if(notaCinco != 0);
			System.out.println(notaCinco + " notas de R$ 5,00");
		}

		if(valor >= notaDois) {
			notaDois = valor / notaDois;
			valor = valor % 2;
			if(notaDois == 1) {
				System.out.println(notaDois + " nota de R$ 2,00");
			}
			else if(notaDois != 0) 
				System.out.println(notaDois + " notas de R$ 2,00");
		}

		if(valor >= notaUm) {
			notaUm = valor / notaUm;
			
			if(notaUm == 1) {
				System.out.println(notaUm + " nota de R$ 1,00");
			}
			else if(notaUm != 0)
			System.out.println(notaUm + " notas de R$ 1,00");
		}
	}
}
