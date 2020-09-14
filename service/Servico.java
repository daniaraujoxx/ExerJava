package service;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Servico {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.println("Digite o numero da conta: ");
		System.out.println("numero: ");
		conta.numeroConta = sc.nextDouble();
		
		System.out.println("Digite o nome do titular: ");
		System.out.println(" nome do titular: ");
		conta.nomeTitular = sc.next();
		
	

		System.out.println("Deseja Iniciar um valor inicial? ");
		System.out.println("Digite um valor: ");
		conta.vlInicial = sc.nextDouble();
		System.out.println("Numero da conta: " + conta.numeroConta + "\n" +  " Nome do titular: " + conta.nomeTitular + "\n Valor inicial: " + conta.vlInicial);
		

		System.out.println("Digite o valor depositado");
		System.out.println("Valor depositado: ");
		conta.vlDepositado = sc.nextDouble();
		
		System.out.println("Valor total: " + conta.Depositar());
		
		System.out.println("Quanto deseja sacar? ");
		System.out.println("Valor do Saque: ");
		conta.saque = sc.nextDouble();
		
		System.out.println("Total: " + conta.Sacar());
		
	

		sc.close();
	}


		
	}
	


