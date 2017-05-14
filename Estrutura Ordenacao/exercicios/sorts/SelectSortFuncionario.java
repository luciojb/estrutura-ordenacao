package sorts;

import classes.Funcionario;

public class SelectSortFuncionario {
	public Funcionario[] ordenarCrescente(Funcionario[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j].getSalario()<vetor[MIN].getSalario()){
					MIN = j;
				}
			}
			Funcionario auxiliar = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = auxiliar;
		}
		return vetor;
	}
	
	public Funcionario[] ordenarDecrescente(Funcionario[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j].getSalario()>vetor[MIN].getSalario()){
					MIN = j;
				}
			}
			Funcionario auxiliar = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = auxiliar;
		}
		return vetor;
	}
	
	public Funcionario[] ordenarOrdemAlfabetica(Funcionario[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j].getNome().charAt(0)<vetor[MIN].getNome().charAt(0)){
					MIN = j;
				}
			}
			Funcionario auxiliar = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = auxiliar;
		}
		return vetor;
	}
}
