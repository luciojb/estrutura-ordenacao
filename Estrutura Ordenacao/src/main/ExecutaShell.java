package main;

import java.util.Random;

import sorts.ShellSortExtra;


public class ExecutaShell {

	public static void main(String[] args) {
		int[] v = new int[10000];
		Random rand = new Random(); 
		for(int i=0; i<v.length; i++){
			v[i] = rand.nextInt(100);
		}
		
		System.out.print("Vetor antes da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		
		long inicio = System.nanoTime();
		v = ShellSortExtra.ordenar(v);
		long fim = System.nanoTime();
		
		System.out.print("\n\nVetor depois da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		System.out.println("Tempo gasto: "+ (double)((fim-inicio)/Math.pow(1000, 3)));
		
	}

}
