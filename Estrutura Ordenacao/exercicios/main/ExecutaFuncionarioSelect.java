package main;

import java.util.Random;

import classes.Funcionario;
import sorts.SelectSortFuncionario;

public class ExecutaFuncionarioSelect {

	public static void main(String[] args) {
		SelectSortFuncionario select = new SelectSortFuncionario();
		Funcionario[] fncs = new Funcionario[5];
		Funcionario f;
		Random rand = new Random();
		
		for (int i=0; i<5; i++){
			f = new Funcionario("Nome"+(i+1), (i+2<<4)*rand.nextDouble()*15.5);
			fncs[i]=f;
		}
		
		System.out.println("Vetor de funcionarios ANTES da ordenação: \n");
		
		for(Funcionario fc:fncs){
			System.out.println(fc.toString());
		}
		
		
		Funcionario[] fncsCres = select.ordenarCrescente(fncs);
		
		System.out.println("\nVetor de funcionarios DEPOIS da ordenação crescente: \n");
		
		for(Funcionario fc:fncsCres){
			System.out.println(fc.toString());
		}
		
		Funcionario[] fncsDec = select.ordenarDecrescente(fncs);
		
		System.out.println("\nVetor de funcionarios DEPOIS da ordenação decrescente: \n");
		
		for(Funcionario fc:fncsDec){
			System.out.println(fc.toString());
		}
		
		for (int i=0; i<5; i++){
			f = new Funcionario(rand.nextInt(5)+"Nome", (i+2<<4)*rand.nextDouble()*15.5);
			fncs[i]=f;
		}
		
		System.out.println("\nVetor de funcionarios ANTES da ordenação alfabetica: \n");
		
		for(Funcionario fc:fncs){
			System.out.println(fc.toString());
		}
		
		
		Funcionario[] fncsAlf = select.ordenarOrdemAlfabetica(fncs);
		
		System.out.println("\nVetor de funcionarios DEPOIS da ordenação alfabetica: \n");
		
		for(Funcionario fc:fncsAlf){
			System.out.println(fc.toString());
		}

	}

}
