package sorts;

import classes.Funcionario;

public class InsertionSortFuncionario {
	public Funcionario[] ordenarCrescente(Funcionario[] vetor){
		Funcionario pivo;
		int j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j].getSalario()>pivo.getSalario()){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
	public Funcionario[] ordenarDecrescente(Funcionario[] vetor){
		Funcionario pivo;
		int j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j].getSalario()<pivo.getSalario()){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
	public Funcionario[] ordenarOrdemAlfabetica(Funcionario[] vetor){
		Funcionario pivo;
		int j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j].getNome().charAt(0)>pivo.getNome().charAt(0)){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
}
