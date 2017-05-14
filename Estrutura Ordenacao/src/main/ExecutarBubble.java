package main;

import java.util.Random;

import sorts.BubbleSort;

public class ExecutarBubble {

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
		
		v = BubbleSort.ordenar(v);
		
		System.out.print("\n\nVetor depois da ordenação: \n[");
		
		for(int a : v){
			System.out.print(a+",");
		}
		System.out.println("]");
		
		/*
		O algoritmo cresce N(N-1), por causa dos laços
		Que causa N^2-N, ou seja, O(N^2), pois é o termo mais relevante
		Resultado? É lento!
		*/
		

	}

}
