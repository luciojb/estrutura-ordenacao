package sorts;

import java.util.ArrayList;
import java.util.List;

import classes.Aluno;

public class InsertionSortAluno {
	public Aluno[] ordenarCrescenteNotaPeso(Aluno[] vetor){
		Aluno pivo;
		int j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j].getMediaPonderada()>pivo.getMediaPonderada()){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
	public Aluno[] ordenarCrescenteNota1(Aluno[] vetor){
		Aluno pivo;
		int j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j].getNota1()>pivo.getNota1()){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
	
	public Aluno[] retornaReprovados(Aluno[] vetor){
		vetor = ordenarCrescenteNotaPeso(vetor);
		int i=0;
		List<Aluno> aux = new ArrayList<>();
		while(i<vetor.length && vetor[i].getMediaPonderada()<7){
			aux.add(vetor[i]);
			i++;
		}
		
		Aluno[] alunos = aux.toArray(new Aluno[aux.size()-1]);
		return alunos;
	}
	
	public Aluno[] ordenarOrdemAlfabetica(Aluno[] vetor){
		Aluno pivo;
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
