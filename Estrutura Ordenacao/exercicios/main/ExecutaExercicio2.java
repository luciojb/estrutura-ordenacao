package main;

import java.util.Random;

import searches.PesquisaSequencial;
import sorts.InsertionSort;

public class ExecutaExercicio2 {

	public static void main(String[] args) {
		int v[] = new int[10];
		Random rand = new Random();
		
		for(int i=0; i<v.length; i++){
			v[i] = rand.nextInt(5);
		}
		
		System.out.print("Vetor antes da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		
		v = InsertionSort.ordenar(v);
		
		System.out.print("\n\nVetor depois da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		
		System.out.println("Menor número = "+v[0]+" encontrado "+PesquisaSequencial.buscaSequencial(v, v[0])+" vezes no vetor");
		
		System.out.println("Maior número = "+v[v.length-1]+" encontrado "+PesquisaSequencial.buscaSequencial(v, v[v.length-1])+" vezes no vetor");
	}

}
