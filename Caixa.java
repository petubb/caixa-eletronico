package Caixa;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
		String sacarDnv;
		Notas n = new Notas();
		Scanner sc = new Scanner(System.in);
		Integer notaUm = 1;
		Integer notaDois = 2;
		Integer notaCinco = 5;
		Integer notaDez = 10;
		Integer notaVinte = 20;
		Integer notaCinquenta = 50;
		Integer notaCem = 100;
		Integer valor;

		do { 
			valor = new Valor();
			n.listarNotas();
			System.out.println("Insira o valor que deseja retirar");
			valor = sc.nextInt();

			if(notaCem >= notaCem && n.getSaldoCem() >= valor/100) {
				notaCem = valor / notaCem;
				valor = valor % 100;
				//				if(notaCem == 1) {
				//					System.out.println(notaCem + " nota de R$ 100,00");
				//					saldoCem = notaCem - saldoCem;
				//				}
				if(notaCem > n.getSaldoCem()) {
					System.err.println("Notas de R$ 100,00 insuficientes");
				}
				else if (notaCem != 0) {
					System.out.println(notaCem + " notas de R$ 100,00");
					n.saldoCem = n.saldoCem - notaCem;
					n.setSaldoCem(n.saldoCem);
				}
			}

			if(valor >= notaCinquenta && n.getSaldoCinquenta() >= notaCinquenta) {
				notaCinquenta = valor / notaCinquenta;
				valor = valor % 50;
				//				if(notaCinquenta >= 0) {
				//					System.out.println(notaCinquenta + " nota de R$ 50,00");
				//					n.saldoCinquenta = notaCinquenta - n.saldoCinquenta;
				//					n.setSaldoCinquenta(n.saldoCinquenta);
				//				}
				if(notaCinquenta != 1)
					notaCinquenta = valor / notaCinquenta;
				valor = valor % 50;
				System.out.println(notaCinquenta + " notas de R$ 50,00");
				n.saldoCinquenta = n.saldoCinquenta - notaCinquenta;
				n.setSaldoCinquenta(n.saldoCinquenta);
			}

			if(valor >= notaVinte && n.getSaldoVinte() >= notaVinte) {
				notaVinte = valor / notaVinte;
				valor = valor % 20;
				//				if(notaVinte != 0) {
				//					System.out.println(notaCem + " nota de R$ 20,00");
				//					n.saldoVinte = notaVinte - n.saldoVinte;
				//				}
				if(notaVinte != 1);
				System.out.println(notaVinte + " notas de R$ 20,00");
				n.saldoVinte = n.saldoVinte - notaVinte;
				n.setSaldoVinte(n.saldoVinte);
			}

			if(valor >= notaDez && n.getSaldoDez() >= notaDez) {
				notaDez = valor / notaDez;
				valor = valor % 10;
				//				if(notaDez != 1) {
				//					System.out.println(notaDez + " nota de R$ 10,00");
				//					saldoDez = notaDez - saldoDez;
				//				}
				if(notaDez != 0);
				System.out.println(notaDez + " notas de R$ 10,00");
				n.saldoDez = n.saldoDez - notaDez;
				n.setSaldoDez(n.saldoDez);
			}

			if(valor >= notaCinco && n.getSaldoCinco() >= notaCinco) {
				notaCinco = valor / notaCinco;
				valor = valor % 5;
				//				if(notaCinco == 1) {
				//					System.out.println(notaCinco + " nota de R$ 5,00");
				//					saldoCinco = notaCinco - saldoCinco;
				//				}
				if(notaCinco != 0) 
					System.out.println(notaCinco + " notas de R$ 5,00");
				n.saldoCinco = n.saldoCinco - notaCinco;
				n.setSaldoCinco(n.saldoCinco);
			}

			if(valor >= notaDois && n.getSaldoDois() >= notaDois) {
				notaDois = valor / notaDois;
				valor = valor % 2;
				//				if(notaDois == 1) {
				//					System.out.println(notaDois + " nota de R$ 2,00");
				//					saldoDois = notaDois - saldoDois;
				//				}
				if(notaDois != 0) 
					System.out.println(notaDois + " notas de R$ 2,00");
				n.saldoDois = n.saldoDois - notaDois;
				n.setSaldoDois(n.saldoDois);

			}

			if(valor >= notaUm && n.getSaldoUm() >= notaUm) {
				notaUm = valor / notaUm;
				valor = valor % 1;
				//				if(notaUm == 1) {
				//					System.out.println(notaUm + " nota de R$ 1,00");
				//					saldoUm = notaUm - saldoUm;

				if(notaUm != 0)
					System.out.println(notaUm + " nota de R$ 1,00");
				n.saldoUm = n.saldoUm - notaUm;
				n.setSaldoUm(n.saldoUm);
			}

			System.out.println("sacar novamente?");
			System.out.println("S - Sim");
			System.out.println("N - Não");
			sacarDnv = sc.next();
		} while(sacarDnv.equalsIgnoreCase("s"));
	}
}
