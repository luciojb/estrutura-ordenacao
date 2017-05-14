package sorts;

public class BubbleSort {
	public static int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int j=0; j<MAX;j++){
			for(int i=0; i<MAX-1; i++){
				if(vetor[i]>vetor[i+1]){
					int aux = vetor[i];
					vetor[i]=vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
		
		return vetor;
	}
}
