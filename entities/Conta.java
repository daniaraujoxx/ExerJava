package entities;

public class Conta {
	
	public static double numeroConta;
	public String nomeTitular;
	public double vlInicial;
	public double vlDepositado;
	public double saque = -5.00;
	public double vlTotal;
	public double nao = 0.00;
	public double sim = vlInicial;
	
	public double getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getVlInicial () {
		return vlInicial;
		
	}
	public void setVlInicial(double vlInicial) {
		this.vlInicial = vlInicial;
	}	

	public double Depositar(){
		return vlTotal = (this.vlInicial += vlDepositado);
	}
	
	
	public double Sacar() {
		return vlTotal -= this.saque;
	}
}
