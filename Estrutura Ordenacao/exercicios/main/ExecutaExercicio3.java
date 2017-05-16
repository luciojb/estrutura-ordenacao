package main;

import java.util.Random;

import classes.Aluno;
import sorts.InsertionSortAluno;

public class ExecutaExercicio3 {

	public static void main(String[] args) {
		InsertionSortAluno insertion = new InsertionSortAluno();
		Random rand = new Random();
		Aluno[] alunos = new Aluno[8];
		Aluno a;
		
		for(int i=0;i<alunos.length;i++){
			//Nesse construtor já consigo calcular a média ponderada, então não preciso calcular nos métodos e ainda dá pra mostrar...
			a = new Aluno(rand.nextInt(5)+"Nome Aluno", rand.nextInt(9)+rand.nextDouble(), rand.nextInt(9)+rand.nextDouble());
			alunos[i] =a;
		}
		
		System.out.println("\nVetor de Alunos Normal:\n");
		for(Aluno al : alunos){
			System.out.println(al.toString());
		}
		
		System.out.println("\nMostrando alunos ordenados por média ponderada:\n");
		
		Aluno[] media = insertion.ordenarCrescenteNotaPeso(alunos);
		
		for(Aluno al : media){
			System.out.println(al.toString());
		}
		
		System.out.println("\nMostrando alunos ordenados pela nota 1:\n");
		
		Aluno[] nota1 = insertion.ordenarCrescenteNota1(alunos);
		
		for(Aluno al : nota1){
			System.out.println(al.toString());
		}
		
		System.out.println("\nMostrando alunos ordenados por reprovação em ordem alfabética: \n");
		
		Aluno[] rodados = insertion.ordenarOrdemAlfabetica(insertion.retornaReprovados(alunos));
		
		for(Aluno al : rodados){
			System.out.println(al.toString());
		}
	}
}
