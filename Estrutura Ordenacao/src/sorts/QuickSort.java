package sorts;

public class QuickSort {
	
	public static void ordena(int[] vetor, int inicio, int fim){
		int meio;
		if(inicio<fim){
			meio = particao(vetor, inicio, fim);
			ordena(vetor, inicio, meio);
			ordena(vetor, meio+1, fim);
		}
	}
	
	public static int particao(int[] vetor, int inicio, int fim){
		int pivo = vetor[(inicio+fim)/2];
		int i=inicio-1;
		int j=fim+1;
		while(i<j){
			do{
				j--;
			}while(vetor[j]>pivo);
			do{
				i++;
			}while(vetor[i]<pivo);
			if(i<j){
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
		return j;
	}
}
