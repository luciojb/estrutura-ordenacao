package main;

import java.util.Random;
import sorts.QuickSort;

public class ExecutaQuick {

	public static void main(String[] args) {
		int[] v = new int[100];
		Random rand = new Random(); 
		for(int i=0; i<v.length; i++){
			v[i] = rand.nextInt(100);
		}
		
		System.out.print("Vetor antes da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		
		QuickSort.ordena(v, 0, v.length-1);
		
		System.out.print("\n\nVetor depois da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");

	}

}
