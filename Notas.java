package Caixa;

public class Notas {

	Integer saldoUm = 4000;
	Integer saldoDois = 3000;
	Integer saldoCinco = 2000;
	Integer saldoDez = 1000;
	Integer saldoVinte = 700 ;
	Integer saldoCinquenta = 500;
	Integer saldoCem = 200;

	public Integer getSaldoUm() {
		if (saldoUm <= 0) {
			System.out.println("sem notas de R$1 suficientes");
		}
		return saldoUm;
	}
	public void setSaldoUm(Integer saldoUm) {
		this.saldoUm = saldoUm;
	}
	public Integer getSaldoDois() {
		if (saldoDois <= 0) {
			System.out.println("sem notas de R$2 suficientes");
		}
		return saldoDois;
	}
	public void setSaldoDois(Integer saldoDois) {
		this.saldoDois = saldoDois;
	}
	public Integer getSaldoCinco() {
		if (saldoCinco <= 0) {
			System.out.println("sem notas de R$5 suficientes");
		}
		else if (saldoCinco >= 1){
		}
		return saldoCinco;
	}


	public void setSaldoCinco(Integer saldoCinco) {
		this.saldoCinco = saldoCinco;
	}
	public Integer getSaldoDez() {
		if (saldoDez <= 0) {
			System.out.println("sem notas de R$10 suficientes");
		}
		return saldoDez;
	}
	public void setSaldoDez(Integer saldoDez) {
		this.saldoDez = saldoDez;
	}
	public Integer getSaldoVinte() {
		if (saldoVinte <= 0) {
			System.out.println("sem notas de R$20 suficientes");
		}
		return saldoVinte;
	}
	public void setSaldoVinte(Integer saldoVinte) {
		this.saldoVinte = saldoVinte;
	}
	public Integer getSaldoCinquenta() {
		if (saldoCinquenta <= 0) {
			System.out.println("sem notas de R$50 suficientes");
		}
		return saldoCinquenta;
	}
	public void setSaldoCinquenta(Integer saldoCinquenta) {
		this.saldoCinquenta = saldoCinquenta;
	}
	public Integer getSaldoCem() {
		if (saldoCem <= 0) {
			System.out.println("sem notas de R$100 suficientes");
			return saldoCem = 0;
		}
		return saldoCem;
	}
	public void setSaldoCem(Integer saldoCem) {
		this.saldoCem = saldoCem;
	}

	public void listarNotas() {
		System.out.println("==============================");
		System.out.println("NOTAS NO CAIXA");
		System.out.println("Notas de Cem: " + getSaldoCem());
		System.out.println("Notas de Cinquenta: "+ getSaldoCinquenta());
		System.out.println("Notas de Vinte: "+ getSaldoVinte());
		System.out.println("Notas de Dez:"+ getSaldoDez());
		System.out.println("Notas de Cinco: "+ getSaldoCinco());
		System.out.println("Notas de Dois:"+ getSaldoDois());
		System.out.println("Notas de Um: "+ getSaldoUm());
		System.out.println("==============================");
	}

}
