package sorts;

public class InsertionSort {
	public static int[] ordenar(int[] vetor){
		int pivo, j;
		for(int i=0; i<vetor.length;i++){
			pivo = vetor[i];
			j= i-1;
			while(j>=0 && vetor[j]>pivo){
				vetor[j+1] = vetor[j];
				j=j-1;
			}
			vetor[j+1] = pivo;
		}
		return vetor;
	}
}
